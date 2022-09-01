import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        double med;
        int dif = 0;
        int prod = 0;
        double div = 0;

        //Obtendo os numeros
        System.out.print("Qual o primeiro numero? ");
        n1 = input.nextInt(); 

        System.out.print("Qual o segundo numero? ");
        n2 = input.nextInt(); 

        //Media entre os dois numeros
        med = (n1 + n2) / 2;

        //Diferença do maior para o menor
        //Descobrindo qual o maior e qual o menor
        if (n1 == n2) {
            dif = n1 - n2;
        } else if (n1 > n2) {
            dif = n1 - n2;
        } else {
            dif = n2 - n1;
        }

        //Produto entre od numeros
        prod = n1 * n2;

        //Divisão do primeiro pelo segundo
        div = n1 / n2;

        //Informando os dados ao usuario
        System.out.println();
        System.out.println("A média entre os dois numeros é igual a: " + med);
        System.out.println("A diferena do maior para o menor é de " + dif);
        System.out.println("O produto dos dois numero é igual a: " + prod);
        System.out.println("A divisão do primeiro numero pelo segundo é igual a: " + div);

        input.close();
    }
}
