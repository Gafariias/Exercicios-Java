/*  
Desenvolva um programa que dada a idade de uma pessoa, determine sua condição de eleitor conforme a tabela abaixo:

                                Idade	                                    Condição
                        Menor que 16 anos	                             Não pode votar
Maior ou igual a 16 e menor que 18 anos ou maior ou igual a 65 anos	      Facultativo
                            Entre 18 e 64 anos 	                          Obrigatórioz
*/

import java.util.Scanner;

public class CondicaoEleitoral {
    public static void main(String[] args) throws Exception {

        //Variaveis
        Scanner input = new Scanner(System.in);
        int idade = 0;

        //Obtendo dados
        System.out.print("Qual a sua idade? ");
        idade = input.nextInt();
        System.out.println("");
        
        //Lendo idade
        if (idade > 0) {
            if (idade < 16) {
                System.out.println("Não pode votar.");
            } else if ((idade >= 16 && idade < 18) || idade >= 65) {
                System.out.println("Facultativo.");
            } else {
                System.out.println("Obrigatório.");
            }
        } else {
            System.out.println("Digite um valor valido.");
        }

        input.close();
    }
}
