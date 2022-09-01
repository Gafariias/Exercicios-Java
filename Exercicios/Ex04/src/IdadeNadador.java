/*
Faça um programa que receba a idade de um nadador e mostre sua categoria, usando as regras a seguir. Para idade inferior a 5, deverá mostrar mensagem.

  Categoria                 Idade
   Infatil                 >=5 <=7
   Juvenil                 >7 <=10
 Adolescente               >10 <=15
    Adulto                 >15 <=30
    Sênior                   >30
*/

import java.util.Scanner;

public class IdadeNadador {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int idade;
        String categoria = "";

        System.out.print("Qual a idade do nadador? ");
        idade = entrada.nextInt();

        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil";
        } else if (idade > 7 && idade <= 10) {
            categoria = "Juvenil";
        } else if (idade > 10 && idade <= 15) {
            categoria = "Adolescente";
        } else if (idade > 15 && idade <= 30) {
            categoria = "Adulto";
        } else {
            categoria = "Sênior";
        }

        System.out.println("O nadador possui "+ idade + " anos, e ele se encaixa na categoria " + categoria);

        entrada.close();
    }
}