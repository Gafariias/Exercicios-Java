/*
    Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.

    endo que:
        Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
        Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
        TriânguloAcutângulo: possui três ângulos agudos. (menor que 90º
*/

import java.util.Scanner;

public class AnguloTriangulo {
    public static void main(String[] args) throws Exception {
        //Declarando variaveis
        Scanner input = new Scanner(System.in);
        int a1;
        int a2;
        int a3;

        //Recebendo dados
        System.out.print("Digite o grau do primeiro angulo: ");
        a1 = input.nextInt();

        System.out.print("Digite o grau do segundo angulo: ");
        a2 = input.nextInt();

        System.out.print("Digite o grau do terceiro angulo: ");
        a3 = input.nextInt();

        //Testando os valores 
        if ((a1 + a2 + a3) == 180) { //Testando se realmente é um tringulo.
            if ((a1 == 90 || a2 == 90 || a3 == 90) && (a1 <= 90 && a2 <= 90 && a3 <= 90)) {
                System.out.print("Este é um triangulo retângulo.");
            } else if (a1 > 90 || a2 > 90 || a3 > 90) {
                System.out.print("Este é um triangulo obtusângulo.");
            } else if (a1 < 90 || a2 < 90 || a3 < 90) {
                System.out.print("Este é um triangulo acutângulo.");
            }
        } else {
            System.out.print("ISSO NÃO É UM TRIANGULO");
        }

        input.close();
    }
}
