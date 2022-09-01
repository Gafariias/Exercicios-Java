/*  
    Desenvolva um programa para determinar a média final e a situação (Aprovado, Reprovado ou Exame) de um aluno em uma disciplina. 
    São dadas as notas de três provas, o número de aulas ministradas e o número de faltas do aluno. 
    Sabe-se que a média final é a média aritmética dessas três provas e que a média para aprovação é 7, menor do que 3 para reprovação e as demais em exame. Entretanto, o aluno estará reprovado se tiver faltado a mais do que 25% das aulas.
*/

import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) throws Exception {

        //Variaveis
        Scanner input = new Scanner(System.in);
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        int aulas = 0;
        int faltas = 0;
        float med = 0;

        //Obtendo dados
        System.out.print("Digite a primeira nota do aluno: ");
        n1 = input.nextFloat();

        System.out.print("Digite a segunda nota: ");
        n2 = input.nextFloat();

        System.out.print("Digite a ptercira nota: ");
        n3 = input.nextFloat();

        System.out.print("Digite a quantidade de aulas ministradas: ");
        aulas = input.nextInt();

        System.out.print("Digite a quantidade de faltas: ");
        faltas = input.nextInt();

        //Média
        med = (n1 + n2 + n3) / 3;
        System.out.print("\nSua média foi de " + med);

        //Teste e informando os dados ao usuario
        if (faltas > (aulas * 0.25f)) {
            if (med >= 7) {
                System.out.println("\nAPROVADO.");
            } else if (med >= 3) {
                System.out.println("\nEXAME.");
            } else {
                System.out.println("\nREPROVADO.");
            }
        } else {
            System.out.println("REPROVADO POR FALTA.");
        }

        input.close();
    }
}
