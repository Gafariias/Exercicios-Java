import java.util.Scanner;

public class CarroNovo {
    public static void main(String[] args) throws Exception {
        
        //Variaveis
        Scanner input = new Scanner(System.in);
        float distribuidor = 0;
        float valorDistri = 0;
        float imposto = 0;
        float ValorImpos;
        float CustoFabrica = 0;
        float CustoConsumidor = 0;

        //Recebendo dados
        System.out.print("Qual o custo de fabrica do veiculo? R$");
        CustoFabrica = input.nextFloat();

        //testando os valores
        if (CustoFabrica <= 12000) {
            distribuidor = 0.05f;
        } else if (CustoFabrica <= 25000) {
            distribuidor = 0.10f;
            imposto = 0.15f;
        } else {
            distribuidor = 0.15f;
            imposto = 0.20f;
        }

        //Valores do distribuidor, dos impostos e do consumidor
        valorDistri = CustoFabrica * distribuidor;
        ValorImpos = CustoFabrica * imposto;
        CustoConsumidor = valorDistri + ValorImpos + CustoFabrica;

        //Informando os dados ao usuario
        System.out.print("\nO custo do carro ao consumidor seria de: R$" + CustoConsumidor);

        input.close();
    }
}
