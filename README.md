# Desafio POO - Digital Innovation One

Implementação progressiva de Programação Orientada a Objetos demonstrando os pilares fundamentais da POO através de branches estruturadas para aprendizado.

> **A branch main contém a implementação final completa.**

## Branch Atual: final

Esta branch demonstra a integração completa entre todas as classes de domínio com funcionalidades avançadas de gerenciamento de estado, relacionamentos e implementações dos métodos fundamentais do Java.

**Status**: Concluído  
**Próximo**: main

## Estrutura de Branches

| Branch | Foco | Conceitos | Status |
|--------|------|-----------|--------|
| `abstracao-encapsulamento` | Fundamentos da POO | Encapsulamento de dados, abstração de comportamentos | ✅ |
| `heranca-polimorfismo-part-1` | Hierarquia de classes | Reutilização de código através de herança | ✅ |
| `heranca-polimorfismo-part-2` | Comportamentos específicos | Sobrescrita de métodos, polimorfismo | ✅ |
| `classes-dominio` | Integração do sistema | Composição, collections, relacionamentos entre objetos | ✅ |
| `final` | **Demonstração completa** | **Integração completa dos pilares da POO** | **🔄 Atual** |

## Características da Branch Final

### Implementações Avançadas

| Funcionalidade | Classes Implementadas | Benefício |
|----------------|----------------------|-----------|
| `equals()` e `hashCode()` | Dev, Bootcamp | Comparação correta em collections |
| `toString()` | Curso, Mentoria | Representação textual legível |
| Valores de XP ajustados | Curso (20 XP), Mentoria (40 XP) | Balanceamento do sistema |
| Demonstração completa | Main.java | Fluxo completo do sistema |

### Sistema de XP Atualizado

| Conteúdo | XP Base | Bônus | Total |
|----------|---------|-------|-------|
| Curso | 10 | +10 | **20 XP** |
| Mentoria | 10 | +30 | **40 XP** |

### Funcionalidades do Sistema

- **Criação de Bootcamps**: Configuração completa com múltiplos conteúdos
- **Inscrição de Múltiplos Devs**: Sistema suporta vários desenvolvedores simultaneamente
- **Progressão Individual**: Cada dev progride independentemente
- **Cálculo de XP**: Sistema polimórfico calcula XP total automaticamente
- **Relacionamentos Bidirecionais**: Sincronização automática entre Dev ↔ Bootcamp

## Melhorias Implementadas

### 1. Métodos equals() e hashCode()

```java
// Classe Dev - Comparação por nome
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dev dev = (Dev) o;
    return nome != null ? nome.equals(dev.nome) : dev.nome == null;
}
```

### 2. Métodos toString()

```java
// Representação legível dos objetos
@Override
public String toString() {
    return "Curso{" +
            "titulo='" + getTitulo() + '\'' +
            ", cargaHoraria=" + cargaHoraria +
            '}';
}
```

### 3. Demonstração Completa

```java
// Main.java - Fluxo completo do sistema
Dev dev1 = new Dev();
dev1.setNome("Camila");
dev1.inscreverBootcamp(bootcampDio);

dev1.progedir();
dev1.progedir();
dev1.progedir();

System.out.println("XP total: " + dev1.calcularTotalXp());
```

## Início Rápido

```bash
# Navegar para esta branch
git checkout final

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
│   ├── Curso.java            # Implementação concreta - XP: 20
│   ├── Mentoria.java         # Implementação concreta - XP: 40  
│   ├── Bootcamp.java         # Gerenciador com equals/hashCode
│   └── Dev.java              # Gerenciador com equals/hashCode
└── Main.java                 # Demonstração completa integrada
```

## Fluxo Completo do Sistema

### 1. Configuração do Bootcamp
```java
Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.getConteudos().add(curso1);
bootcamp.getConteudos().add(curso2);
bootcamp.getConteudos().add(mentoria);
```

### 2. Gestão de Múltiplos Desenvolvedores
```java
Dev dev1 = new Dev();
Dev dev2 = new Dev();

dev1.inscreverBootcamp(bootcamp);
dev2.inscreverBootcamp(bootcamp);
```

### 3. Progressão Independente
```java
// Dev1 completa todos os conteúdos
dev1.progedir();
dev1.progedir();
dev1.progedir();

// Dev2 completa apenas um
dev2.progedir();
```

### 4. Comparação de Resultados
```java
System.out.println("XP Dev1: " + dev1.calcularTotalXp()); // 100 XP
System.out.println("XP Dev2: " + dev2.calcularTotalXp()); // 20 XP
```

## Conceitos POO Demonstrados

### Pilares Fundamentais
- **Abstração**: Classe `Conteudo` define contrato base
- **Encapsulamento**: Atributos privados com getters/setters
- **Herança**: `Curso` e `Mentoria` estendem `Conteudo`
- **Polimorfismo**: `calcularXp()` com comportamentos específicos

### Conceitos Avançados
- **Composição**: Collections para relacionamentos complexos
- **Sobrescrita**: `equals()`, `hashCode()`, `toString()`
- **Streams**: Processamento funcional para cálculo de XP
- **Optional**: Tratamento seguro de valores nulos

## Collections e Performance

| Collection | Uso | Complexidade | Justificativa |
|------------|-----|--------------|---------------|
| `LinkedHashSet<Conteudo>` | Dev (inscritos/concluídos) | O(1) | Ordem + unicidade |
| `HashSet<Dev>` | Bootcamp (desenvolvedores) | O(1) | Performance máxima |
| `LinkedHashSet<Conteudo>` | Bootcamp (conteúdos) | O(1) | Sequência de criação |

## Configuração de Desenvolvimento

`.gitignore` configurado para VSCode com suporte adicional para Maven, Gradle, IntelliJ IDEA e Eclipse.

---

## Navegação

<div align="center">

[![Anterior](https://img.shields.io/badge/⬅️_Anterior-classes--dominio-blue?style=for-the-badge)](../../tree/classes-dominio)
[![Próximo](https://img.shields.io/badge/Próximo_➡️-main-green?style=for-the-badge)](../../tree/main)

</div>

Esta é a implementação final.
