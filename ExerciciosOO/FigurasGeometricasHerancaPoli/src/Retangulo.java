public class Retangulo extends Formas{

    private Double base;
    private Double altura;
    private Double area;
    private boolean teste;

    public Retangulo(Double base, Double altura, boolean teste) {
        this.base = base;
        this.altura = altura;
        this.teste = teste;
    }

    @Override
    public Double calcularArea() {

        area = base * altura;

        if (teste) {
            System.out.println("A área desse retângulo é de " + String.format("%.2f", area));
        }

        return area;
    }

    public Double getArea() {
        return area;
    }
        
}
