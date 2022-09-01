/*
Faça um programa que leia um conjunto não determinado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. Finalize a entrada de dados com um valor negativo ou zero.
*/

import java.util.Scanner;

public class ConjuntoValores {
    public static void main(String[] args) throws Exception {

        //Variaveis
        Scanner input = new Scanner(System.in);
        int QtdNumero = 0;
        int i = 1;
        float num = 1;

        System.out.print("Quantos numeros você quer analisar? ");
        QtdNumero = input.nextInt();

        //Laço
        while (i <= QtdNumero && num > 0) {
            //Cabeçalho
            System.out.println("------------------------------");
            System.out.println("Caso queira cancelar, digite zero ou um valor negativo.");
            System.out.println("");
            System.out.println("NUMERO " + i);
            System.out.println("");

            //Recebendo o numero
            System.out.print("Digite o numero: ");
            num = input.nextFloat();
            System.out.println(" ");

            if (num > 0) { //Código de cancelamento

                //Informando os dados ao usuario
                System.out.println("Quadrado:" + Math.pow(num, 2));
                System.out.println("Cubo: " + Math.pow(num, 3));
                System.out.println("Raiz quadrada: " + Math.sqrt(num));
                
                i++;
            } else {
                System.out.println("Operação cancelada");
            }
        }


        input.close();
    }
}
