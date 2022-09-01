public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.armazenaPessoa("Gabriel", 19, 1.83f);
        agenda.armazenaPessoa("Sarah", 18, 1.65f);
        agenda.armazenaPessoa("Gustavo", 22, 1.77f);

        agenda.removePessoa("Sarah");
    }
}
