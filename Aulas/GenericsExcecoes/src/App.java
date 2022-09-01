import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Professor professor = new Professor("Patricia", "Ciências");

        //Sem generics
            // List coisas = new ArrayList();

            // coisas.add(professor); // 0
            // coisas.add(escola);    // 1

            // Professor professorObtido = (Professor) coisas.get(0);
            // System.out.println(professorObtido);

            // Escola escolaObtida = (Escola) coisas.get(0);
            // System.out.println(escolaObtida);                    //Erro em tempo de Execução

        // Com generics 
            List<Professor> professores = new ArrayList<>();
            professores.add(professor); 

            Professor professorObtido = professores.get(0);
            // Escola escolaObtida2 = (Escola) professores.get(0);  //Erro em tempo de compilação
        
        // Wildcards
            //Unknown
            System.out.println("\n 1. Unknown Wildcard");

            Professor professorFernanda = new Professor("Fernanda", "Protuguês");
            professores.add(professorFernanda);

            processaElementos(professores);

            List<Escola> escolas = new ArrayList<>();
            escolas.add(new Escola("aeiou"));
            escolas.add(new Escola("Classe 13"));

            System.out.println();
            processaElementos(escolas);

            //Extends
            System.out.println("\n 2. Extends Wildcards");

            List<Aluno> alunos = new ArrayList<Aluno>(); 
            alunos.add(new Aluno("Roberto", 2534));
            alunos.add(new Aluno("Jessica", 1234));

            System.out.println();
            processaPessoas(professores);

            System.out.println();

            System.out.println();
            System.out.println("\n 2. Super Wildcard");
            processaSuperProfessores(professores);

            List<Pessoa> pessoas = new ArrayList<>();
            pessoas.add(new Pessoa("André"));
            processaSuperProfessores(pessoas);
    }

    //Unknown wildcard
    public static void processaElementos(List<?> elementos) {
        for (Object object : elementos) {
            System.out.println(object);
        }
    }

    //Extends Wildcard
        //Aceitos: Professor, Pessoa, Object
    public static void processaPessoas(List<? extends Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome da pessoa: " + pessoa.getNome());
        }
    }

    //Super Wildcard
    public static void processaSuperProfessores(List<? super Professor> superProfessores) {
        for (Object object : superProfessores) {
            System.out.println(object);
        }
    }
}
