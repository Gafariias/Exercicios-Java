import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base = 0;
        double alt = 0;

        System.out.println();

        //Obtendo os dados
        //Base
        do {

            System.out.print("Qual a base do triângulo? (Se triângulo retângulo, é o mesmo que o cateto oposto) ");
            base = input.nextDouble();

            if (base <= 0) {

                System.out.println();
                System.out.print("Valor da base invalido, o valor precisa ser maior que zero. ");
                System.out.println();
            }
            
            
        } while (base <= 0);
        
        //Altura
        do {

            System.out.print("Qual a altura do triângulo? (Se triângulo retângulo, é o mesmo que o cateto adjacente) ");
            alt = input.nextDouble();

            if (alt <= 0) {

                System.out.println();
                System.out.print("Valor de altura invalido, o valor precisa ser maior que zero. ");
                System.out.println();
            }
            
            
        } while (alt <= 0);

        //calculando a área
        double area = (base * alt) / 2;

        //Informando os dados ao usuario
        System. out.println();
        System. out.println("O triângulo de base " + base + " e altura " + alt + " possui uma área de " + area);

        input.close();

        System.out.println();
    }
}
