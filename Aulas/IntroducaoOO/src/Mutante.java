public class Mutante {
    
    public String primeiroNome;
    public String sobrenome;
    public String nomeMutante;
    public int idade;
    public int nivel;

    @Override
    public String toString() {
        return "Mutante: " + nomeMutante
        + "\nNome real: " + primeiroNome + " " + sobrenome
        + "\nIdade: " + idade
        + "\nNivel: " + obterNomeNivel();
    }

    public String obterNomeNivel() {
        String nomeNivel = "";
        switch (nivel) {
            case 0:
                nomeNivel = "Episolon";
                break;
            case 1:
                nomeNivel = "Delta";
                break;
            case 2:
                nomeNivel = "Gamma";
                break;
            case 3:
                nomeNivel = "Beta";
                break;
            case 4:
                nomeNivel = "Alpha";
                break;
            case 5:
                nomeNivel = "Omega";
                break;
        }

        return nomeNivel;
    }
}
