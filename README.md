# Desafio POO - Digital Innovation One

Implementação progressiva de Programação Orientada a Objetos demonstrando os pilares fundamentais da POO através de branches estruturadas para aprendizado.

> **A branch main contém a implementação final completa.**

## Branch Atual: classes-dominio

Esta branch demonstra a implementação completa das classes de domínio com foco em herança, polimorfismo e gerenciamento de collections em Java.

**Status**: Concluído  
**Próximo**: final

## Estrutura de Branches

| Branch | Foco | Conceitos | Status |
|--------|------|-----------|--------|
| `abstracao-encapsulamento` | Fundamentos da POO | Encapsulamento de dados, abstração de comportamentos | ✅ |
| `heranca-polimorfismo-part-1` | Hierarquia de classes | Reutilização de código através de herança | ✅ |
| `heranca-polimorfismo-part-2` | Comportamentos específicos | Sobrescrita de métodos, polimorfismo | ✅ |
| `classes-dominio` | **Integração do sistema** | **Composição, collections, relacionamentos entre objetos** | **🔄 Atual** |
| `final` | Demonstração completa | Integração completa dos pilares da POO | ⏳ |

## Características da Branch Atual

### Classes de Domínio Implementadas

| Classe | Tipo | Responsabilidade |
|--------|------|------------------|
| `Conteudo` | Abstrata | Define contrato base para todos os conteúdos |
| `Curso` | Concreta | Implementa conteúdo com carga horária |
| `Mentoria` | Concreta | Implementa conteúdo com data específica |
| `Bootcamp` | Domínio | Gerencia coleção de conteúdos e desenvolvedores |
| `Dev` | Domínio | Gerencia progresso individual e cálculo de XP |

### Collections Utilizadas

| Collection | Classe | Justificativa |
|------------|--------|---------------|
| `LinkedHashSet<Conteudo>` | Dev | Mantém ordem de inscrição, evita duplicatas |
| `HashSet<Dev>` | Bootcamp | Performance O(1), ordem irrelevante |
| `LinkedHashSet<Conteudo>` | Bootcamp | Preserva sequência de criação |

### Funcionalidades Principais

- **Inscrição Automática**: `inscreverBootcamp()` cria relacionamento bidirecional
- **Progressão Linear**: `progedir()` move conteúdos seguindo ordem FIFO
- **Cálculo de XP**: Polimorfismo para diferentes valores (Curso: 11 XP, Mentoria: 30 XP)
- **Gerenciamento de Estado**: Separação entre conteúdos inscritos e concluídos

## Início Rápido

```bash
# Navegar para esta branch
git checkout classes-dominio

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
│   ├── Curso.java            # Implementação concreta - XP: 11
│   ├── Mentoria.java         # Implementação concreta - XP: 30  
│   ├── Bootcamp.java         # Gerenciador de bootcamps
│   └── Dev.java              # Gerenciador de desenvolvedores
└── Main.java                 # Demonstração completa do sistema
```

## Conceitos POO Demonstrados

### Herança e Polimorfismo
```java
public abstract class Conteudo {
    public abstract double calcularXp();
}

public class Curso extends Conteudo {
    @Override
    public double calcularXp() {
        return XP_PADRAO + 1; // 11 XP
    }
}
```

### Composição e Collections
```java
public class Dev {
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
}
```

### Relacionamentos Bidirecionais
```java
public void inscreverBootcamp(Bootcamp bootcamp){
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
}
```

## Configuração de Desenvolvimento

`.gitignore` configurado para VSCode com suporte adicional para Maven, Gradle, IntelliJ IDEA e Eclipse.

---

## Navegação

<div align="center">

[![Anterior](https://img.shields.io/badge/⬅️_Anterior-heranca--polimorfismo--part--2-blue?style=for-the-badge)](../../tree/heranca-polimorfismo-part-2)
[![Próximo](https://img.shields.io/badge/Próximo_➡️-final-green?style=for-the-badge)](../../tree/final)

</div>

Cada branch contém explicações detalhadas dos conceitos e evolução do código passo a passo. Siga as branches sequencialmente para aprendizado progressivo de POO.
