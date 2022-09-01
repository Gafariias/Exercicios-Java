import java.util.Scanner;

public class Retangulo {
    
    private Scanner input = new Scanner(System.in);

    private Double base;
    private Double altura;
    private Double area;

    public void calcularArea() {

        //Inicio
        System.out.println("                     RETÂNGULO                       ");
        System.out.println();

        //Obtendo os dados
        System.out.print("Qual a base do retângulo? ");
        base = input.nextDouble();

        System.out.print("Qual a altura do retângulo? ");
        altura = input.nextDouble();

        area = base * altura;

        System.out.println("A área desse retângulo é de " + area);
    }
        
}
