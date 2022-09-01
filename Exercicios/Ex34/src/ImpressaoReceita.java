import java.util.Scanner;

public class ImpressaoReceita {
    public static void main(String[] args) throws Exception {

        //Variaveis
        Scanner input = new Scanner(System.in);
        int idade = 0;
        float peso = 0;
        int gotas = 0;
        int mg = 0;

        //Recebendo dados
        System.out.print("Qual a sua idade? ");
        idade = input.nextInt();

        System.out.print("Qual o seu peso? ");
        peso = input.nextFloat();

        //Testando a idade e o peso do usuario
        if (idade < 12) {
            if (peso >= 5 && peso <= 9) {
                mg = 125;                
            } else if (peso <= 16) {
                mg = 250;
            } else if (peso <= 24) {
                mg = 375;
            } else if (peso <= 30) {
                mg = 500;
            } else {
                mg = 750;
            }
        } else {
            if (peso < 60) {
                mg = 875;
            } else {
                mg = 1000;
            }
        }

        gotas = mg / 25; //25 é a quantidade em mg em uma gota, obtindo dividindo 500mg por 20 gotas.

        System.out.println("Você deve tomar " + gotas + " gotas");

        input.close();
    }
}
