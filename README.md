# Desafio POO - Digital Innovation One

## Sobre o Projeto

Este repositório contém a implementação do **Desafio de Programação Orientada a Objetos** da Digital Innovation One, demonstrando a evolução progressiva dos conceitos de POO através de branches organizadas por etapas de aprendizado.
# Branch Final - Integração Completa das Classes de Domínio

## Status:  Concluído

Esta é a versão final do projeto, demonstrando a integração completa entre todas as classes de domínio com funcionalidades avançadas de gerenciamento de estado e relacionamentos.

## Estrutura das Classes de Domínio

##  Estrutura de Branches

### **$ abstracao-encapsulamento**
- **Objetivo**: Implementar os primeiros pilares da POO
- **Conceitos**: Encapsulamento de dados e abstração de comportamentos
- **Classes**: `Curso` e `Mentoria` com atributos privados e métodos públicos

### **$ heranca-polimorfismo-part-1**
- **Objetivo**: Estabelecer hierarquia entre classes
- **Conceitos**: Reutilização de código através de herança
- **Implementação**: Classe abstrata `Conteudo` como base para `Curso` e `Mentoria`

### **$ heranca-polimorfismo-part-2**
- **Objetivo**: Implementar comportamentos específicos
- **Conceitos**: Sobrescrita de métodos e polimorfismo
- **Implementação**: Método `calcularXp()` com comportamentos diferentes por classe

### **$ classes-dominio**
- **Objetivo**: Integrar todos os conceitos em um sistema completo
- **Conceitos**: Composição, collections e relacionamentos entre objetos
- **Implementação**: Classes `Bootcamp` e `Dev` com gerenciamento de estado

### **$ final**
- **Objetivo**: Demonstração final com todas as funcionalidades
- **Conceitos**: Integração completa dos pilares da POO
- **Implementação**: Sistema de gerenciamento de bootcamps com progressão de devs

---

## Estrutura do Projeto

```
src/
├── br/com/dio/desafio/dominio/
│   ├── Conteudo.java         ← Classe abstrata (Branch 2+)
│   ├── Curso.java            ← Classe concreta
│   ├── Mentoria.java         ← Classe concreta
│   ├── Bootcamp.java         ← Classe de domínio (Branch 4+)
│   └── Dev.java              ← Classe de domínio (Branch 4+)
└── Main.java                 ← Demonstração do sistema
=======
### 1. Classe Abstrata `Conteudo`
```java
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;
    private String titulo;
    private String descricao;
    
    public abstract double calcularXp();
}
```

### 2. Classes Concretas: `Curso` e `Mentoria`

**Curso:**
```java
public class Curso extends Conteudo {
    private int cargaHoraria;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 10;
    }
}
```

**Mentoria:**
```java
public class Mentoria extends Conteudo {
    private LocalDate data;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 30d;
    }
}
```

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
>>>>>>> e181ba8efebe19af6d3ffd423d6c97872b0cfbab
```

---

<<<<<<< HEAD
## Objetivos do Desafio

### **Aprendizado Progressivo**
- Compreender cada pilar da POO de forma isolada
- Evoluir gradualmente para implementações mais complexas
- Aplicar conceitos teóricos em cenários práticos

### **Desenvolvimento de Habilidades**
- Implementação de classes bem estruturadas
- Uso adequado de modificadores de acesso
- Aplicação de herança e polimorfismo
- Gerenciamento de relacionamentos entre objetos

### **Boas Práticas**
- Código limpo e bem documentado
- Separação clara de responsabilidades
- Uso apropriado de collections Java
- Implementação de métodos equals(), hashCode() e toString()

---

## Como Navegar pelas Branches

### **Para Estudar Progressivamente:**
```bash
# Branch 1: Conceitos básicos
git checkout abstracao-encapsulamento

# Branch 2: Herança
git checkout heranca-polimorfismo-part-1

# Branch 3: Polimorfismo
git checkout heranca-polimorfismo-part-2

# Branch 4: Classes de domínio
git checkout classes-dominio

# Branch Final: Sistema completo
git checkout final
```

### **Para Executar:**
```bash
cd src
javac Main.java
java Main
=======
## Collections Utilizadas

### 1. `LinkedHashSet<Conteudo>` em Dev
```java
private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
```

### 2. `HashSet<Dev>` em Bootcamp
```java
private Set<Dev> devsInscritos = new HashSet<>();
```

### 3. `LinkedHashSet<Conteudo>` em Bootcamp
```java
private Set<Conteudo> conteudos = new LinkedHashSet<>();
>>>>>>> e181ba8efebe19af6d3ffd423d6c97872b0cfbab
```

---

<<<<<<< HEAD
=======
## Métodos Principais

### 1. `inscreverBootcamp(Bootcamp bootcamp)`
```java
public void inscreverBootcamp(Bootcamp bootcamp){
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
}
```

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

### 3. `calcularTotalXp()`
```java
public double calcularTotalXp() {
    return this.conteudosConcluidos.stream()
            .mapToDouble(conteudo -> conteudo.calcularXp())
            .sum();
}
```

---

## Integração no Main.java

```java
Dev devEu = new Dev();
devEu.setNome("heloysa");
devEu.inscreverBootcamp(bootcampJava);

System.out.printf("Os conteudos do dev %s são os seguintes: %n", devEu.getNome());
for (Conteudo conteudo : devEu.getConteudosInscritos()) {
    System.out.println(conteudo);
}
```



**Status Geral**: Projeto completo com todas as etapas implementadas  
**Última Atualização**: Branch final com sistema completo funcionando
## Conceitos POO Aplicados

1. **Herança**: `Curso` e `Mentoria` herdam de `Conteudo`
2. **Polimorfismo**: `calcularXp()` implementado diferentemente
3. **Encapsulamento**: Atributos privados com acesso controlado
4. **Abstração**: `Conteudo` define contrato sem implementação
5. **Composição**: Classes usam collections para relacionamentos

---

## Últimas Alterações Implementadas

### 1. **Implementação de equals() e hashCode()**

**Classe Dev:**
```java
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
```

**Classe Bootcamp:**
```java
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
```

### 2. **Implementação de toString()**

**Classe Curso:**
```java
@Override
public String toString() {
    return "Curso{" +
            "titulo='" + getTitulo() + '\'' +
            ", descricao='" + getDescricao() + '\'' +
            ", cargaHoraria=" + cargaHoraria +
            '}';
}
```

**Classe Mentoria:**
```java
@Override
public String toString() {
    return "Mentoria{" +
            "titulo='" + getTitulo() + '\'' +
            ", descricao='" + getDescricao() + '\'' +
            ", data=" + data +
            '}';
}
```

### 3. **Correção dos Valores de XP**

**Antes:**
- Curso: XP_PADRAO + 1 = 11 XP
- Mentoria: XP_PADRAO + 20 = 30 XP

**Agora:**
- Curso: XP_PADRAO + 10 = 20 XP
- Mentoria: XP_PADRAO + 30 = 40 XP

### 4. **Melhorias no Main.java**

**Demonstração Completa do Sistema:**
```java
Dev dev1 = new Dev();
dev1.setNome("Camila");
dev1.inscreverBootcamp(bootcampDio);

Dev dev2 = new Dev();
dev2.setNome("Jorge");
dev2.inscreverBootcamp(bootcampDio);

dev1.progedir();
dev1.progedir();
dev1.progedir();

System.out.println("XP total da Dev " + dev1.getNome() + ": " + dev1.calcularTotalXp());
```

---

## Interligações Entre Classes

### 1. **Relacionamento Dev ↔ Bootcamp**

```java
dev.inscreverBootcamp(bootcamp);
```

### 2. **Relacionamento Dev ↔ Conteudo**

```java
Set<Conteudo> conteudosInscritos;
Set<Conteudo> conteudosConcluidos;

dev.progedir();
```

### 3. **Relacionamento Bootcamp ↔ Conteudo**

```java
Set<Conteudo> conteudos = new LinkedHashSet<>();
conteudos.add(curso1);
conteudos.add(curso2);
conteudos.add(mentoria);
```

---

## Fluxo do Sistema

### 1. **Criação do Bootcamp**
```java
Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java");
bootcamp.setDescricao("Aprenda Java do zero ao avançado");
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(curso2);
bootcamp.getConteudos().add(mentoria);
```

### 2. **Inscrição de Devs**
```java
Dev dev = new Dev();
dev.setNome("João");
dev.inscreverBootcamp(bootcamp);
```

### 3. **Progressão do Dev**
```java
dev.progedir();
dev.progedir();
dev.progedir();
```

### 4. **Múltiplos Devs**
```java
Dev dev1 = new Dev();
Dev dev2 = new Dev();

dev1.inscreverBootcamp(bootcamp);
dev2.inscreverBootcamp(bootcamp);

dev1.progedir();
```

---

## Conceitos POO Demonstrados

1. **Herança**: Hierarquia Conteudo → Curso/Mentoria
2. **Polimorfismo**: calcularXp() implementado diferentemente
3. **Encapsulamento**: Atributos privados com acesso controlado
4. **Abstração**: Conteudo define contrato abstrato
5. **Composição**: Classes usam collections para relacionamentos
6. **Sobrescrita**: equals(), hashCode(), toString() customizados

---

**Status Final**: Sistema completo e funcional com todas as classes de domínio integradas e relacionamentos estabelecidos. 
