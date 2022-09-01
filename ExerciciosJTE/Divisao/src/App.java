/* Crie uma classe que aceite a digitação de dois números e faça a divisão entre eles exibindo seu resultado. Sua classe deve tratar as seguintes exceções:

    ArithmeticException quando ocorrer uma divisão por zero.
    InputMismatchException quando o valor informado não é numerico. */
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o primeiro numero? ");
        String n1S = input.nextLine();

        System.out.print("Qual o segundo numero? ");
        String n2S = input.nextLine();
        
        input.close();

        try {
            Double n1 = Double.parseDouble(n1S);
            Double n2 = Double.parseDouble(n2S);
            Double conta = n1 / n2;
            
                if (n1.equals(0.0) || n2.equals(0.0)) {
                    System.out.println("ArithmeticException, nenhum dos valores pode ser igual a zero.");
                } else {
                    System.out.println("A divisão de " + n1 + " por " + n2 + " é igual a " + conta);
                }

        } catch (NumberFormatException n1){
            System.out.println("InputMismatchException, por favor, digite um numero");
        }

        
    }
}
