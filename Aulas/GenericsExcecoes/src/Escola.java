public class Escola {
    
    private String nome;

    public Escola(String nome) {
        super();
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Escola: " + this.nome;
    }
}
