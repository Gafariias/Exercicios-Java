public class Produto {
    
    private Float preco;
    private int categoria;
    private String situacao;
    private Float valorImposto;
    private Float valorAumento;
    private Float novoPreco;
    private String classificacao;


    public Produto(Float preco, 
        int categoria, 
        String situacao, 
        Float valorAumento, 
        Float valorImposto,
        Float novoPreco,
        String classificacao) {

        this.preco = preco;
        this.categoria = categoria;
        this.situacao = situacao;
        this.valorAumento = valorAumento;
        this.valorImposto = valorImposto;
        this.novoPreco = novoPreco;
        this.classificacao = classificacao;
    }

    public void imprimirResultado() {

        String c = Integer.toString(categoria);
        if (c.equals("1")) {
            c = "limpeza";
        } else if (c.equals("2")) {
            c = "alimentação";
        } else if (c.equals("3")) {
            c = "vestuário";
        }

        if (situacao.equals("R")) {
            situacao = "necessita de refrigeração";
        } else {
            situacao = "não necessita de refrigeração";
        }

        System.out.println();

        System.out.println("O código do produto é PD" + (int)(Math.random() * 100));
        System.out.println("O seu preço original era de R$" + preco);
        System.out.println("Este produto é de " + c);
        System.out.println("Este produto " + situacao);
        System.out.println("Ele possui R$" + valorAumento + " de aumento");
        System.out.println("Ele possui R$" + valorImposto + " de imposto");
        System.out.println("Seu preço final foi de R$" + novoPreco + " portando ele é um produto com valor " + classificacao);
    }
}
