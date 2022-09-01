/*
    Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
*/

import java.util.Scanner;
import java.util.Calendar;

public class IdadeVoto {
    public static void main(String[] args) throws Exception {
        //Declarando variaveis
        Scanner entrada = new Scanner(System.in);
        Calendar d = Calendar.getInstance();
        int anoNasc = 0;
        int anoAtual = d.get(Calendar.YEAR);
         
        //Obtendo dados
        System.out.print("Qual seu ano de nascimento? ");
        anoNasc = entrada.nextInt();
        
        //Calculando a idade
        int idade = anoAtual - anoNasc;

        //testando a idade
        if (idade >= 16 && idade < 18) {
            System.out.print("Você possui ou vai fazer " + idade + " anos, portanto ja podera votar por escolha");
        } else if (idade >= 18) {
            System.out.print("Você possui ou vai fazer " + idade + " anos, portanto Você tem a obrigação de votar");
        } else {
            System.out.print("Você possui ou vai fazer " + idade + " anos, portanto Você ainda não pode votar");
        }

        entrada.close();
    }
}
