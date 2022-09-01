/*
A StackX abriu uma linha de crédito para os alunos. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um programa que permita entrar com o salário bruto, o valor do empréstimo e o número de parcelas e informar o
valor da parcela e se o empréstimo pode ou não ser concedido. Caso o empréstimo não possa ser concedido, informar ainda o valor máximo da prestação.
*/

import java.util.Scanner;

public class CreditoAluno {
    public static void main(String[] args) throws Exception {
        
        //Variaveis
        Scanner input = new Scanner(System.in);
        float salarioBruto = 0;
        float prestacao = 0;
        float parcela = 0;
        float ValorParcela = 0;

        //Obtendo Dados
        System.out.print("Qual o valor da prestação? R$");
        prestacao = input.nextFloat();
        System.out.println(" ");

        System.out.print("Qual o seu salario bruto? R$");
        salarioBruto = input.nextFloat();
        System.out.println(" ");
        
        //Testando os dados
        if (prestacao < (salarioBruto * 0.30f)) {

            System.out.println("O crédito poderá ser concedido.");
            
            System.out.print("Em quantas parcelas você deseja fazer? ");
            parcela = input.nextFloat();
            System.out.println(" ");

            //Calculando o valor da parcela
            ValorParcela = prestacao / parcela;

            System.out.println("O valor da parcela será de: R$" + ValorParcela);
        }

        input.close();
    }
}
