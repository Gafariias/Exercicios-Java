/* Uma empresa decidiu dar uma gratificação de Natal a seus funcionários, baseada no número de horas extras e no número de horas que o funcionário faltou ao trabalho. O valor do prêmio é obtido pela consulta à tabela que se segue, na qual:

H = número de horas extras – (2/3 * ( número de horas falta ))

H (MINUTOS)	         PRÊMIO (R$)
>= 2.401	         500,00
1.801 até 2.400      400,00
1.201 até 1.800      300,00
600 até 1.200        200,00
<600	             100,00 */

import java.util.Scanner;

public class GratificacaoNatalina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int falta;
        int extra;
        float conta;

        System.out.print("Digite o numero de horas extras: ");
        extra = entrada.nextInt();
        System.out.println(" ");

        System.out.print("Digite o numero de horas faltas: ");
        falta = entrada.nextInt();
        System.out.println(" ");

        conta = extra - (2/3 * (falta));
        conta = conta * 60;

        if (conta > 2400) {
            System.out.print("Você possui " + extra + " horas extras e " + falta + " Horas faltas, seu total é de " + conta + " e seu premio sera de R$500");
        } if (conta > 1800 && conta <= 2400) {
            System.out.print("Você possui " + extra + " horas extras e " + falta + " Horas faltas, seu total é de " + conta + " e seu premio sera de R$400");
        } if (conta > 1200 && conta <= 1800) {
            System.out.print("Você possui " + extra + " horas extras e " + falta + " Horas faltas, seu total é de " + conta + " e seu premio sera de R$300");
        } if (conta >= 600 && conta <= 1200) {
            System.out.print("Você possui " + extra + " horas extras e " + falta + " Horas faltas, seu total é de " + conta + " e seu premio sera de R$200");;
        } if (conta < 600) {
            System.out.print("Você possui " + extra + " horas extras e " + falta + " Horas faltas, seu total é de " + conta + " e seu premio sera de R$100");
        }

        entrada.close();
    }
}