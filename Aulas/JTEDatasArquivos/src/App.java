import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Data 
            LocalDate date = LocalDate.now();
            System.out.println(date);
            System.out.println(date.getDayOfMonth());
            System.out.println(date.plusDays(1));
            System.out.println(date.plusMonths(1));

        // Hora
            LocalTime time = LocalTime.now();
            System.out.println(time);

        // Data e Hora
            LocalDateTime dateTime = LocalDateTime.now();

            System.out.println();
            System.out.println(dateTime);

        // Formatar
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            String dataHoraFormatada = dateTime.format(formatador);

            System.out.println();
            System.out.println(dataHoraFormatada);
            System.out.println();

        Pessoa p = new Pessoa("Sarah");
        p.setDatanasc(LocalDate.of(2003, 12, 11));

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

    }
}
