# Linha do Tempo - Aprendizado POO em Java

## Branch Atual: Herança e Polimorfismo - Part 1

Esta branch demonstra a implementação dos pilares de Herança e Polimorfismo da Programação Orientada a Objetos através de exemplos práticos em Java.

---

## O que está sendo implementado nesta branch

### Herança
- Criação de hierarquia entre classes através de `extends`
- Reutilização de código através de herança
- Uso de classe abstrata como base (`Conteudo`)
- Herança de atributos e métodos da classe pai

### Polimorfismo
- Métodos abstratos com implementações diferentes
- Sobrescrita de métodos (`@Override`)
- Polimorfismo de referência (referência da classe pai)
- Comportamentos específicos para cada subclasse

---

## Estrutura do Projeto

```
src/
├── br/com/dio/desafio/dominio/
│   ├── Conteudo.java        ← Classe abstrata (classe pai)
│   ├── Curso.java           ← Classe filha que herda de Conteudo
│   └── Mentoria.java        ← Classe filha que herda de Conteudo
└── Main.java                ← Demonstração do uso das classes
```

## Exemplos Implementados

### Classe Abstrata Conteudo (Classe Pai)
```java
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
```

### Classe Curso (Herda de Conteudo)
```java
public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 1;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
```

### Classe Mentoria (Herda de Conteudo)
```java
public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria(){
        
    }

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
```

---

## Como executar

1. Clone o repositório
2. Navegue para esta branch: `git checkout "Heranca e Polimorfismo Part 1"`
3. Execute o arquivo `Main.java` para ver os exemplos em ação

```bash
cd src
javac Main.java
java Main
```

---


## Conceitos Aprendidos

### Herança
- **O que é**: Relacionamento "é um" entre classes, onde uma classe herda características de outra
- **Como implementamos**: Usando `extends` para criar hierarquia de classes
- **Benefício**: Reutilização de código e organização hierárquica

### Classe Abstrata
- **O que é**: Classe que não pode ser instanciada diretamente, serve como modelo
- **Como implementamos**: Usando `abstract class` e métodos `abstract`
- **Benefício**: Define contrato comum para classes filhas

### Polimorfismo
- **O que é**: Capacidade de um objeto se comportar de diferentes formas
- **Como implementamos**: Métodos abstratos com implementações específicas + `@Override`
- **Benefício**: Flexibilidade e extensibilidade do código

### Sobrescrita de Métodos
- **O que é**: Redefinição de métodos herdados da classe pai
- **Como implementamos**: Usando `@Override` para métodos abstratos e toString
- **Benefício**: Comportamentos específicos para cada subclasse

---

## Demonstração no Main.java

### Primeira Forma - Encapsulamento e Abstração
```java
Curso curso1 = new Curso();
curso1.setTitulo("Curso Java");
curso1.setDescricao("Aprender os paradigmas da programacao com Java");
curso1.setCargaHoraria(100);

Mentoria mentoria = new Mentoria();
mentoria.setTitulo("Mentoria Java");
mentoria.setDescricao("Mentoria sobre Java e boas práticas");
mentoria.setData(LocalDate.now());
```

### Segunda Forma - Herança e Polimorfismo
```java
Conteudo conteudo1 = new Curso();
conteudo1.setTitulo("curso de heranca");
conteudo1.setDescricao("aprender os conceitos de heranca e polimorfismo");

Conteudo conteudo2 = new Mentoria();
conteudo2.setTitulo("mentoria em java");
conteudo2.setDescricao("mentoria em java");
```

---

## Notas da Branch

Esta branch representa o segundo passo no aprendizado de POO. Aqui focamos em:
- Entender como criar hierarquias de classes com herança
- Implementar polimorfismo através de métodos abstratos
- Usar sobrescrita de métodos para comportamentos específicos
- Aplicar o conceito de "é um" na modelagem de classes

**Status**: Concluído  
**Próximo**: Polimorfismo Avançado com Interfaces
