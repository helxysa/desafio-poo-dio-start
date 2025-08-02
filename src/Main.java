import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {


    public static void main(String[] args) throws Exception {

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

    }


}
