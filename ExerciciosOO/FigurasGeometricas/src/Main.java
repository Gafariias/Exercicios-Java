import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();

        int escolha = 0;

        //Cabeçalho
        System.out.println("-----------------------------------------------------");
        System.out.println("                FIGURAS GEOMÉTRICAS                  ");
        System.out.println("-----------------------------------------------------");
        System.out.println();

        //Escolha do tipod e forma geometrica
        System.out.println("Qual o tipo de figura? ");
        System.out.println("  Digite 1 para quadrado ");
        System.out.println("  Digite 2 para retângulo ");
        System.out.println("  Digite 3 para triangulo ");
        System.out.println("  Digite 4 para círculo ");

        //Escolha do usuario
        System.out.print("Digite o numero: ");
        escolha = input.nextInt();
        System.out.println();

        //Validando o valor da escolha.
        while (escolha < 1 || escolha > 4) {
            System.out.println("valor invalido, digite um valor entre 1 e 4");
            escolha = input.nextInt();
        }

        //Chamando as classes referente a escolha
        if (escolha == 1) {
            quadrado.calcularArea();
        } else if (escolha == 2) {
            retangulo.calcularArea();
        } else if (escolha == 3) {
            triangulo.calcularArea();
        } else {
            circulo.calcularArea();
        }

        //Fechando o programa
        System.out.println();
        System.out.println("-----------------------------------------------------");

        input.close();
    }
}
