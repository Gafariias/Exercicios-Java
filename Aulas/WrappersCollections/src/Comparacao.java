public class Comparacao {
    public static void main(String args[]) {

        //Comparando Wrappers
            int n1 = 4506;           
            int n2 = 4506;
            System.out.println(n1 == n2);

            Integer n3 = 4506;
            Integer n4 = 4506;
            System.out.println(n3 == n4);
            System.out.println(n3.equals(n4));
    }
}
