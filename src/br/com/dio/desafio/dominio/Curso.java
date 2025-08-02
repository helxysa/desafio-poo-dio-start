package br.com.dio.desafio.dominio;


public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO + 10;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

  
}


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

