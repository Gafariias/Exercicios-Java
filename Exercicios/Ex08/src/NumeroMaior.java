/* Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles. */

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) throws Exception {
        //Desclarando variaveis
        Scanner entrada = new Scanner(System.in);
        float n1 = 0;
        float n2 = 0;

        //Recebendo os valores
        System.out.print("Digite o primeiro valor: ");
        n1 = entrada.nextFloat(); //Primeiro valor
        
        System.out.print("Digite o segundo valor: ");
        n2 = entrada.nextFloat();

        //Testando os valores
        if (n1 != n2) { //Se os valores forem diferentes
            if (n1 < n2) {
                System.out.print("O maior valor é " + n2); //se o segundo for maior
            } else {
                System.out.print("O maior valor é " + n1); //se o primeiro for maior
            }
        } else { //Mensagem de erro caso os valores sejam iguais
            System.out.println("[ERRO] DIGITE DOIS VALORES DIFERENTES");
        }

        entrada.close();
    }
}
