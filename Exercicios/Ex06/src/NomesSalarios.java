/*
Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. Carlos aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos.
*/

import java.util.Scanner;

public class NomesSalarios {
    public static void main(String[] args) throws Exception {
        
        //Variaveis
        Scanner input = new Scanner(System.in);
        float SalarioCarlos = 0;
        int mes = 0;

        //Lendo o salario do Carlos
        System.out.print("Digite o salario do carlos: ");
        SalarioCarlos = input.nextFloat();
        float SalarioJoao = (0.33f) * SalarioCarlos;

        //Laço
        while (SalarioCarlos > SalarioJoao) {
            SalarioCarlos = SalarioCarlos + (SalarioCarlos * 0.02f);
            SalarioJoao = SalarioJoao + (SalarioJoao * 0.05f);
            mes++;
        }

        System.out.println(" ");
        System.out.print("Vai levar " + mes + " meses para o salario de João igualar ou ultrapassar o de Carlos.");

        input.close();
    }
}
