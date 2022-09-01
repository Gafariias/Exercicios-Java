/*
Desenvolva um programa que dado um número, informe se ele é divisível por 3 e por 7.
*/

import java.util.Scanner;

public class DivisivelTresESete {
    public static void main(String[] args) throws Exception {

        //Variaveis
        Scanner input = new Scanner(System.in);
        int num = 0;

        //Recebendo o numero: 
        System.out.print("Digite um numero: ");
        num = input.nextInt();
        System.out.println(" ");

        //Testando os numeros:
        if (((num % 3) == 0) && ((num % 7) == 0)) {
            System.out.print("Numero divisivel por 3 e por 7.");
        } else if ((num % 7) == 0) {
            System.out.print("Numero divisivel por 7.");
        } else if ((num % 3) == 0) {
            System.out.print("Numero divisivel por 3");
        } else {
            System.out.print("Numero não divisivel por 3, nem por 7.");
        }

        input.close();
    }
}
