public class Main {
    public static void main(String[] args) {

        Mutante mutante1 = new Mutante();
        mutante1.primeiroNome = "Charles";
        mutante1.sobrenome = "Xavier";
        mutante1.nomeMutante = "Professor X";
        mutante1.idade = 64;
        mutante1.nivel = 5;

        System.out.println(mutante1.toString());
            
        System.out.println();
        
        Mutante mutante2 = new Mutante();
        mutante2.primeiroNome = "Scott";
        mutante2.sobrenome = "Summer";
        mutante2.nomeMutante = "Cyclops";
        mutante2.idade = 32;
        mutante2.nivel = 4;

        System.out.println(mutante2.toString());

    }
}
