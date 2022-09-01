import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    
    private Scanner input = new Scanner(System.in);
    private List<String> objNomes = new ArrayList<String>();
    private List<Integer> objIdades = new ArrayList<Integer>();
    private List<Float> objAlturas = new ArrayList<Float>();

    private String nome;
    private int idade;
    private Float altura;
    private Pessoa pessoa = new Pessoa();

    public void armazenaPessoa(String nome, int idade, Float altura) {

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setAltura(altura);

        objNomes.add(pessoa.getNome());
        objIdades.add(pessoa.getIdade());
        objAlturas.add(pessoa.getAltura());

        System.out.println(objNomes);
        System.out.println(objIdades);
        System.out.println(objAlturas);
    }
    
    String[] nomes = objNomes.toArray(new String[0]);
    Integer[] idades = objIdades.toArray(new Integer[0]);
    Float[] alturas = objAlturas.toArray(new Float[0]);

    public void removePessoa(String nome) {

        this.nome = nome;

        for (int i = 0; i < nomes.length; i++) {
            
            if (nomes[i] == nome) {
                objNomes.remove(i);
                objIdades.remove(i);
                objAlturas.remove(i);
            } else {
                System.out.println("Que odio");
            }
            System.out.print(i);
        }
        
        
        System.out.println(objNomes);
        System.out.println(objIdades);
        System.out.println(objAlturas);
    }
}
