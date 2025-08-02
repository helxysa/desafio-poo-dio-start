# Análise das Classes de Domínio - Herança e Polimorfismo

## Branch Atual: classes-dominio

Esta branch demonstra a implementação completa das classes de domínio com foco em herança, polimorfismo e gerenciamento de collections em Java.

**Status**: Concluído  
**Próximo**: final

## Estrutura das Classes de Domínio

### 1. Classe Abstrata `Conteudo`
```java
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;
    private String titulo;
    private String descricao;
    
    public abstract double calcularXp();
}
```

**Características:**
- **Abstração**: Define o contrato para todos os tipos de conteúdo
- **Polimorfismo**: Método `calcularXp()` abstrato permite implementações específicas
- **Encapsulamento**: Atributos privados com getters/setters

### 2. Classes Concretas: `Curso` e `Mentoria`

**Curso:**
```java
public class Curso extends Conteudo {
    private int cargaHoraria;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 1; // 11 XP
    }
}
```

**Mentoria:**
```java
public class Mentoria extends Conteudo {
    private LocalDate data;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d; // 30 XP
    }
}
```

**Herança e Polimorfismo:**
- Ambas herdam de `Conteudo`
- Implementam `calcularXp()` de forma específica
- Mentoria vale mais XP (30) que Curso (11)

### 3. Classe `Bootcamp`
```java
public class Bootcamp {
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
}
```

### 4. Classe `Dev`
```java
public class Dev {
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
}
```

---

## Collections Utilizadas e Justificativas

### 1. `LinkedHashSet<Conteudo>` em Dev
```java
private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
```

**Por que LinkedHashSet?**
- **Sem duplicatas**: `Set` garante que não há conteúdos repetidos
- **Ordem de inserção**: `LinkedHashSet` mantém a ordem em que os conteúdos foram adicionados
- **Performance**: O(1) para operações de adição/remoção/busca
- **Uso prático**: Importante manter ordem cronológica dos conteúdos inscritos

### 2. `HashSet<Dev>` em Bootcamp
```java
private Set<Dev> devsInscritos = new HashSet<>();
```

**Por que HashSet?**
- **Sem duplicatas**: Evita que o mesmo dev se inscreva múltiplas vezes
- **Performance**: O(1) para operações principais
- **Ordem não importa**: A ordem dos devs inscritos não é relevante

### 3. `LinkedHashSet<Conteudo>` em Bootcamp
```java
private Set<Conteudo> conteudos = new LinkedHashSet<>();
```

**Por que LinkedHashSet?**
- **Ordem de criação**: Mantém a ordem em que os conteúdos foram criados
- **Sem duplicatas**: Evita conteúdos repetidos no bootcamp
- **Sequência lógica**: Importante para a progressão do bootcamp

---

## Lógica dos Métodos Principais

### 1. `inscreverBootcamp(Bootcamp bootcamp)`
```java
public void inscreverBootcamp(Bootcamp bootcamp){
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
}
```

**Lógica:**
1. **Adiciona todos os conteúdos**: `addAll()` copia todos os conteúdos do bootcamp para a lista do dev
2. **Registra o dev**: Adiciona o dev à lista de inscritos do bootcamp
3. **Bidirecional**: Cria relacionamento duplo entre dev e bootcamp

**Antes da implementação automática:**
- Era necessário adicionar o dev manualmente ao bootcamp
- Agora é automático, garantindo consistência

### 2. `progedir()`
```java
public void progedir() {
    Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
    if (conteudo.isPresent()) {
        this.conteudosConcluidos.add(conteudo.get());
        this.conteudosInscritos.remove(conteudo.get());
    } else {
        System.err.println("Voce nao esta matriculado em nenhum conteudo");
    }
}
```

**Lógica:**
1. **Pega o primeiro**: `findFirst()` pega o primeiro conteúdo da lista (ordem de inscrição)
2. **Move entre coleções**: Remove de `conteudosInscritos` e adiciona em `conteudosConcluidos`
3. **Validação**: Verifica se há conteúdos para progredir
4. **FIFO**: Segue a ordem de inscrição (primeiro a entrar, primeiro a sair)

### 3. `calcularTotalXp()`
```java
public double calcularTotalXp() {
    return this.conteudosConcluidos.stream()
            .mapToDouble(conteudo -> conteudo.calcularXp())
            .sum();
}
```

**Lógica:**
1. **Stream dos concluídos**: Processa apenas conteúdos finalizados
2. **Polimorfismo**: `calcularXp()` é chamado dinamicamente (Curso=11, Mentoria=30)
3. **Soma total**: Acumula XP de todos os conteúdos concluídos

---

## Integração Simples no Main

```java
Dev devEu = new Dev();
devEu.setNome("heloysa");
devEu.inscreverBootcamp(bootcampJava);

System.out.printf("Os conteudos do dev %s são os seguintes: %n", devEu.getNome());
for (Conteudo conteudo : devEu.getConteudosInscritos()) {
    System.out.println(conteudo);
}
```

**Fluxo de Integração:**
1. **Criação**: Dev é instanciado e nomeado
2. **Inscrição**: `inscreverBootcamp()` automaticamente:
   - Adiciona todos os conteúdos do bootcamp ao dev
   - Registra o dev no bootcamp
3. **Exibição**: Itera sobre `conteudosInscritos` usando `LinkedHashSet` (ordem preservada)

---

## Benefícios da Arquitetura

### 1. **Flexibilidade**
- Novos tipos de conteúdo podem ser adicionados facilmente
- Polimorfismo permite comportamentos específicos

### 2. **Consistência**
- Collections garantem integridade dos dados
- Relacionamentos bidirecionais mantêm sincronização

### 3. **Performance**
- `HashSet` e `LinkedHashSet` oferecem operações O(1)
- Streams permitem processamento eficiente

### 4. **Manutenibilidade**
- Separação clara de responsabilidades
- Código reutilizável e extensível

---

## Conceitos POO Aplicados

1. **Herança**: `Curso` e `Mentoria` herdam de `Conteudo`
2. **Polimorfismo**: `calcularXp()` implementado diferentemente
3. **Encapsulamento**: Atributos privados com acesso controlado
4. **Abstração**: `Conteudo` define contrato sem implementação
5. **Composição**: Classes usam collections para relacionamentos 
