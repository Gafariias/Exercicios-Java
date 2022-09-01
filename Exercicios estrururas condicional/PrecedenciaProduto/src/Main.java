import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int preco = 0;
        int codigo = 0;
        String proced = "";

        //Obtendo dados
        System.out.print("Qual o preço do produto? R$");
        preco = input.nextInt();
        
        System.out.print("Qual o código do produto? ");
        codigo = input.nextInt();

        //Testando o código do produto
        switch (codigo) {
            case 1:
                proced = "sul";
                break;
            case 2:
                proced = "norte";
                break;
            case 3:
                proced = "leste";
                break;
            case 4:
                proced = "oeste";
                break;
        }

        System.out.println();

        if (codigo >= 5 && codigo <= 6) {
            proced = "nordeste";
        } else if (codigo >= 7 && codigo <= 9) {
            proced = "sudeste";
        } else if (codigo >= 10 && codigo <= 20) {
            proced = "centro-oeste";
        } else if (codigo > 20 && codigo <= 30) {
            proced = "nordeste";
        }

        System.out.println("O produto de código " + codigo + " e preço R$" + preco + " veio do " + proced);

        input.close();
    }
}
