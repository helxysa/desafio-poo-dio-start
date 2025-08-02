# Desafio POO - Digital Innovation One

## Sobre o Projeto

Este repositório contém a implementação do **Desafio de Programação Orientada a Objetos** da Digital Innovation One, demonstrando a evolução progressiva dos conceitos de POO através de branches organizadas por etapas de aprendizado.

## Estrutura de Branches

### **`abstracao-encapsulamento`**
- **Objetivo**: Implementar os primeiros pilares da POO
- **Conceitos**: Encapsulamento de dados e abstração de comportamentos

### **`heranca-polimorfismo-part-1`**
- **Objetivo**: Estabelecer hierarquia entre classes
- **Conceitos**: Reutilização de código através de herança

### **`heranca-polimorfismo-part-2`**
- **Objetivo**: Implementar comportamentos específicos
- **Conceitos**: Sobrescrita de métodos e polimorfismo

### **`classes-dominio`**
- **Objetivo**: Integrar todos os conceitos em um sistema completo
- **Conceitos**: Composição, collections e relacionamentos entre objetos

### **`final`**
- **Objetivo**: Demonstração final com todas as funcionalidades
- **Conceitos**: Integração completa dos pilares da POO

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

## Como Compilar e Executar

```bash
# Navegue até o diretório src
cd src

# Compile o projeto
javac Main.java

# Execute o programa
java Main
```

## Estrutura do Projeto

```
src/
├── br/com/dio/desafio/dominio/
│   ├── Conteudo.java         ← Classe abstrata
│   ├── Curso.java            ← Classe concreta
│   ├── Mentoria.java         ← Classe concreta
│   ├── Bootcamp.java         ← Classe de domínio
│   └── Dev.java              ← Classe de domínio
└── Main.java                 ← Demonstração do sistema
```

## Configuração do Ambiente

O `.gitignore` está configurado para VSCode, mas inclui configurações adicionais para diferentes IDEs e gerenciadores de build (Maven, Gradle, IntelliJ, Eclipse).

---

**Nota**: Cada branch contém explicações detalhadas dos conceitos implementados e passo a passo da evolução do código. Navegue pelas branches para acompanhar o aprendizado progressivo dos pilares da POO.
