public class Main {
    public static void main(String[] args) {
        
        Elevador elevador = new Elevador();

        elevador.inicializa();

        elevador.entra();
        elevador.sobe();
        elevador.sai();

        elevador.entra();
        elevador.sobe();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sai();
        elevador.sai();
        elevador.sai();
    }
}
