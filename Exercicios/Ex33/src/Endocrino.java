/*
Um endocrinologista deseja controlar a saúde de seus pacientes e, para isso, se utiliza do Índice de Massa Corporal (IMC). Sabendo-se que o IMC é calculado através da seguinte fórmula:
IMC = peso / altura2
Onde: 
peso é dado em Kg
altura é dada em metros
Crie um programa que dados o peso e altura do paciente, exiba sua faixa de risco, baseando-se na seguinte tabela:
IMC	Faixa de risco
Abaixo de 20	Abaixo do peso
A partir de 20 até 25	Normal
Acima de 25 até 30	Excesso de peso
Acima de 30 até 35	Obesidade
Acima de 35	Obesidade mórbida
*/

import java.util.Scanner;

public class Endocrino {
    public static void main(String[] args) throws Exception {

        //Variaveis
        Scanner input = new Scanner(System.in);
        float peso = 0;
        float altura = 0;
        String risco = " ";

        //Obtendo dados
        System.out.print("Digite seu peso (em KG): "); 
        peso = input.nextFloat();

        System.out.print("Digite sua altura (em CM): ");
        altura = input.nextFloat();
        
        
        //covertendo a altura para metros
        altura = altura / 100;

        //IMC
        double IMC = peso / Math.pow(altura, 2) ;

        //testando o imc
        if (IMC < 20) {
            risco = "abaixo do peso";
        } else if (IMC <= 25) {
            risco = "normal";
        } else if (IMC <= 30) {
            risco = "com excesso de peso";
        } else if (IMC <= 35) {
            risco = "com obesidade";
        } else {
            risco = "com obesidade mórbida";
        }

        //Mostrando os dados ao usuario
        System.out.println("\nVocê possui um IMC de " + IMC + ", portanto você está " + risco);

        input.close();
    }
}
