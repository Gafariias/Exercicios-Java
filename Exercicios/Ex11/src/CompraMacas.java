/*
    As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.
*/

import java.util.Scanner;

public class CompraMacas {
    public static void main(String[] args) throws Exception {
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        float valor = 0;

        //recebendo a quantidade de maçãs a serem compradas
        System.out.print("Quantas maçãs serão compradas? ");
        int quantidade = entrada.nextInt();

        //Testando a quantidade de maçãs
        if (quantidade < 12) {
            valor = 0.30f;
        } else {
            valor = 0.25f;
        }
        
        //Calculando o valor total
        float valorTotal = quantidade * valor;

        //Informando os dados ao usuario
        System.out.println("Você comprou " + quantidade + " Maçãs, portando seu valor unitario ficou em R$" + valor + " e o total de sua compra ficou R$" + valorTotal);

        entrada.close();
    }
}
