/*
    Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes Fórmulas:
        para homens: (72.7 * Altura) – 58
        para mulheres: (62.1 * Altura) – 44.7
*/

import java.util.Scanner;

public class AlturaSexo {
    public static void main(String[] args) throws Exception {
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        int sexo;
        float altura = 0.0f;
        float pesoIdeal = 0;

        //Recebendo valores
        System.out.print("Qual seu sexo? Digite 1 para MASCULINO e 2 para FEMININO ");
        sexo = entrada.nextInt();       //Recebendo o sexo

        if (sexo != 1 && sexo != 2) {
            System.out.print("[ERRO] Digite um valor valido.");
        } else {
            System.out.print("Qual a sua altura? ");
            altura = entrada.nextFloat();   //Recebendo a altura
            altura = altura / 100;

            //testando os valores
            if (sexo == 1) {
                pesoIdeal = (72.7f * altura) - 58;
            } else if (sexo == 2) {
                pesoIdeal = (62.1f * altura) - 44.7f;
            }
        
        //Informando os dados ao usuario
        System.out.print("Seu peso ideal deve ser algo em torno de " + pesoIdeal);
        }

        entrada.close();
    }
}
