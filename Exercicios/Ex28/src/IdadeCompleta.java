/*
    Desenvolva um programa que dada a data de nascimento de uma pessoa e a data atual, informe a idade dessa pessoa em anos completos.
*/

import java.util.Scanner;
import java.util.Calendar;

public class IdadeCompleta {
    public static void main(String[] args) throws Exception {
        
        //Variaveis
        Scanner input = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        int diaNasc = 0;
        int mesNasc = 0;
        int anoNasc = 0;
        int idade = 0;

        //Obtendo o dia atual
        int diaAtual = c.get(Calendar.DATE);
        int mesAtual = c.get(Calendar.MONTH);
        int anoAtual = c.get(Calendar.YEAR);
        mesAtual = mesAtual + 1;

        //Obtendo os dados do usuario
        System.out.print("Digite o dia de seu nascimento: ");
        diaNasc = input.nextInt();

        System.out.print("Digite o mês de seu nascimento: ");
        mesNasc = input.nextInt();
    
        System.out.print("Digite o ano de seu nascimento: ");
        anoNasc = input.nextInt();

        //Definindo a idade
        idade = anoAtual - anoNasc;
        
        if (diaNasc > 31 || mesNasc > 12 || (anoNasc > anoAtual)) {
            System.out.print("\n[ERRO] DIGITE UMA DATA VALIDA.");
        } else {
            
            //Testando a data de nascimento
            if (mesNasc == mesAtual) {
                if (diaAtual < diaNasc) {
                    idade--;
                }
            } else if (mesNasc > mesAtual) {
                idade--;
            }

            //Informando ao usuario
            System.out.print("\nVocê possui " + idade + " anos completos.");
            
        }

        input.close();
    }
}
