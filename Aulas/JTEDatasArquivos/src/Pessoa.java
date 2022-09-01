import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    
    private String nome;
    private LocalDate dataNasc;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setDatanasc(LocalDate data) {
        this.dataNasc = data;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        int idade = Period.between(this.dataNasc, hoje).getYears();

        return idade;
    }
}
