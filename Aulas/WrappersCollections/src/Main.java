// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // // Wrappers: wrapper é qualquer entidade que encapsula (envolve) outro item
        // // O java conta com diversos Wrappers que adicionam funcionalidades a outras classes ou tipos primitivos

        // // Autoboxing: conversão automatica de tipos primitivos em seu respectivo wrapper
        //     Boolean b = true;
        //     Integer n = 42;
        //     Double pi = 3.14;

        //     System.out.println(pi.intValue());
        
        // //Unboxing: coverter um objeto para um tipo primitivo
        //     boolean a = b;
        //     int y = n;
        //     double pi2 = pi;

        //     System.out.println("È par? " + ehPar(n));

        
        // List<Double> listaDeDoubles = new ArrayList<Double>();
        
        // //Autoboxing
        //     listaDeDoubles.add(3.14);
        
        // //Unboxing
        //     double valorDePi = listaDeDoubles.get(0);
        //     System.out.println("Pi = " + valorDePi);

        Scanner input = new Scanner(System.in);

        System.out.print("Insira um Double: ");
        String valorLido = input.nextLine();

        input.close();

        try {
            double d = Double.parseDouble(valorLido);
                System.out.println(d + " é um double valido");
        } catch (NumberFormatException e) {
            System.out.println(valorLido + " não é um double valido");
        }
    }

    public static boolean ehPar(int n) {
        return n % 2 == 0;
    }
}
