import java.util.Scanner;

public class Elevador {
    
    private Scanner input = new Scanner(System.in);

    private int andar = 0;
    private int pessoas = 0;
    private int capacidadeMaxima;
    private int qtdeAndares;

    public void inicializa() {

        //Capacidade maxima do elevador
        System.out.print("Qual a capacidade do elevador? ");
        capacidadeMaxima = input.nextInt();

        while (capacidadeMaxima <= 0) {
            System.out.print("A capacidade maxíma não pode ser menor do que zero.");
            capacidadeMaxima = input.nextInt();
        }

        System.out.println();

        //Quantidade de andares do prédio
        System.out.print("Quantos andares possui este prédio? ");
        qtdeAndares = input.nextInt();

        while (qtdeAndares <= 0) {
            System.out.print("A quantidade de andares não pode ser menor do que zero.");
            qtdeAndares = input.nextInt();
        }

        System.out.println();
    }

    public void entra() {

        if (pessoas < capacidadeMaxima) {
            pessoas++;
            System.out.println("Pessoa adicionada com sucesso!");
            System.out.println("A quantidade de pessoas no elevador é de: " + pessoas + " ainda pode entrar mais " + (capacidadeMaxima - pessoas) + " pessoas no elevador");
        } else {
            System.out.println("Não é possivel adicionar mais uma pessoa ao elevador");
        }

        System.out.println();

    }

    public void sai() {

        if (pessoas > 0) {
            pessoas--;
            System.out.println("Pessoa removida com sucesso.");

            System.out.println("A quantidade de pessoas no elevador é de: " + pessoas + " ainda pode sair mais " + (capacidadeMaxima - pessoas) + " pessoas do elevador");
        } else {
            System.out.println("O elevador ja esta vazio");
        }

        System.out.println();
    }

    public void sobe() {
        if (andar < qtdeAndares) {

            andar++;
            System.out.println("O elevador subiu um andar");
            System.out.println("Agora o elevador esta no andar " + andar);
        } else {
            System.out.println("Você ja esta no ultimo andar");
        }

        System.out.println();
    }

    public void desce() {

        if (andar > 0) {
        
            andar--;
            System.out.println("O elevador desceu um andar");
            System.out.println("Agora o elevador está no andar " + andar);
        } else {
            System.out.println("Você ja está no térreo.");
        }

        System.out.println();
    }
}
