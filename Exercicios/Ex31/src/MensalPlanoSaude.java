/*  
Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro. Um vendedor de um plano de saúde apresentou a tabela a seguir. Desenvolva um programa que dada a idade de uma pessoa, imprima o valor que ela deverá pagar.
Até 10 anos: R$ 30,00
Acima de 10 até 29 anos: R$ 60,00
Acima de 29 até 45 anos: R$ 120,00
Acima de 45 até 59 anos: R$ 150,00
Acima de 59 até 65 anos: R$ 250,00
Maior que 65 anos: R$ 400,00
*/

import java.util.Scanner;

public class MensalPlanoSaude {
    public static void main(String[] args) throws Exception {

        //Variaveis
        Scanner input = new Scanner(System.in);
        int idade = 0; 
        float mensalidade = 0;

        //Obtendo dados do usuario
        System.out.print("Qual a sua idade? ");
        idade = input.nextInt();

        //Testando a idade 
        if (idade <= 10) {
            mensalidade = 30.00f;
        } else if (idade <= 29) {
            mensalidade = 60.00f;
        } else if (idade <= 45) {
            mensalidade = 120.00f;
        } else if (idade <= 59) {
            mensalidade = 150.00f;
        } else if (idade <= 65) {
            mensalidade = 250.00f;
        } else if (idade > 65) {
            mensalidade = 400.00f;
        }

        //Informando os dados ao usuario
        System.out.print("\nVocê deverá pagar R$" + mensalidade + " no seu plano de saude.");

        input.close();
    }
}
