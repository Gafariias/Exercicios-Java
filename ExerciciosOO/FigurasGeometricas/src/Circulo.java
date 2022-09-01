import java.util.Scanner;

public class Circulo {
    
    private Scanner input = new Scanner(System.in);

    private Double raio;
    private Double area;
    
    public void calcularArea() {

        //Inicio
        System.out.println("                      CÍRCULO                      ");
        System.out.println();

        //Obtendo dados
        System.out.print("Qual o raio desse círculo? ");
        raio = input.nextDouble();

        //Calculando a área
        area = Math.PI * (Math.pow(raio, 2));

        //Informando os dados ao usuario
        System.out.println("A área desse círculo é de " + String.format("%.2f", area));

    }
}
