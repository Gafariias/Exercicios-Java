public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Sarah", "Nakazoni", 18);
        Pessoa pessoa2 = new Pessoa("Carlos", "Eduardo", 27);

        Carro carro = new Carro("HB20", pessoa);
        Carro carro2 = new Carro("Fusca", pessoa2);
        
        System.out.print("\nNome: " + pessoa.getNomeCompleto() + 
            "\nIdade: " + pessoa.getIdade() + 
            "\nModelo do carro: " + carro.getModelo());
        
        System.out.println();
        
        System.out.print("\nNome: " + pessoa2.getNomeCompleto() + 
            "\nIdade: " + pessoa2.getIdade() + 
            "\nModelo do carro: " + carro2.getModelo());
    }
}
