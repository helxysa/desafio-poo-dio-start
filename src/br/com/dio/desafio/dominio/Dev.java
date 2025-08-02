package br.com.dio.desafio.dominio;

import java.util.Set;
import java.util.LinkedHashSet;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

   
    public void inscreverBootcamp(Bootcamp bootcamp){

    }

    public void inscrever(){}


    public void calcularTotalXp(){}




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }


@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Dev dev = (Dev) o;

    return nome != null ? nome.equals(dev.nome) : dev.nome == null;
}

@Override
public int hashCode() {
    return nome != null ? nome.hashCode() : 0;
}


}
