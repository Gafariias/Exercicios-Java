/*
    Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.

    Sendo que:
        Triângulo Equilátero: possui os 3 lados iguais.
        Triângulo Isóscele: possui 2 lados iguais.
        Triângulo Escaleno: possui 3 lados diferentes.
*/

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws Exception {
        //variaveis
        Scanner input = new Scanner(System.in);
        float l1;
        float l2;
        float l3;

        //Obtendo dados
        System.out.print("Digite a medida do primeiro lado: ");
        l1 = input.nextFloat();

        System.out.print("Digite a medida do segundo lado: ");
        l2 = input.nextFloat();

        System.out.print("Digite a medida do terceiro lado: ");
        l3 = input.nextFloat();

        //Testando os valores
        if (((l1 + l2) < l3) || ((l2 + l3) < l1) || ((l1 + l3) < l2)) { //Testando se realmente é um triangulo.
            System.out.print("ISTO NÃO É UM TRIANGULO");
        } else {
            if (l1 == l2 && l1 == l3) { //Equilatero
                System.out.print("Este é um triangulo equilatero.");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) { //Isósceles
                System.out.print("Este é um triangulo isosceles.");

            } else if (l1 != l2 && l1 != l3 && l2 != l3) { // Escaleno
                System.out.print("Este é um triangulo escaleno.");
            }   
            
        }

        input.close();
    }
}
