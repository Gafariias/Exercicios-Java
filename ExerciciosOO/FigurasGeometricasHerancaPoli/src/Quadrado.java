public class Quadrado extends Retangulo {

        private Double area;
    
        public Quadrado(Double lado) {
            super(lado, lado, false);
        }

        public Double calcularArea() {

            super.calcularArea();
            
            System.out.println("A área desse quadrado é de " + String.format("%.2f", super.getArea()));

            return area;
        }
}
