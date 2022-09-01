/*
    O preço unitário do produto comprado, seguindo a Tabela abaixo;
    O preço total da nota;
    O valor do desconto, seguindo a Tabela abaixo e aplicado sobre o preço total da nota; e
    O preço final da nota depois do desconto.
*/

public class Produto {
    
    private int codigo;
    private int quantidade;
    private int precoUn;
    private int precoTot;
    private Double desconto;
    double valorDesconto;
    private double precoFim;

    public Produto(int codigo, int quantidade, int precoUn, int precoTot, Double desconto, Double valorDesconto, Double precoFim) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoUn = precoUn;
        this.precoTot = precoTot;
        this.desconto = desconto;
        this.valorDesconto = valorDesconto;
        this.precoFim = precoFim;
    }

    public int getCodigo() {
        return codigo;
    }
    public Double getDesconto() {
        return desconto;
    }
    public double getPrecoFim() {
        return precoFim;
    }
    public int getPrecoTot() {
        return precoTot;
    }
    public int getPrecoUn() {
        return precoUn;
    }
    public double getValorDesconto() {
        return valorDesconto;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void imprimirResultado() {

        System.out.println();

        System.out.println("PRODUTO PD" + codigo);
        System.out.println();
        System.out.println("Valor unitario do produto: R$" + precoUn);
        System.out.println("Valor total na nota: R$" + precoTot);
        System.out.println("Valor do desconto obtido: R$" + valorDesconto);
        System.out.println("Valor final do produto: R$" + precoFim);
    }
}
