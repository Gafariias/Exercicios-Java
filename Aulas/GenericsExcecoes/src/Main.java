public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("Arnaldo", "Matemática");
        Aluno aluno = new Aluno("Roberto", 456);

        try {
            aluno.setIdade(3);
        } catch (idadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
