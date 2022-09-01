public class Pessoa {
    
    private String primeiroNome;
    private String sobrenome;
    private int idade = 0;

    public Pessoa(String primeiroNome, String sobrenome, int idade) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    //Primeiro nome
    public String getPrimeiroNome() {
        return primeiroNome;
    }
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    //Sobrenome
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //Idade
    public int getIdade() {
        return idade;
    }
    public void setIdadeInicial(int idade) {
        this.idade = idade;
    }
    public void incrementarIdade() {
        this.idade++;
    }

    //Nome completo
    public void setNomeCompleto(String primeiroNome, String sobrenome) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
    }
    public String getNomeCompleto() {
        return primeiroNome + " " + sobrenome;
    }
}
