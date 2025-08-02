# Desafio POO - Digital Innovation One

## Sobre o Projeto

Este repositório contém a implementação do **Desafio de Programação Orientada a Objetos** da Digital Innovation One, demonstrando a evolução progressiva dos conceitos de POO através de branches organizadas por etapas de aprendizado.

---

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
```

---

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
```

---



**Status Geral**: Projeto completo com todas as etapas implementadas  
**Última Atualização**: Branch final com sistema completo funcionando

