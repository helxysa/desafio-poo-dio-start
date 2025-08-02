package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    
    private String titulo;
    private String descricao;
    private LocalDate data;


    public Mentoria(){
        
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao; 
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }

}
