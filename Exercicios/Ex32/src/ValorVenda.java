/*
    Um comerciante calcula o valor de venda, tendo em vista a tabela a seguir:
    Valor da compra	Valor da venda
        < 10,00	Lucro de 70%
        >= 10,00 e < 30,00	Lucro de 50%
        >= 30,00 e < 50,00	Lucro de 40%
        >= 50,00	Lucro de 30%
Crie um programa que possa entrar com o valor da compra e imprimir o valor da venda.
*/

import java.util.Scanner;

public class ValorVenda {
    public static void main(String[] args) throws Exception {

        //Variaveis
        Scanner input = new Scanner(System.in);
        float valorCompra = 0;
        float ValorVenda = 0;
        float porcentagem = 0;
        float lucro = 0;

        //Obtendo dados
        System.out.print("Insira o valor que foi pago na compra: R$");
        valorCompra = input.nextFloat();

        //Testando os dados para saber o valor do lucro
        if (valorCompra < 10) {
            porcentagem = 0.70f;
        } else if (valorCompra < 30) {
            porcentagem = 0.50f;
        } else if (valorCompra < 50) {
            porcentagem = 0.40f;
        } else if (valorCompra >= 50) {
            porcentagem = 0.30f;
        }
        lucro = valorCompra * porcentagem;
        ValorVenda = valorCompra + lucro;

        System.out.println("\nSeu lucro foi de: R$" + lucro + ", portanto o valor de venda será de: R$" + ValorVenda);

        input.close();
    }
}
