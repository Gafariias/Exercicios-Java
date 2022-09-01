public class App {
    public static void main(String[] args) throws Exception {
        
        //Limpar terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        //Cabeçalho 
        System.out.println("=================================================================");
        System.out.println("                         Conta bancaria                          ");
        System.out.println("=================================================================");
        System.out.println();

        ContaBanco conta = new ContaBanco(900, 1000);

        conta.depositar(100);
        conta.sacar(499);
        conta.depositar(400);
        
        System.out.println();
        System.out.println("=================================================================");
    }
}
