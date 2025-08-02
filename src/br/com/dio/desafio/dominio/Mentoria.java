package br.com.dio.desafio.dominio;

import java.time.LocalDate;


public class Mentoria extends Conteudo{

   
    private LocalDate data;


public class Mentoria {

    
    private String titulo;
    private String descricao;
    private LocalDate data;


    public Mentoria(){
        
    }

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
        
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

                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
} 

                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }

}
