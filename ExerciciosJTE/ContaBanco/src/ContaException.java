public class ContaException extends Exception {
    
    String mensagem;

    //Construtor padrão da classe
    public ContaException(String mensagem) {
        this.mensagem = mensagem;
    }

    //Mensagem de erro
    public void mensagemErro() {
        System.out.println(mensagem);
    }
}
