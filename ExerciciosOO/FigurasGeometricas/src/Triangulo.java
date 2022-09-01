import java.util.Scanner;

public class Triangulo {

    private Scanner input = new Scanner(System.in);

    private Double base;
    private Double altura;
    private Double area;
    
    public void calcularArea() {

        //Inicio
        System.out.println("                      TRIÂNGULO                      ");
        System.out.println();

        //Obtendo os dados
        System.out.print("Qual a base do triângulo? ");
        base = input.nextDouble();

        System.out.print("Qual a altura do triângulo? ");
        altura = input.nextDouble();

        //Calculando a área
        area = (base * altura) / 2;

        System.out.println("A área desse triângulo é de " + area);
    }
}
