/*
    Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.
*/

import java.util.Scanner;

public class TresValores {
    public static void main(String[] args) throws Exception {
        //Variaveis
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        //Obtendo os numeros
        System.out.print("Digite o primeiro numero inteiro: ");
        n1 = input.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        n2 = input.nextInt();

        System.out.print("Digite o terceiro numero inteiro: ");
        n3 = input.nextInt();

        //Testando os numeros
        if (n1 != n2 && n1 != n3 && n2 != n3) {
            if (n1 > n2 && n1 > n3) {
                System.out.print("O maior valor é " + n1);
            } else if (n2 > n1 && n2 > n3) {
                System.out.print("O maior valor é " + n2);
            } else if (n3 > n1 && n3 > n2) {
                System.out.print("O maior valor é " + n3);
            }
        } else { //mensagem de erro caso alguum valor seja repetido
            System.out.print("[ERRO] POR FAVOR, NÃO DIGITE VALORES IGUAIS.");
        }

        input.close();
    }
}