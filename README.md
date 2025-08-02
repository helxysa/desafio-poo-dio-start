# Desafio POO - Digital Innovation One

Implementação progressiva de Programação Orientada a Objetos demonstrando os pilares fundamentais da POO através de branches estruturadas para aprendizado.

> **A branch main contém a implementação final completa.**

## Estrutura de Branches

| Branch | Foco | Conceitos |
|--------|------|-----------|
| `abstracao-encapsulamento` | Fundamentos da POO | Encapsulamento de dados, abstração de comportamentos |
| `heranca-polimorfismo-part-1` | Hierarquia de classes | Reutilização de código através de herança |
| `heranca-polimorfismo-part-2` | Comportamentos específicos | Sobrescrita de métodos, polimorfismo |
| `classes-dominio` | Integração do sistema | Composição, collections, relacionamentos entre objetos |
| `final` | Demonstração completa | Integração completa dos pilares da POO |

## Início Rápido

```bash
# Navegar para o estágio de aprendizado desejado
git checkout <nome-da-branch>

# Compilar e executar
cd src
javac Main.java
java Main
```

## Estrutura do Projeto

```
src/
├── br/com/dio/desafio/dominio/
│   ├── Conteudo.java         # Classe abstrata base
│   ├── Curso.java            # Implementação concreta
│   ├── Mentoria.java         # Implementação concreta  
│   ├── Bootcamp.java         # Classe de domínio
│   └── Dev.java              # Classe de domínio
└── Main.java                 # Demonstração do sistema
```

## Configuração de Desenvolvimento

`.gitignore` configurado para VSCode com suporte adicional para Maven, Gradle, IntelliJ IDEA e Eclipse.

---

Cada branch contém explicações detalhadas dos conceitos e evolução do código passo a passo. Siga as branches sequencialmente para aprendizado progressivo de POO.
