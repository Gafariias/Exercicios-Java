/*
Faça um programa que receba a idade e o peso de uma pessoa. De acordo com a tabela a seguir, verifique e mostre em qual grupo de risco essa pessoa se encaixa.

   Idade       Até 60kg       Entre 60 e 90Kg     Acima de 90Kg
    <20            9                 8                  7 
>=20 && <=50       6                 5                  4
    >50            3                 2                  1
*/

import java.util.Scanner;

public class IdadePeso {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int idade;
        float peso;
        int risco = 0;

        //Obtendo a idade 
        System.out.print("Qual a sua idade? ");
        idade = entrada.nextInt();

        //Obtendo o peso
        System.out.print("Quanto você pesa? ");
        peso = entrada.nextInt();

        if (peso < 60) {
            if (idade < 20) {
                risco = 9;
            } else if (idade >= 20 && idade < 50) {
                risco = 6;
            } else if (idade >= 50) {
                risco = 3;
            }
        } else if (peso >= 60 && peso < 90) {
            if (idade < 20) {
                risco = 8;
            } else if (idade >= 20 && idade < 50) {
                risco = 5;
            } else if (idade >= 50) {
                risco = 2;
            }
        } else if (peso >=90) {
            if (idade < 20) {
                risco = 7;
            } else if (idade >= 20 && idade < 50) {
                risco = 4;
            } else if (idade >= 50) {
                risco = 1;
            }
        }

        System.out.println("Você possui " + idade + " anos e " + peso + " Kg, seu grupo de risco é " + risco);

        entrada.close();
    }
}
