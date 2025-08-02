# Desafio POO - Digital Innovation One

Implementação progressiva de Programação Orientada a Objetos demonstrando os pilares fundamentais da POO através de branches estruturadas para aprendizado.

> **A branch main contém a implementação final completa.**

## Navegação Rápida

<div align="center">

[![1. Fundamentos](https://img.shields.io/badge/1-Fundamentos-blue?style=for-the-badge)](../../tree/abstracao-encapsulamento)
[![2. Herança I](https://img.shields.io/badge/2-Herança_I-purple?style=for-the-badge)](../../tree/heranca-polimorfismo-part-1)
[![3. Herança II](https://img.shields.io/badge/3-Herança_II-orange?style=for-the-badge)](../../tree/heranca-polimorfismo-part-2)
[![4. Domínio](https://img.shields.io/badge/4-Domínio-red?style=for-the-badge)](../../tree/classes-dominio)
[![5. Final](https://img.shields.io/badge/5-Final-green?style=for-the-badge)](../../tree/final)

</div>

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
javac br/com/dio/desafio/dominio/*.java Main.java
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

## Sequência de Aprendizado Recomendada

### 1. [Abstração e Encapsulamento](../../tree/abstracao-encapsulamento)
**Conceitos Base**: Aprenda os fundamentos da POO
- Encapsulamento de dados
- Abstração de comportamentos
- Modificadores de acesso

### 2. [Herança e Polimorfismo - Part 1](../../tree/heranca-polimorfismo-part-1)
**Hierarquia de Classes**: Entenda reutilização de código
- Classe abstrata e métodos abstratos
- Herança com `extends`
- Polimorfismo básico

### 3. [Herança e Polimorfismo - Part 2](../../tree/heranca-polimorfismo-part-2)
**Comportamentos Específicos**: Aprofunde polimorfismo
- Sobrescrita de métodos
- Polimorfismo avançado
- Flexibilidade de implementação

### 4. [Classes de Domínio](../../tree/classes-dominio)
**Integração do Sistema**: Veja aplicação prática
- Composição entre classes
- Collections e relacionamentos
- Gerenciamento de estado

### 5. [Versão Final](../../tree/final)
**Demonstração Completa**: Sistema totalmente integrado
- Implementação de equals/hashCode
- Métodos toString
- Sistema funcional completo

## Características da Implementação Final (Main)

### Sistema de Bootcamp Completo
- **Gestão de Desenvolvedores**: Inscrição, progressão e XP
- **Múltiplos Conteúdos**: Cursos e mentorias com valores de XP distintos
- **Collections Otimizadas**: Performance e manutenção de ordem
- **Relacionamentos Bidirecionais**: Sincronização automática

### Pilares da POO Implementados
- [ok] **Abstração**: Classe `Conteudo` define contratos
- [ok] **Encapsulamento**: Atributos protegidos com getters/setters
- [ok] **Herança**: `Curso` e `Mentoria` herdam de `Conteudo`
- [ok] **Polimorfismo**: Comportamentos específicos por tipo

## Configuração de Desenvolvimento

`.gitignore` configurado para VSCode com suporte adicional para Maven, Gradle, IntelliJ IDEA e Eclipse.

---

** Aprendizado Progressivo**: Cada branch contém explicações detalhadas dos conceitos e evolução do código passo a passo. Siga as branches sequencialmente para máximo aproveitamento.

** Objetivo**: Dominar os pilares fundamentais da Programação Orientada a Objetos através de implementação prática e progressiva.
