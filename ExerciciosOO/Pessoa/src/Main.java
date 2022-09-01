import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;
        Double altura;

        //Obtendo os dados
        System.out.print("Qual seu nome? ");
        nome = input.next();

        System.out.print("Qual sua idade? ");
        idade = input.nextInt();

        System.out.print("Qual sua altura? ");
        altura = input.nextDouble();

        //Definindo o objeto pessoa
        Pessoa pessoa = new Pessoa(nome, idade, altura);

        pessoa.fazerAniversario();
        pessoa.imprimirDados();
    }
}
