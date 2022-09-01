/*
Faça um programa que receba:

    O código do produto comprado; e
    A quantidade comprada do produto.

Calcule e mostre:

    O preço unitário do produto comprado, seguindo a Tabela abaixo;
    O preço total da nota;
    O valor do desconto, seguindo a Tabela abaixo e aplicado sobre o preço total da nota; e
    O preço final da nota depois do desconto.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codigo = 0;
        int quantidade = 0;
        int precoUn = 0;
        int precoTot = 0;
        Double desconto = 0.0;
        double precoFim = 0.0;

        //Obtendo dados
        System.out.print("Qual o codigo do produto? ");
        codigo = input.nextInt();

        while (codigo > 40) {
            System.out.print("Produto inexistente, por favor, digite um codigo valido. ");
            codigo = input.nextInt();
        }

        System.out.print("Qual a quantidade do produto que sera comprada? ");
        quantidade = input.nextInt();

        //Calculo do preco unitario do produto
        if (codigo >= 1 && codigo <= 10) {
            precoUn = 10;
        } else if (codigo <=20) {
            precoUn = 15;
        } else if (codigo <= 30) {
            precoUn = 20;
        } else {
            precoUn = 30;
        }

        //Calculo do preco total
        precoTot = precoUn * quantidade;

        //Calculando o desconto
        switch (precoUn) {
            case 10:
                if (precoTot <= 250) {
                    desconto = .05;
                }
                break;
            case 15:
                if (precoTot >= 250 && precoTot <= 500) {
                    desconto = .10;
                }
                break;
            case 20:
                if (precoTot >= 50) {
                    desconto = .15;
                }
                break;
            case 30:
                if (precoTot >= 50) {
                    desconto = .15;
                }
                break;
        }

        //Calculando o preço final
        double valorDesconto = precoTot * desconto;
        precoFim = precoTot + valorDesconto;

        Produto produto = new Produto(codigo, quantidade, precoUn, precoTot, desconto, valorDesconto, precoFim);

        produto.imprimirResultado();

        input.close();
    }
}
