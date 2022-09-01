import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        exemploAssocioacao();
        exemploAgregacao();
        exemploComposicao();
        
        System.out.println();
    }
    
    private static void exemploAgregacao() {

        Roda roda1 = new Roda("XPTO");
        Roda roda2 = new Roda("XYZ");

        List<Roda> rodas = new ArrayList<Roda>();
        rodas.add(roda1);
        rodas.add(roda2);

        Bicicleta bicicleta = new Bicicleta("Super Bike");
        bicicleta.setRodas(rodas);

        System.out.println("Os modelos de roda da bicicleta " + bicicleta.getModelo() + " são " + bicicleta.getRodas()); 
        
        System.out.println();
    }

    private static void exemploAssocioacao() {
        
        Professor amanda = new Professor("Amanda Lopes");
        Professor victor = new Professor("Victor Lopez");
        
        Departamento computacao = new Departamento("Computação I");

        Professor[] professores = {amanda, victor};

        computacao.setProfessores(professores);

        //System.out.println("Os professores do departamento " + computacao.getNome() + " são " + computacao.printProfessores());

        System.out.println();
    }

    private static void exemploComposicao() {

    }
}
