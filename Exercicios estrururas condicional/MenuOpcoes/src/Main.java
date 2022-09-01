public class Main {
    public static void main(String[] args) {

        boolean inicializar = true;
        Boolean finalizar = false;
        
        Menus menus = new Menus();

        do { 

            //Menu principal
            if (inicializar || menus.getEscolhaImposto() == 1 || menus.getEscolhaNovoSalario() == 1 || menus.getEscolhaClassific() == 1) {
                menus.menuPrincipal();
            }

            //Menu de impostos
            if (menus.getEscolhaPrincipal() == 1 || menus.getEscolhaNovoSalario() == 2 || menus.getEscolhaClassific() == 2) {
                menus.menuImpostos();
            }

            //Menu de novo salario
            if (menus.getEscolhaPrincipal() == 2 || menus.getEscolhaImposto() == 2 || menus.getEscolhaClassific() == 3) {
                menus.menuNovoSalario();
            }

            //Menu de classificação
            if (menus.getEscolhaPrincipal() == 3 || menus.getEscolhaImposto() == 3 || menus.getEscolhaNovoSalario() == 3) {
                menus.menuClassificação();
            }

            //Finalizar programa 
            if (menus.getEscolhaPrincipal() == 4 || menus.getEscolhaPrincipal() == 5 ||
            menus.getEscolhaImposto() == 4 || menus.getEscolhaImposto() == 5 ||
            menus.getEscolhaNovoSalario() == 4 || menus.getEscolhaNovoSalario() == 5 ||
            menus.getEscolhaClassific() == 4 || menus.getEscolhaClassific() == 5) {

                finalizar = true;
            }

            inicializar = false;
        } while (finalizar == false);

        menus.finalizar();
    }
}
