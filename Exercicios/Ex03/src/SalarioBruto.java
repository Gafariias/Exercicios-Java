/* 
Faça um programa que receba o salário bruto de um funcionário e, usando a tabela a seguir, calcule e mostre o valor a receber. Sabe-se que este é composto pelo salário bruto acrescido de gratificação e descontado o imposto de 7% sobre o salário.

           Salário                        Gratificação
            <=350                            R$100
         >350 <=600                          R$75
         >600 <=900                          R$50
            >900                             R$35
*/

import java.util.Scanner;

public class SalarioBruto {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float salario;
        int gratificacao = 0;

        System.out.print("Qual o salário do funcionario? ");
        salario = entrada.nextInt();

        if (salario <= 350) {
            gratificacao = 100;
        } else if (salario > 350 && salario <= 600 ) {
            gratificacao = 75;
        } else if (salario > 600 && salario <= 900) {
            gratificacao = 50;
        } else {
            gratificacao = 35;
        }

        System.out.print("O salário do funcionario é de R$" + salario + " portando sua gratificação sera de R$" + gratificacao);

        entrada.close();
    }
}
