/*
    Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).

    Calcular e imprimir o seguinte:
        Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
        Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
        Se o número de lados for igual a 5 escrever PENTÁGONO.

    Obs: O foco aqui é a lógica com o comando de controle IF, demais conhecimentos envolvidos pesquise mais. 
*/

import java.util.Scanner;

public class Poligono {
    public static void main(String[] args) throws Exception {
        //Declarando variaveis
        Scanner input = new Scanner(System.in);
        int lados;
        float area = 0;
        float l1 = 0;
        float base = 0;
        float alt = 0;
        float apot = 0;


        //Obtendo dados
        System.out.print("Digite a quantidade de lados do poligono: ");
        lados = input.nextInt();

        //Testando os valores
        if (lados < 3) {
            System.out.print("ISSO NÃO É UM POLIGONO");
        } else if (lados > 5) {
            System.out.print("POLIGONO NÃO IDENTIFICADO");
        } else {
            if (lados == 3) { //Triangulo
                //obtendo a area
                System.out.print("Digite a área da base: ");
                base = input.nextFloat();

                System.out.print("Digite a altura do triangulo: ");
                alt = input.nextFloat();

                area = (base * alt) / 2;

                System.out.println("Esta forma é um TRIÂNGULO com uma área " + area);
            } else if (lados == 4) { //Quadrado
                //Obtendo a area
                System.out.print("Digite a área de um dos lados: ");
                l1 = input.nextFloat();
                area = l1 * l1;

                System.out.println("Esta forma é um QUADRADO com uma área " + area);
            } else if (lados == 5) { //Pentagono
                //Obtendo dados 
                System.out.print("Digite a área de um dos lado: ");
                l1 = input.nextInt();

                System.out.print("Digite o tamanho do apotema: ");
                apot = input.nextInt();

                area = ((5 / 2) * l1) * apot;


                System.out.println("Esta forma é um PENTÁGONO com uma area " + area);
            }
        }    

        input.close();
    }
}
