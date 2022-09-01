import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes {
    public static void main(String args[]) {

        CollectionsDeString();
    }

    private static void CollectionsDeString() {

        //Criar ArrayList
            ArrayList<String> professores = new ArrayList<String>();
            Scanner input = new Scanner(System.in);

        // Adicionar objetos (add)
            professores.add("José");     // 0
            professores.add("Ricardo");  // 1
            professores.add("Eliana");   // 2
            professores.add("Vanessa");  // 3
            
            System.out.println("Antes do for:");
            System.out.println(professores);

            System.out.println();

            System.out.print("Professor a ser removido: ");
            String remover = input.nextLine();
            System.out.println();

        // Obter item na lista (get)

        // Remover objetos (remove)
            // professores.remove(1);
            // System.out.println(professores);

        // Percorrer coleção (forEach)
        
            System.out.println();
            professores.forEach(p -> {

                if (p.equals(remover)) {
                    professores.remove(p);
                }
            });
        
        // for (int i = 0; i < professores.size(); i++) {
        //     if (professores.get(i).equals(remover)) {
        //         professores.remove(i);
        // }}

        System.out.println("Depois do for: ");
        System.out.println(professores);

        input.close();
    }
}
