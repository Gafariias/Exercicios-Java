import java.util.Scanner;

public class Menus {
    
    Scanner input = new Scanner(System.in);
    
    private int escolhaPrincipal;
    private int escolhaImposto;
    private int escolhaNovoSalario;
    private int escolhaClassific;

    private Double salario;
    private Double imposto;
    private Double novoSalario;
    private String classificacao;

    public void menuPrincipal() {

        //resetando os campos
        escolhaPrincipal = 0;
        escolhaImposto = 0;
        escolhaNovoSalario = 0;
        escolhaClassific = 0;

        //Limpando o terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Cabeçalho
        System.out.println();
        System.out.println("==================================================================");
        System.out.println("                          MENU PRINCIPAL                          ");
        System.out.println("==================================================================");
        System.out.println();

        //Perguntando ao usuario qual opção ele deseja utilizar
        System.out.println("Para onde você deseja ir? ");
        System.out.println(" 1 para impostos");
        System.out.println(" 2 para novo salário");
        System.out.println(" 3 para classificação");
        System.out.println(" 4 ou 5 para finalizar o programa");
        System.out.print("Digite a opção desejada: ");
        escolhaPrincipal = input.nextInt();

        //Validando o dado inserido
        while (escolhaPrincipal > 5 || escolhaPrincipal < 1) {

            System.out.println();
            System.out.print("Opção invalida, digite uma opção válida. ");
            escolhaImposto = input.nextInt();
        }

        //Fechando o menu
        System.out.println();
        System.out.println("==================================================================");
        
    }

    public void menuImpostos() {

        //resetando os campos
        escolhaPrincipal = 0;
        escolhaImposto = 0;
        escolhaNovoSalario = 0;
        escolhaClassific = 0;

        //Limpando o terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Cabeçalho
        System.out.println();
        System.out.println("==================================================================");
        System.out.println("                             IMPOSTOS                             ");
        System.out.println("==================================================================");
        System.out.println();

        //Obtendo o salario do usuario
        if (salario == null) {
            System.out.print("Qual o seu salário? R$");
            salario = input.nextDouble();
            System.out.println();
        }

        //Calculando o valor do imposto
        if (salario < 500) {
            imposto = salario * 0.05;
        } else if (salario >= 500 && salario < 850) {
            imposto = salario * 0.10;
        } else {
            imposto = salario * 0.15;
        }

        //Informando o valor de imposto do usuario
        System.out.println("O valor do imposto é de R$" + imposto);
        System.out.println();

        //Perguntando ao usuario qual opção ele deseja utilizar
        System.out.println("------------------------------------------------------------------");
        System.out.println();
    
        System.out.println("Para onde você deseja ir? ");
        System.out.println(" 1 para voltar ao menu principal");
        System.out.println(" 2 para novo salário");
        System.out.println(" 3 para classificação");
        System.out.println(" 4 ou 5 para finalizar o programa");
        System.out.print("Digite a opção desejada: ");
        escolhaImposto = input.nextInt();

        //Validando o dado inserido
        while (escolhaImposto > 5 || escolhaImposto < 1) {

            System.out.println();
            System.out.print("Opção invalida, digite uma opção válida. ");
            escolhaImposto = input.nextInt();
        }

        //Fechando o menu
        System.out.println();
        System.out.println("==================================================================");
    }

    public void menuNovoSalario() {

        //resetando os campos
        escolhaPrincipal = 0;
        escolhaImposto = 0;
        escolhaNovoSalario = 0;
        escolhaClassific = 0;

        //Limpando o terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Cabeçalho
        System.out.println();
        System.out.println("==================================================================");
        System.out.println("                           NOVO SALARIO                           ");
        System.out.println("==================================================================");
        System.out.println();

        //Obtendo o salario do usuario
        if (salario == null) {
            System.out.print("Qual o seu salário? R$");
            salario = input.nextDouble();
            System.out.println();
        }

        //Calculando o valor do novo salario
        if (salario < 450) {
            novoSalario = salario + 000;
        } else if (salario >= 450 && salario < 750) {
            novoSalario = salario + 75;
        } else if (salario >= 750 && salario <= 1500) {
            novoSalario = salario + 50;
        } else {
            novoSalario = salario +250;
        }

        //Informando o valor do novo salario ao usuario
        System.out.println("O valor do seu novo salario é de R$" + novoSalario);
        System.out.println();

        //Perguntando ao usuario qual opção ele deseja utilizar
        System.out.println("------------------------------------------------------------------");
        System.out.println();
    
        System.out.println("Para onde você deseja ir? ");
        System.out.println(" 1 para voltar ao menu principal");
        System.out.println(" 2 para novo impostos");
        System.out.println(" 3 para classificação");
        System.out.println(" 4 ou 5 para finalizar o programa");
        System.out.print("Digite a opção desejada: ");
        escolhaNovoSalario = input.nextInt();

        //Validando o dado inserido
        while (escolhaNovoSalario > 5 || escolhaNovoSalario < 1) {

            System.out.println();
            System.out.print("Opção invalida, digite uma opção válida. ");
            escolhaNovoSalario = input.nextInt();
        }

        //Fechando o menu
        System.out.println();
        System.out.println("==================================================================");
    }

    public void menuClassificação() {

        //resetando os campos
        escolhaPrincipal = 0;
        escolhaImposto = 0;
        escolhaNovoSalario = 0;
        escolhaClassific = 0;

        //Limpando o terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Cabeçalho
        System.out.println();
        System.out.println("==================================================================");
        System.out.println("                          CLASSIFICAÇÃO                           ");
        System.out.println("==================================================================");
        System.out.println();

        //Obtendo o salario do usuario
        if (salario == null) {
            System.out.print("Qual o seu salário? R$");
            salario = input.nextDouble();
            System.out.println();
        }

        //Calculando o valor do novo salario
        if (salario <= 700) {
            classificacao = "mal remunerado";
        } else {
            classificacao = "bem remunerado";
        }

        //Informando o valor do novo salario ao usuario
        System.out.println("Você é " + classificacao);
        System.out.println();

        //Perguntando ao usuario qual opção ele deseja utilizar
        System.out.println("------------------------------------------------------------------");
        System.out.println();
    
        System.out.println("Para onde você deseja ir? ");
        System.out.println(" 1 para voltar ao menu principal");
        System.out.println(" 2 para novo impostos");
        System.out.println(" 3 para novo salario");
        System.out.println(" 4 ou 5 para finalizar o programa");
        System.out.print("Digite a opção desejada: ");
        escolhaImposto = input.nextInt();

        //Validando o dado inserido
        while (escolhaClassific > 5 || escolhaClassific < 1) {

            System.out.println();
            System.out.print("Opção invalida, digite uma opção válida. ");
            escolhaClassific = input.nextInt();
        }

        //Fechando o menu
        System.out.println();
        System.out.println("==================================================================");
    }

    public void finalizar() {

        //Limpando o terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Cabeçalho
        System.out.println();
        System.out.println("==================================================================");
        System.out.println("                       PROGRAMA FINALIZADO                        ");
        System.out.println("==================================================================");
        System.out.println();

        //Informando todos os dados ao usuario
        System.out.println("O imposto foi de R$" + imposto);
        System.out.println("O novo salário é de R$" + novoSalario);
        System.out.println("Sua classificação é " + classificacao);

        //Fechar o programa
        System.out.println();
        System.out.println("==================================================================");
    }

    //getters e setters
    public int getEscolhaPrincipal() {
        return escolhaPrincipal;
    }
    public int getEscolhaImposto() {
        return escolhaImposto;
    }
    public int getEscolhaNovoSalario() {
        return escolhaNovoSalario;
    }
    public int getEscolhaClassific() {
        return escolhaClassific;
    }
}