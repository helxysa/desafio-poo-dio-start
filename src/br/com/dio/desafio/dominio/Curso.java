package br.com.dio.desafio.dominio;

public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;


    public Curso(){

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


    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }


    public int getCargaHorario() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHorario=" + cargaHoraria +
                '}';
    }

}
