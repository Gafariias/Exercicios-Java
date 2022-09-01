/*
Desenvolva um programa que dado um número, imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3. 
*/

import java.util.Scanner;

public class NumImpar {
    public static void main(String[] args) throws Exception {

        //Variaveis
        Scanner input = new Scanner(System.in);
        int num = 0;

        //Obtendo o numero
        System.out.print("Digite um número: ");
        num = input.nextInt();
        System.out.println(" ");

        //Testando o numero
        if ((num % 3) == 0) {
            System.out.println("É multiplo de 3");
        } else {
            System.out.println("Não é multiplo de 3");
        }

        input.close();
    }
}
