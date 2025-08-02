# Desafio POO - Digital Innovation One

Implementação progressiva de Programação Orientada a Objetos demonstrando os pilares fundamentais da POO através de branches estruturadas para aprendizado.

> **A branch main contém a implementação final completa.**

## Branch Atual: abstracao-encapsulamento

Esta branch demonstra a implementação dos pilares fundamentais da Programação Orientada a Objetos através de exemplos práticos em Java.

**Status**: Concluído  
**Próximo**: heranca-polimorfismo-part-1

## Estrutura de Branches

| Branch | Foco | Conceitos | Status |
|--------|------|-----------|--------|
| `abstracao-encapsulamento` | **Fundamentos da POO** | **Encapsulamento de dados, abstração de comportamentos** | **🔄 Atual** |
| `heranca-polimorfismo-part-1` | Hierarquia de classes | Reutilização de código através de herança | ⏳ |
| `heranca-polimorfismo-part-2` | Comportamentos específicos | Sobrescrita de métodos, polimorfismo | ⏳ |
| `classes-dominio` | Integração do sistema | Composição, collections, relacionamentos entre objetos | ⏳ |
| `final` | Demonstração completa | Integração completa dos pilares da POO | ⏳ |

## Conceitos Implementados

| Conceito | Implementação | Benefício |
|----------|---------------|-----------|
| **Encapsulamento** | Atributos `private` + métodos `public` | Controle de acesso aos dados |
| **Abstração** | Interface clara através de métodos bem definidos | Simplicidade de uso, detalhes internos ocultos |

## Estrutura do Projeto

```
src/
├── br/com/dio/desafio/dominio/
│   ├── Curso.java          # Implementa encapsulamento
│   └── Mentoria.java       # Implementa encapsulamento
└── Main.java               # Demonstração prática
```

## Exemplos de Código

### Curso.java
```java
public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    
    // Getters e Setters para controle de acesso
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }
}
```

### Mentoria.java
```java
public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;
    
    // Interface pública para manipulação segura
    public void setData(LocalDate data) { this.data = data; }
    public LocalDate getData() { return data; }
}
```

## Início Rápido

```bash
# Navegar para esta branch
git checkout abstracao-encapsulamento

# Compilar e executar
cd src
javac br/com/dio/desafio/dominio/*.java Main.java
java Main
```

## Aprendizado

### Encapsulamento
- **Proteção de dados** através de modificadores de acesso
- **Controle sobre como os dados** são acessados e modificados
- **Base para manutenibilidade** e segurança do código

### Abstração  
- **Simplificação da complexidade**
- **Interface clara e intuitiva** para uso das classes
- **Ocultação de detalhes** de implementação

## Recursos Recomendados

### Livros
- **"Use a Cabeça! Padrões de Projetos"** - Freeman & Robson
- **"Código Limpo"** - Robert C. Martin
- **"Java: Como Programar"** - Deitel & Deitel

### Cursos/Vídeos
- [Curso Java COMPLETO - Programação Orientada a Objetos](https://www.youtube.com/watch?v=sTX0UEplF54) - Nélio Alves
- [Loiane Groner - Java Básico](https://loiane.training/curso/java-basico)
- [DevDojo - Maratona Java](https://www.youtube.com/playlist?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW)

### Documentação
- [Oracle Java Documentation](https://docs.oracle.com/javase/)
- [Java Code Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)

## Configuração de Desenvolvimento

`.gitignore` configurado para VSCode com suporte adicional para Maven, Gradle, IntelliJ IDEA e Eclipse.

---

## Navegação

<div align="center">

[![Anterior](https://img.shields.io/badge/⬅️_Anterior-main-blue?style=for-the-badge)](../../tree/main)
[![Próximo](https://img.shields.io/badge/Próximo_➡️-heranca--polimorfismo--part--1-green?style=for-the-badge)](../../tree/heranca-polimorfismo-part-1)

</div>

Esta branch estabelece os fundamentos da POO. Os conceitos aqui aprendidos são essenciais para compreender as implementações mais avançadas nas próximas etapas.
