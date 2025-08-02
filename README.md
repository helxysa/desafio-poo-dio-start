# 🚀 Linha do Tempo - Aprendizado POO em Java

## 📍 Branch Atual: **Abstração e Encapsulamento**

Esta branch demonstra a implementação dos primeiros pilares da Programação Orientada a Objetos através de exemplos práticos em Java.

---

## 🎯 O que está sendo implementado nesta branch

### **Encapsulamento**
- ✅ Controle de acesso aos dados através de modificadores de acesso (`private`, `public`)
- ✅ Implementação de métodos getters e setters para manipulação segura dos atributos
- ✅ Proteção dos dados internos das classes

### **Abstração**
- ✅ Definição clara dos comportamentos essenciais das classes
- ✅ Ocultação de detalhes de implementação
- ✅ Interface simples e intuitiva para uso das classes

---

## 📁 Estrutura do Projeto (Branch Atual)

```
src/
├── br/com/dio/desafio/dominio/
│   ├── Curso.java          ← Classe que implementa encapsulamento
│   └── Mentoria.java       ← Classe que implementa encapsulamento
└── Main.java               ← Demonstração do uso das classes
```

## 🔍 Exemplos Implementados

### **Classe Curso**
```java
public class Curso {
    private String titulo;      // Encapsulamento: atributo privado
    private String descricao;   // Encapsulamento: atributo privado
    private int cargaHoraria;   // Encapsulamento: atributo privado
    
    // Getters e Setters para acesso controlado
    public void setTitulo(String titulo) { ... }
    public String getTitulo() { ... }
    // ... outros métodos
}
```

### **Classe Mentoria**
```java
public class Mentoria {
    private String titulo;      // Encapsulamento: atributo privado
    private String descricao;   // Encapsulamento: atributo privado
    private LocalDate data;     // Encapsulamento: atributo privado
    
    // Getters e Setters para acesso controlado
    public void setTitulo(String titulo) { ... }
    public String getTitulo() { ... }
    // ... outros métodos
}
```

---

## 🛠️ Como executar

1. Clone o repositório
2. Navegue para esta branch: `git checkout "Abstracao e Encapsulamento"`
3. Execute o arquivo `Main.java` para ver os exemplos em ação

```bash
cd src
javac Main.java
java Main
```

---

## 📈 Próximas Branches (Linha do Tempo)

### **Branch 2: Herança**
- Implementação de hierarquia entre classes
- Reutilização de código através de herança
- Uso de `extends` e `super`

### **Branch 3: Polimorfismo**
- Métodos com comportamentos diferentes
- Sobrescrita de métodos
- Interfaces e implementações

### **Branch 4: Projeto Completo**
- Integração de todos os conceitos
- Sistema completo de gerenciamento de cursos
- Aplicação prática dos pilares da POO

---

## 🎓 Conceitos Aprendidos

### **Encapsulamento**
- **O que é**: Proteção dos dados através de modificadores de acesso
- **Como implementamos**: Atributos `private` + métodos `public` para acesso
- **Benefício**: Controle total sobre como os dados são acessados e modificados

### **Abstração**
- **O que é**: Simplificação da complexidade, mostrando apenas o essencial
- **Como implementamos**: Interface clara através de métodos bem definidos
- **Benefício**: Facilita o uso das classes, ocultando detalhes internos

---

## 🔗 Links Úteis

- [Documentação Java - Encapsulamento](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- [Programação Orientada a Objetos - Conceitos Básicos](https://docs.oracle.com/javase/tutorial/java/concepts/)

---

## 📝 Notas da Branch

Esta branch representa o **primeiro passo** no aprendizado de POO. Aqui focamos em:
- Entender como proteger dados com encapsulamento
- Criar interfaces simples e intuitivas
- Estabelecer boas práticas de programação

**Status**: ✅ Concluído  
**Próximo**: Herança
