import java.util.ArrayList;
import java.util.List;

public class Bicicleta {

    private String modelo;
    private List<Roda> rodas;

    public Bicicleta(String modelo) {
        this.modelo = modelo;
    } 

    public void setRodas(List<Roda> rodas) {
        this.rodas = rodas;
    }
    public List<String> getRodas() {
        List<String> modelos = new ArrayList<String>();
        for(Roda roda : this.rodas) {
            modelos.add(roda.getModelo());
        }
        return modelos;
    }

    public String getModelo() {
        return modelo;
    }
}