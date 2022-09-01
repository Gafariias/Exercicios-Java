public class Pessoa {
    
    private String nome;
    private int idade;
    private String CPF;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getCPF() {
        return CPF;
    }

}
