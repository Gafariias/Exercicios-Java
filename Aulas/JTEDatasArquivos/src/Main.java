import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    
    public final static String FILE_PATH = "c:\\data\\arquivo.txt";

    public static void main(String[] args) {
        try {
            escrever("Ola, mundo!");
            lerArquivo();
            adicionarTexto("\nMais Texto...");
            lerArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void escrever(String texto) throws IOException {
        Files.write(Path.of(FILE_PATH), texto.getBytes());
    }

    private static void adicionarTexto(String texto) throws IOException {
        Path path = Paths.get(FILE_PATH);
        Files.write(path, texto.getBytes(), StandardOpenOption.APPEND);
    }

    private static void lerArquivo() throws IOException {
        Path path = Paths.get(FILE_PATH);
        Files.lines(path).forEach(line -> System.out.println(line));
    }
}
