public class Pessoa {
    
    protected String nome;

    public Pessoa(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }
}
