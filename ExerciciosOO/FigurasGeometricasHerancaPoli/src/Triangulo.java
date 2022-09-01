public class Triangulo extends Retangulo {

    Double area = 0.0;

    public Triangulo(Double base, Double altura) {
        super(base, altura, false);
    }

    public Double calcularArea() {

        //Calculando a área
        area = super.calcularArea() / 2;

        System.out.println("A área desse triângulo é de " + String.format("%.2f", area));

        return area;
    }
}
