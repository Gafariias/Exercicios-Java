import java.io.File;
import java.io.IOException;

public class CriarArquivo {
    public static void main(String[] args) throws IOException {

        String validPath = "novoArquivo.txt";
        String invalidPath = "+=:";
        
        File f = new File(invalidPath);

        try {

            if (f.createNewFile()) {
                System.out.println("Criado arquivo com nome: " + f.getName() + ".");
            } else {
                System.out.println("Arquivo já existe.");
            }

            System.out.println();
            System.out.println("Caminho do arquivo: " + f.getAbsolutePath());
            System.out.println("Caminho: " + f.getPath());
            System.out.format("Tamanho do arquivo: %d bytes.", f.length());
        } catch(IOException e) {
            
            //Tratar exceções
            System.out.println("Um erro ocorreu: " + e.getMessage());
        } finally {
            System.out.println();
            System.out.println("Proximos passos: ");
        }
    }
        
}
