public class Pessoa {
    
    private String nome;
    private int idade;
    private Double altura;

    public Pessoa(String nome, int idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    //Imprimir os dados
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

    //Incrementar idade
    public void fazerAniversario() {
        idade++;
    }

    //Getters e setters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Double getAltura() {
        return altura;
    }
}
