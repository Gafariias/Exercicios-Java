/*
Desenvolva um programa que dados três números inteiros, informe quantos são negativos.
*/

import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) throws Exception {
        
        //Variaveis
        Scanner input = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        //Obtendo dados
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        n3 = input.nextInt();

        //testando os dados
        if (n1 < 0 && n2 < 0 && n3 < 0) {
            System.out.println("Os três números são menores negativos.");
        } else if (n1 < 0 && (n2 < 0 || n3 < 0)) {
            System.out.println("Dois números são negativos.");
        } else if (
            (n1 < 0 && n2 > 0 && n3 > 0) || 
            (n1 > 0 && n2 < 0 && n3 > 0) || 
            (n1 > 0 && n2 > 0 && n3 < 0)
            ) {
            System.out.println("Apenas um número é negativo.");
        } else {
            System.out.println("Nenhum número é negativo.");
        }

        input.close();
    }
}
