import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Integer> objCanal = new ArrayList<Integer>();
        List<Integer> objPublico = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        int canal = 0;
        int publico = 0;

        Double publicoQuatro = 0.0;
        Double publicoCinco = 0.0;
        Double publicoSete = 0.0;
        Double publicoDoze = 0.0;
        Double total = 0.0;

        Double porcentQuatro = 0.0;
        Double porcentCinco = 0.0;
        Double porcentSete = 0.0;
        Double porcentDoze = 0.0;

        //Cabeçalho
        System.out.println("==================================================================");
        System.out.println("                       ESTATISTICA DE AUDIÊNCIA                   ");
        System.out.println("==================================================================");
        System.out.println("Digite zero como número do canal para encerrar a entrada de dados.");
        System.out.println();

        do {
            
            //Obtendo o canal
            System.out.print("Qual o numero do canal? ");
            canal = input.nextInt();

            //Verificando o dado inserido
            while (canal != 0 && canal != 4 && canal != 5 && canal != 7 && canal != 12) {

                System.out.print("Canal inexistente, por favor, digite um canal válido. ");
                canal = input.nextInt();
            }

            if (canal != 0) {

                //Obtendo a quantidade de publico
                System.out.print("Qual o publico desse canal? ");
                publico = input.nextInt();

                //Verificando a validade dos dados inseridos
                while (publico < 0) {

                    System.out.print("Valor invalido, o valor não pode ser negativo: ");
                    publico = input.nextInt();
                }

                System.out.println();

                //Adicionando os dados aos objetos que serão convertidos em arrays
                objCanal.add(canal);
                objPublico.add(publico);
            }
        } while (canal != 0);

        //Convertendo para array
        Object[] canalObj = objCanal.toArray();
        Integer[] canalArr = Arrays.asList(canalObj).toArray(new Integer[0]);
        canalArr.toString();

        Object[] publicoObj = objPublico.toArray();
        Integer[] publicoArr = Arrays.asList(publicoObj).toArray(new Integer[0]);
        publicoArr.toString();
        
        //Somando a quantidade de telespectadores em cada canal e o total
        for (int i = 0; i < canalArr.length; i++) {

            if (canalArr[i] == 4) {           //Canal 4
                publicoQuatro = publicoQuatro + publicoArr[i];
            } else if (canalArr[i] == 5) {    //Canal 5
                publicoCinco = publicoCinco + publicoArr[i];
            } else if (canalArr[i] == 7) {    //Canal 7
                publicoSete = publicoSete + publicoArr[i];
            } else if (canalArr[i] == 12) {    //Canal 12
                publicoDoze = publicoDoze + publicoArr[i];
            }

            total = publicoQuatro + publicoCinco + publicoSete + publicoDoze;
        }

        //Calculando as porcentagens
        porcentQuatro = (publicoQuatro / total) * 100;
        porcentCinco = (publicoCinco / total) * 100;
        porcentSete = (publicoSete / total) * 100;
        porcentDoze = (publicoDoze / total) * 100;

        System.out.println();
        System.out.println("==================================================================");
        System.out.println();

        //Informando os dados ao usuario
        System.out.println("A porcentagem de pessoas assistindo o canal 4 é de " + String.format("%.1f", porcentQuatro) + "%");
        System.out.println("A porcentagem de pessoas assistindo o canal 5 é de " + String.format("%.1f", porcentCinco) + "%");
        System.out.println("A porcentagem de pessoas assistindo o canal 7 é de " + String.format("%.1f", porcentSete) + "%");
        System.out.println("A porcentagem de pessoas assistindo o canal 12 é de " + String.format("%.1f", porcentDoze) + "%");

        System.out.println();
        System.out.println("==================================================================");

        input.close();
    }
}
