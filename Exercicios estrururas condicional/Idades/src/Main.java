import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Stack<Integer> idades = new Stack<Integer>();
        Integer idade = 0;
        int i = 1;
        Double soma = 0.0;
        Double med = 0.0;

        //Cabeçalho
        System.out.println("=====================================================");
        System.out.println("                    MÉDIA DE IDADES                  ");
        System.out.println("=====================================================");
        System.out.println();

        //Obtendo a quantidade de idades
        System.out.println("**Digite zero a qualquer momento para finalizar o programa**");
        
        System.out.println();
        
        //Loop
        do {
        
            //Obtendo as idades
            System.out.print("  Idade " + i + ": ");
            idade = input.nextInt();
            i++;
            
            if (idade > 0) {
                
                //Adicionando as idades maiores que zero na array
                idades.push(idade);
            }

        } while (idade > 0); 

        //Convertendo para array
        Object[] arrayObj = idades.toArray();
        Integer[] array = Arrays.asList(arrayObj).toArray(new Integer[0]);

        //Descobrindo a média
        for (int n = 0; n < array.length; n++) {

            soma = soma + array[n];
            med = soma / array.length;
        }

        System.out.println();
        System.out.println("A média arredondada de todos os numero digitados é igual a: " + String.format("%.2f", med));
        System.out.println();
        
        input.close();
    }
}
