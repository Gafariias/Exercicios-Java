/*
Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00; caso contrário, o lucro será de 30%. Desenvolva um programa que dado o valor do produto, imprimir o valor de venda.
*/

import java.util.Scanner;

public class VendaProduto {
    public static void main(String[] args) throws Exception {

        //Variaveis
        Scanner input = new Scanner(System.in);
        float compraProduto = 0;
        float vendaProduto = 0;
        float lucro = 0;

        //Obtendo dados
        System.out.print("Qual valor foi pago no produto? R$");
        compraProduto = input.nextFloat();

        //Valor de lucro
        if (compraProduto < 20) {
            lucro = compraProduto * 0.45f;
        } else {
            lucro = compraProduto * 0.30f;
        }

        //valor da venda
        vendaProduto = compraProduto + lucro;

        //Informando os dados
        System.out.print("\nO produto que foi comprado a R$" + compraProduto + " teve um lucro de R$" + lucro + ", ficando com um valor de revenda de: R$" + vendaProduto);

        input.close();
    }
}
