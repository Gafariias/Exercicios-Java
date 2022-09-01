import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Double lado = 0.0;
        Double base = 0.0;
        Double altura = 0.0;
        Double raio = 0.0;
        int escolha = 0;

        //Limpar o terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
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

        //Validando o valor da escolha.
        while (escolha < 1 || escolha > 4) {
            System.out.println("valor invalido, digite um valor entre 1 e 4");
            escolha = input.nextInt();
        }

        //Chamando as classes referente a escolha
        switch (escolha) {
            case 1:
            
                //Cabeçalho
                System.out.println("                       QUADRADO                      ");
                System.out.println();

                //Obtendo dados
                System.out.print("Qual o valor dos lados? ");
                lado = input.nextDouble();

                Quadrado quadrado = new Quadrado(lado);
                quadrado.calcularArea();

                break;
            case 2:
            
                //Inicio
                System.out.println("                     RETÂNGULO                       ");
                System.out.println();

                //Obtendo os dados
                System.out.print("Qual a base do retângulo? ");
                base = input.nextDouble();

                System.out.print("Qual a altura do retângulo? ");
                altura = input.nextDouble();
            
                Retangulo retangulo = new Retangulo(base, altura, true);
                retangulo.calcularArea();

                break;
            case 3:

                //Inicio
                System.out.println("                     TRIÂNGULO                      ");
                System.out.println();

                //Obtendo os dados
                System.out.print("Qual a base do triângulo? ");
                base = input.nextDouble();

                System.out.print("Qual a altura do triângulo? ");
                altura = input.nextDouble();

                Triangulo triangulo = new Triangulo(base, altura);
                triangulo.calcularArea();

                break;
            case 4:

                //Inicio
                System.out.println("                      CÍRCULO                      ");
                System.out.println();

                //Obtendo dados
                System.out.print("Qual o raio desse círculo? ");
                raio = input.nextDouble();

                Circulo circulo = new Circulo(raio);
                circulo.calcularArea();
                
                break;
            }

        //Fechando o programa
        System.out.println();
        System.out.println("-----------------------------------------------------");

        input.close();
    }
}
