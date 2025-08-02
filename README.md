# Herança e Polimorfismo - Part 2

Implementação avançada de gerenciamento de coleções, relacionamentos entre objetos e controle de duplicatas através de classes de domínio.

> **Branch original**: [heranca-polimorfismo-part-2](https://github.com/helxysa/desafio-poo-dio-start/tree/heranca-polimorfismo-part-2)

## Conceitos Implementados

| Conceito | Implementação | Benefício |
|----------|---------------|-----------|
| **Coleções Set** | `HashSet` e `LinkedHashSet` | Controle de duplicatas e ordem |
| **equals() e hashCode()** | Sobrescrita baseada em atributos relevantes | Comparação correta de objetos |
| **Relacionamentos** | Associações bidirecionais entre classes | Integridade referencial |
| **Gerenciamento de Estado** | Controle de progresso e inscrições | Consistência de dados |

## Estrutura do Projeto

```
src/
├── br/com/dio/desafio/dominio/
│   ├── Conteudo.java        # Classe abstrata base
│   ├── Curso.java           # Herda de Conteudo
│   ├── Mentoria.java        # Herda de Conteudo
│   ├── Bootcamp.java        # Gerencia Devs e Conteúdos
│   └── Dev.java             # Gerencia inscrições e progresso
└── Main.java                # Demonstração do sistema
```

## Exemplos de Código

### Bootcamp.java - Gerenciamento de Coleções
```java
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    
    // HashSet: ordem não importa para devs
    private Set<Dev> devsInscritos = new HashSet<>();
    
    // LinkedHashSet: ordem importa para conteúdos
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp)) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) &&
               Objects.equals(descricao, bootcamp.descricao);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal);
    }
}
```

### Dev.java - Controle de Progresso
```java
public class Dev {
    private String nome;
    
    // LinkedHashSet: mantém ordem de inscrição/conclusão
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
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

## Escolha das Coleções

### HashSet vs LinkedHashSet

| Tipo | Uso | Razão |
|------|-----|-------|
| `HashSet<Dev>` | Devs inscritos | Ordem não importa, performance otimizada |
| `LinkedHashSet<Conteudo>` | Conteúdos do bootcamp | Ordem de inserção importa |
| `LinkedHashSet<Conteudo>` | Progresso do dev | Mantém cronologia de inscrição/conclusão |

## Demonstração do Sistema

```java
// Criar bootcamp
Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(curso2);
bootcamp.getConteudos().add(mentoria);

// Controle de duplicatas garantido pelo Set + equals()/hashCode()
Set<Dev> devs = bootcamp.getDevsInscritos();
```

## Execução

```bash
cd src
javac Main.java
java Main
```

## Aprendizado

### Gerenciamento de Coleções
- `Set` previne duplicatas automaticamente
- `HashSet` para performance, `LinkedHashSet` para ordem
- Escolha da estrutura baseada na necessidade

### equals() e hashCode()
- Fundamentais para funcionamento correto das coleções
- Implementação baseada em atributos que definem identidade
- Contrato: objetos iguais devem ter mesmo hashCode

### Controle de Duplicatas
- Prevenção automática de itens repetidos
- Integridade dos dados garantida
- Comportamento previsível das coleções

## Recursos Recomendados

### Livros
- **"Effective Java"** - Joshua Bloch (Cap. 3: equals/hashCode)
- **"Java Collections Framework"** - Maurice Naftalin
- **"Clean Code"** - Robert C. Martin

### Cursos/Vídeos
- [Collections em Java - Nélio Alves](https://www.youtube.com/watch?v=QRM9t6kOOlE)
- [equals() e hashCode() - DevDojo](https://www.youtube.com/watch?v=ggW-NKOXYsM)
- [Set Interface - DevDojo](https://www.youtube.com/watch?v=HgPquVqZs-c)

### Documentação
- [Java Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/)
- [Object.equals() Contract](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-)

---

**Branch anterior**: [heranca-polimorfismo-part-1](https://github.com/helxysa/desafio-poo-dio-start/tree/heranca-polimorfismo-part-1) | **Status**: Concluído | **Próximo**: [classes-dominio](https://github.com/helxysa/desafio-poo-dio-start/tree/classes-dominio)
