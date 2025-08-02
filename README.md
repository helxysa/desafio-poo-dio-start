# Linha do Tempo - Aprendizado POO em Java

## Branch Atual: Abstração e Encapsulamento

Esta branch demonstra a implementação dos primeiros pilares da Programação Orientada a Objetos através de exemplos práticos em Java.

---

## O que está sendo implementado nesta branch

### Encapsulamento
- Controle de acesso aos dados através de modificadores de acesso (`private`, `public`)
- Implementação de métodos getters e setters para manipulação segura dos atributos
- Proteção dos dados internos das classes

### Abstração
- Definição clara dos comportamentos essenciais das classes
- Ocultação de detalhes de implementação
- Interface simples e intuitiva para uso das classes

---

## Estrutura do Projeto

```
src/
├── br/com/dio/desafio/dominio/
│   ├── Curso.java          ← Classe que implementa encapsulamento
│   └── Mentoria.java       ← Classe que implementa encapsulamento
└── Main.java               ← Demonstração do uso das classes
```

## Exemplos Implementados

### Classe Curso
```java
public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    
    public void setTitulo(String titulo) { ... }
    public String getTitulo() { ... }
}
```

### Classe Mentoria
```java
public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;
    
    public void setTitulo(String titulo) { ... }
    public String getTitulo() { ... }
}
```

---

## Como executar

1. Clone o repositório
2. Navegue para esta branch: `git checkout "Abstracao e Encapsulamento"`
3. Execute o arquivo `Main.java` para ver os exemplos em ação

```bash
cd src
javac Main.java
java Main
```

---

## Conceitos Aprendidos

### Encapsulamento
- **O que é**: Proteção dos dados através de modificadores de acesso
- **Como implementamos**: Atributos `private` + métodos `public` para acesso
- **Benefício**: Controle total sobre como os dados são acessados e modificados

### Abstração
- **O que é**: Simplificação da complexidade, mostrando apenas o essencial
- **Como implementamos**: Interface clara através de métodos bem definidos
- **Benefício**: Facilita o uso das classes, ocultando detalhes internos

---

## Notas da Branch

Esta branch representa o primeiro passo no aprendizado de POO. Aqui focamos em:
- Entender como proteger dados com encapsulamento
- Criar interfaces simples e intuitivas
- Estabelecer boas práticas de programação

**Status**: Concluído  
**Próximo**: herança-polimorfismo-part-1

