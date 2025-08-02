# Linha do Tempo - Aprendizado POO em Java

## Branch Atual: Herança e Polimorfismo Part 2

Esta branch demonstra a implementação avançada dos pilares da Programação Orientada a Objetos através de exemplos práticos em Java, focando em herança, polimorfismo e abstração.

---

## O que está sendo implementado nesta branch

### Gerenciamento de Coleções com Set
- Uso de `Set` para garantir que não haja itens duplicados
- Implementação de `equals()` e `hashCode()` para comparação correta de objetos
- Controle de acesso através de modificadores apropriados

### Classe Bootcamp
- Gerencia uma coleção de `Dev` inscritos e `Conteudo` disponíveis
- Usa `HashSet` para devs (ordem não importa) e `LinkedHashSet` para conteúdos (ordem importa)
- Implementa `equals()` e `hashCode()` para comparação de bootcamps

### Classe Dev
- Gerencia inscrições em bootcamps e progresso nos conteúdos
- Mantém duas coleções: conteúdos inscritos e conteúdos concluídos
- Implementa `equals()` e `hashCode()` baseado no nome do desenvolvedor

---

## Estrutura do Projeto

```
src/
├── br/com/dio/desafio/dominio/
│   ├── Conteudo.java        ← Classe abstrata base
│   ├── Curso.java           ← Herda de Conteudo
│   ├── Mentoria.java        ← Herda de Conteudo
│   ├── Bootcamp.java        ← Gerencia Devs e Conteúdos
│   └── Dev.java             ← Gerencia inscrições e progresso
└── Main.java                ← Demonstração do uso das classes
```

## Exemplos Implementados

### Classe Bootcamp - Gerenciamento de Coleções
```java
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate data_final = dataInicial.plusDays(45);

    // HashSet: não permite duplicatas, ordem não importa
    private Set<Dev> devsInscritos = new HashSet<>();
    
    // LinkedHashSet: não permite duplicatas, mantém ordem de inserção
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp)) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) &&
               Objects.equals(descricao, bootcamp.descricao) &&
               Objects.equals(dataInicial, bootcamp.dataInicial) &&
               Objects.equals(data_final, bootcamp.data_final) &&
               Objects.equals(devsInscritos, bootcamp.devsInscritos) &&
               Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, data_final, devsInscritos, conteudos);
    }
}
```

### Classe Dev - Controle de Progresso
```java
public class Dev {
    private String nome;
    
    // LinkedHashSet: mantém ordem de inscrição
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    
    // LinkedHashSet: mantém ordem de conclusão
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome != null ? nome.equals(dev.nome) : dev.nome == null;
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
}
```

### Por que usar Set?

#### HashSet vs LinkedHashSet
- **HashSet**: Não permite duplicatas, ordem não importa
  - Usado para `devsInscritos` porque a ordem dos devs não importa
  - Mais eficiente para operações de busca

- **LinkedHashSet**: Não permite duplicatas, mantém ordem de inserção
  - Usado para `conteudos` porque a ordem dos conteúdos importa
  - Usado para `conteudosInscritos` e `conteudosConcluidos` para manter cronologia

#### equals() e hashCode()
- **equals()**: Define quando dois objetos são considerados iguais
- **hashCode()**: Gera um código hash baseado nos atributos do objeto
- **Importância**: O `Set` usa esses métodos para detectar duplicatas

---

## Como executar

1. Clone o repositório
2. Navegue para esta branch: `git checkout "Heranca e Polimorfismo Part 2"`
3. Execute o arquivo `Main.java` para ver os exemplos em ação

```bash
cd src
javac Main.java
java Main
```

---

## Conceitos Aprendidos

### Gerenciamento de Coleções
- **O que é**: Uso de estruturas de dados para organizar objetos relacionados
- **Como implementamos**: `Set` para evitar duplicatas, `HashSet` e `LinkedHashSet` para diferentes necessidades
- **Benefício**: Controle total sobre os dados, evitando inconsistências

### equals() e hashCode()
- **O que é**: Métodos que definem como objetos são comparados e organizados
- **Como implementamos**: Sobrescrita baseada nos atributos relevantes de cada classe
- **Benefício**: Funcionamento correto das coleções e comparações precisas

### HashSet vs LinkedHashSet
- **HashSet**: Para quando a ordem não importa (devs inscritos)
- **LinkedHashSet**: Para quando a ordem importa (conteúdos, progresso)
- **Benefício**: Performance otimizada e controle sobre a organização dos dados

### Controle de Duplicatas
- **O que é**: Prevenção de itens repetidos nas coleções
- **Como implementamos**: Uso de `Set` + implementação correta de `equals()` e `hashCode()`
- **Benefício**: Integridade dos dados e comportamento previsível

---

## Notas da Branch

Esta branch representa o avanço no aprendizado de POO. Aqui focamos em:
- Gerenciar coleções de objetos sem duplicatas
- Implementar comparações corretas com `equals()` e `hashCode()`
- Escolher a estrutura de dados adequada para cada necessidade
- Manter a integridade dos dados através de controles apropriados

**Status**: Concluído  
**Próximo**: Implementações futuras com interfaces e composição 
