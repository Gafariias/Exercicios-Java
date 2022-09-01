public class Aluno{

    private String nome;
    private int idade;
    private long matricula;
    
    public Aluno(String nome, long matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setIdade(int idade) throws idadeInvalidaException {
        if (idade > 4) {
            System.out.println("Idade valida");
            this.idade = idade;
        } else {
            throw new idadeInvalidaException("Idade Invalida", idade);
        }
    }

    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + this.nome;
    }
}
