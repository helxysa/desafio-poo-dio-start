import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Conteudo;



public class Main {


    public static void main(String[] args) throws Exception {



        /* primeira forma de fazer, pensando no encapsulamente e abstracao */


        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprender os paradigmas da programacao com Java");
        curso1.setCargaHoraria(100);


        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Aprender os paradigmas da programacao com Java");
        curso2.setCargaHoraria(100);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre Java e boas práticas");
        mentoria.setData(java.time.LocalDate.now());
        

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        
        /* segunda forma de fazer, pensando na heranca e polimorfismo */
        
        Conteudo conteudo1 = new Curso();
        conteudo1.setTitulo("curso de heranca");
        conteudo1.setDescricao("aprender os conceitos de heranca e polimorfismo");

        Conteudo conteudo2 = new Mentoria();
        conteudo2.setTitulo("mentoria em java");
        conteudo2.setDescricao("mentoria em java");

        System.out.println(conteudo1);
        System.out.println(conteudo2);

        

    }


}


        System.out.println(mentoria);

    }


}

