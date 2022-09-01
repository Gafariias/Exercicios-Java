
public class idadeInvalidaException extends Exception {

    private int idade;

    public idadeInvalidaException(String mensagem, int idade) {
        super(mensagem);
        this.idade = idade;
    }
    
    // Método para obter qual a idade retornou a exceção
    public int getIdade() {
        return idade;
    }

}
