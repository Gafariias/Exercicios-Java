public class Professor extends Pessoa{

    private String departamento;

    public Professor(String nome, String departmento) {
        super(nome);
        this.departamento = departmento;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " do departamento: " + this.departamento;
    }
}
