public class Circulo extends Formas {

    private Double raio;
    private Double area;
    
    public Circulo(Double raio) {
        this.raio = raio;
    }
    
    @Override
    public Double calcularArea() {

        //Calculando a área
        area = Math.PI * (Math.pow(raio, 2));

        //Informando os dados ao usuario
        System.out.println("A área desse círculo é de " + String.format("%.2f", area));

        return area;

    }
}
