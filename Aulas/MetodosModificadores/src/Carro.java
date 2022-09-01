public class Carro {

    private String modelo;
    private Pessoa proprietario;

    public Carro(String modelo, Pessoa proprietario) {
        this.modelo = modelo;
        this.proprietario = proprietario;
    }

    public String getNomeProprietario() {
        return proprietario.getNomeCompleto();
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return this.modelo;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
    public Pessoa getProprietario() {
        return proprietario;
    }
}
