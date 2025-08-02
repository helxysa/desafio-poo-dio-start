# Desafio POO - Digital Innovation One

Implementação progressiva de Programação Orientada a Objetos demonstrando os pilares fundamentais da POO através de branches estruturadas para aprendizado.

> **A branch main contém a implementação final completa.**

## Branch Atual: heranca-polimorfismo-part-1

Esta branch demonstra a implementação de hierarquia de classes e polimorfismo através de classe abstrata e métodos abstratos em Java.

**Status**: Concluído  
**Próximo**: heranca-polimorfismo-part-2

## Estrutura de Branches

| Branch | Foco | Conceitos | Status |
|--------|------|-----------|--------|
| `abstracao-encapsulamento` | Fundamentos da POO | Encapsulamento de dados, abstração de comportamentos | ✅ |
| `heranca-polimorfismo-part-1` | **Hierarquia de classes** | **Reutilização de código através de herança** | **🔄 Atual** |
| `heranca-polimorfismo-part-2` | Comportamentos específicos | Sobrescrita de métodos, polimorfismo | ⏳ |
| `classes-dominio` | Integração do sistema | Composição, collections, relacionamentos entre objetos | ⏳ |
| `final` | Demonstração completa | Integração completa dos pilares da POO | ⏳ |

## Conceitos Implementados

| Conceito | Implementação | Benefício |
|----------|---------------|-----------|
| **Herança** | `extends` para criar hierarquia | Reutilização de código e organização |
| **Classe Abstrata** | `abstract class` com métodos abstratos | Define contrato comum para subclasses |
| **Polimorfismo** | Métodos abstratos + `@Override` | Comportamentos específicos por classe |
| **Sobrescrita** | `@Override` em métodos herdados | Flexibilidade e extensibilidade |

## Estrutura do Projeto

```
src/
├── br/com/dio/desafio/dominio/
│   ├── Conteudo.java        # Classe abstrata base
│   ├── Curso.java           # Herda de Conteudo
│   └── Mentoria.java        # Herda de Conteudo
└── Main.java                # Demonstração prática
```

## Exemplos de Código

### Conteudo.java (Classe Abstrata)
```java
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;
    private String titulo;
    private String descricao;
    
    public abstract double calcularXp();  // Método abstrato
    
    // Getters e Setters...
}
```

### Curso.java (Classe Concreta)
```java
public class Curso extends Conteudo {
    private int cargaHoraria;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 1;  // Implementação específica
    }
}
```

### Mentoria.java (Classe Concreta)
```java
public class Mentoria extends Conteudo {
    private LocalDate data;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;  // Implementação específica
    }
}
```

## Demonstração de Polimorfismo

```java
// Polimorfismo - referência da classe pai
Conteudo conteudo1 = new Curso();
Conteudo conteudo2 = new Mentoria();

// Comportamentos específicos
System.out.println(conteudo1.calcularXp());  // 11
System.out.println(conteudo2.calcularXp());  // 30
```

## Início Rápido

```bash
# Navegar para esta branch
git checkout heranca-polimorfismo-part-1

# Compilar e executar
cd src
javac br/com/dio/desafio/dominio/*.java Main.java
java Main
```

## Aprendizado

### Herança
- **Relacionamento "é um"** entre classes
- **Reutilização de código** através de `extends`
- **Acesso a atributos e métodos** da classe pai

### Polimorfismo
- **Métodos abstratos** garantem implementação nas subclasses
- **Cada classe** pode ter comportamento específico
- **Flexibilidade** através de referências da classe pai

### Classe Abstrata
- **Não pode ser instanciada** diretamente
- **Define contrato comum** através de métodos abstratos
- **Compartilha código comum** entre subclasses

## Recursos Recomendados

### Livros
- **"Effective Java"** - Joshua Bloch
- **"Head First Design Patterns"** - Freeman & Robson
- **"Clean Code"** - Robert C. Martin

### Cursos/Vídeos
- [Java Polimorfismo - Nélio Alves](https://www.youtube.com/watch?v=jHbj8IE80HY)
- [Herança em Java - DevDojo](https://www.youtube.com/watch?v=9JpAO_cRhJc)
- [POO Completo - Curso em Vídeo](https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY)

### Documentação
- [Oracle - Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [Oracle - Abstract Methods and Classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)

## Configuração de Desenvolvimento

`.gitignore` configurado para VSCode com suporte adicional para Maven, Gradle, IntelliJ IDEA e Eclipse.

---

## Navegação

<div align="center">

[![Anterior](https://img.shields.io/badge/⬅️_Anterior-abstracao--encapsulamento-blue?style=for-the-badge)](../../tree/abstracao-encapsulamento)
[![Próximo](https://img.shields.io/badge/Próximo_➡️-heranca--polimorfismo--part--2-green?style=for-the-badge)](../../tree/heranca-polimorfismo-part-2)

</div>

Esta branch introduz os conceitos fundamentais de herança e polimorfismo, estabelecendo a base para implementações mais avançadas nas próximas etapas.
