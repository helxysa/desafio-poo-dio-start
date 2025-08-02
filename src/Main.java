import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Bootcamp;





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


        /*aqui ja eh a inscricao nos conteudos do bootcamp */
        
        Bootcamp bootcampJava = new Bootcamp();
        java.util.Set<Conteudo> conteudos = new java.util.LinkedHashSet<>();
        conteudos.add(conteudo1);
        bootcampJava.setConteudos(conteudos);
        java.util.Set<Bootcamp> bootcamps = new java.util.LinkedHashSet<>();
        bootcamps.add(bootcampJava);

        for (Bootcamp bootcamp : bootcamps){
            System.out.println(bootcamp);
        }


        /* o dev se inscrevendo  */

        Dev devEu = new Dev();
        devEu.setNome("heloysa");
        devEu.inscreverBootcamp(bootcampJava);

        System.out.printf("Os conteudos do dev %s são os seguintes: %n", devEu.getNome());
        for (Conteudo conteudo : devEu.getConteudosInscritos()) {
            System.out.println(conteudo);
        }


        /*   
          Instanciando agora com as alteracoes dentro de bootcamp 

          fiz algumas melhorias visuais, pra ficar um pouco mais facil de entender o conteudo que esta vindo
         
        */


      
        Bootcamp bootcampDio = new Bootcamp();
        bootcampDio.setNome("bootcamp trilha Java");
        bootcampDio.setDescricao("esse bootcamp tem como objetivo ensinar os paradigmas da linguagem de programação java");
        bootcampDio.getConteudos().add(curso1);
        bootcampDio.getConteudos().add(curso2);
        bootcampDio.getConteudos().add(mentoria);

        System.out.println("\n--- Conteúdos do Bootcamp ---");
        for (Conteudo conteudo : bootcampDio.getConteudos()) {
            if (conteudo instanceof Curso) {
                System.out.println("Curso: " + conteudo.getTitulo());
            } else if (conteudo instanceof Mentoria) {
                System.out.println("Mentoria: " + conteudo.getTitulo());
            }
        }

        System.out.println("---------------------------------------------\n");

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcampDio);

        System.out.println("\n--- Situação da Dev: " + dev1.getNome() + " ---");

        System.out.println("Conteúdos inscritos:");
        for (Conteudo conteudo : dev1.getConteudosInscritos()) {
            if (conteudo instanceof Curso) {
                System.out.println("  Curso: " + conteudo.getTitulo());
            } else if (conteudo instanceof Mentoria) {
                System.out.println("  Mentoria: " + conteudo.getTitulo());
            }
        }

        System.out.println("Conteúdos concluídos:");
        for (Conteudo conteudo : dev1.getConteudosConcluidos()) {
            if (conteudo instanceof Curso) {
                System.out.println("  Curso: " + conteudo.getTitulo());
            } else if (conteudo instanceof Mentoria) {
                System.out.println("  Mentoria: " + conteudo.getTitulo());
            }
        }


        //camila progedindo aq
        dev1.progedir();
        dev1.progedir();
        dev1.progedir();
        dev1.progedir();
        dev1.progedir();


        System.out.println("Conteúdos inscritos após progredir:");
        for (Conteudo conteudo : dev1.getConteudosInscritos()) {
            if (conteudo instanceof Curso) {
                System.out.println("  Curso: " + conteudo.getTitulo());
            } else if (conteudo instanceof Mentoria) {
                System.out.println("  Mentoria: " + conteudo.getTitulo());
            }
        }

        System.out.println("Conteúdos concluídos após progredir:");
        for (Conteudo conteudo : dev1.getConteudosConcluidos()) {
            if (conteudo instanceof Curso) {
                System.out.println("  Curso: " + conteudo.getTitulo());
            } else if (conteudo instanceof Mentoria) {
                System.out.println("  Mentoria: " + conteudo.getTitulo());
            }
        }

        System.out.println("XP total da Dev " + dev1.getNome() + ": " + dev1.calcularTotalXp());

        dev1.progedir();
        dev1.progedir();

        System.out.println("XP total da Dev " + dev1.getNome() + " após concluir tudo: " + dev1.calcularTotalXp());

        System.out.println("\n---------------------------------------------\n");

        Dev dev2 = new Dev();
        dev2.setNome("Jorge");
        dev2.inscreverBootcamp(bootcampDio);

        System.out.println("--- Situação da Dev: " + dev2.getNome() + " ---");
        System.out.println("Conteúdos inscritos antes de progredir:");
        for (Conteudo conteudo : dev2.getConteudosInscritos()) {
            if (conteudo instanceof Curso) {
                System.out.println("  Curso: " + conteudo.getTitulo());
            } else if (conteudo instanceof Mentoria) {
                System.out.println("  Mentoria: " + conteudo.getTitulo());
            }
        }

        dev2.progedir();

        System.out.println("Conteúdos inscritos após progredir:");
        for (Conteudo conteudo : dev2.getConteudosInscritos()) {
            if (conteudo instanceof Curso) {
                System.out.println("  Curso: " + conteudo.getTitulo());
            } else if (conteudo instanceof Mentoria) {
                System.out.println("  Mentoria: " + conteudo.getTitulo());
            }
        }

        System.out.println("Conteúdos concluídos após progredir:");
        for (Conteudo conteudo : dev2.getConteudosConcluidos()) {
            if (conteudo instanceof Curso) {
                System.out.println("  Curso: " + conteudo.getTitulo());
            } else if (conteudo instanceof Mentoria) {
                System.out.println("  Mentoria: " + conteudo.getTitulo());
            }
        }

        System.out.println("XP total da Dev " + dev2.getNome() + ": " + dev2.calcularTotalXp());

        dev2.progedir();
        dev2.progedir(); 

        System.out.println("XP total da Dev " + dev2.getNome() + " após concluir tudo: " + dev2.calcularTotalXp());



        

        

    }


}



        System.out.println(mentoria);

    }


}

