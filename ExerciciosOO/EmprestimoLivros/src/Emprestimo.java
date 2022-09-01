import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emprestimo {
    
    List<String> objTitulos = new ArrayList<String>();
    List<String> objNomes = new ArrayList<String>();
    List<Integer> objIdades = new ArrayList<Integer>();
    List<String> objCPF = new ArrayList<String>();
    
    public void fazerEmprestimo(String titulo, String nome, Integer idade, String CPF) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setCPF(CPF);

        Livro livro = new Livro();
        livro.setTitulo(titulo);
        
        objTitulos.add(livro.getTitulo());
        objNomes.add(pessoa.getNome());
        objIdades.add(pessoa.getIdade());
        objCPF.add(pessoa.getCPF());

        String[] titulos = objTitulos.toArray(new String[0]);
        String[] nomes = objNomes.toArray(new String[0]);
        Integer[] idades = objIdades.toArray(new Integer[0]);
        String[] CPFs = objCPF.toArray(new String[0]);

        System.out.println();
        System.out.println(Arrays.asList(titulos));
        System.out.println(Arrays.asList(nomes));
        System.out.println(Arrays.asList(idades));
        System.out.println(Arrays.asList(CPFs));
        System.out.println();
        
    }

    /* 
    Historia
    a tarde pra fazer cadeira
    auto escola

    caderno
    penal
    jaleco
    oculos
    roupa
    */
}
