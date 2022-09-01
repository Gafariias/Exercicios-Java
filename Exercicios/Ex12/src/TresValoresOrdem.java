/*
    Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
*/

import java.util.Scanner;

public class TresValoresOrdem {
    public static void main(String[] args) throws Exception {
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        //Obtendo os numero
        System.out.print("Digite o primeiro numero: ");
        n1 = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = entrada.nextInt();

        System.out.print("Digite o terceiro numero: ");
        n3 = entrada.nextInt();

        //testando os valores
        if (n1 != n2 && n1 != n3 && n2 != n3) {
            if ((n1 < n2) && (n2 < n3)) {
                System.out.print(n1 + " " + n2 + " " + n3);
            } else if ((n2 < n1) && (n1 < n3)) {
                System.out.print(n2 + " " + n1 + " " + n3);
            } else if ((n3 < n1 ) && (n1 < n2)) {
                System.out.print(n3 + " " + n1 + " " + n2);
            } else if ((n2 < n3) && (n3 < n1)) {
                System.out.print(n2 + " " + n3 + " " + n1);
            }
        } else {
            System.out.print("[ERRO] POR FAVOR, NÃO INFORME VALORES IGUAIS");
        }

        entrada.close();
    }
}
