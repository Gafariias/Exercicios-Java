import java.util.Scanner;

public class GratificacaoNatal {
    public static void main(String[] args) throws Exception {

        //Variaveis
        Scanner input = new Scanner(System.in);
        int gratificacao = 0;
        float HoraExtra = 0;
        float HoraFalta = 0;
        float H = 0;

        //Recebendo dados
        System.out.print("Digite o numero de horas extras: ");
        HoraExtra = input.nextFloat();

        System.out.print("Digite o numero de horas faltas: ");
        HoraFalta = input.nextFloat();

        //Calculando o H
        H = (HoraExtra - (0.6f * HoraFalta));

        //Testando os dados
        if (H < 600) {
            gratificacao = 100;
        } else if (H < 1200) {
            gratificacao = 200;
        } else if (H < 1800) {
            gratificacao = 300;
        } else if (H < 2400) {
            gratificacao = 400;
        } else {
            gratificacao = 500;
        }

        //Informando os dados ao usuario
        System.out.println("\nO valor da graficação deste funcionario sera de: R$" + gratificacao);

        System.out.print(H);
        
        input.close();
    }
}
