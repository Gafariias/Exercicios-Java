import java.util.Scanner;

public class Quadrado {
    
        private Scanner input = new Scanner(System.in);

        private Double lado;
        private Double area;
    
    public void calcularArea() {
        
        

        System.out.println("                       QUADRADO                      ");
        System.out.println();


        System.out.print("Qual o valor dos lados? ");
        lado = input.nextDouble();

        area = lado * lado;
        
        System.out.println("A área desse quadrado é de " + area);
    }
}
