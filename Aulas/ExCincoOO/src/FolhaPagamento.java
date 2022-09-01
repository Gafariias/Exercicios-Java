public class FolhaPagamento {

    private static final double SALARIO_MINIMO = 450.0;
    private Funcionario funcionario;
    private int horasTrabalhadas;
    private double valorHora;
    private double salarioInicial;
    private double valorAuxilio;
    private double salarioFinal;

    //Construtor
    public FolhaPagamento(Funcionario funcionario, int horasTrabalhadas) {
        this.funcionario = funcionario;
        this.horasTrabalhadas = horasTrabalhadas; 
    }

    public void calcularSalarioFinal() {
        calcularHora();
        calcularSalarioInicial();
        calcularAuxilioAlimentacao();

        this.salarioFinal = this.salarioInicial + this.valorAuxilio;
    }

    //Imprimir o funcionario na tela
    public void imprimirFolha() {
        System.out.println("\nCódigo: " + funcionario.getCodigo());
        System.out.println("# de horas trabalhadas: " + horasTrabalhadas);
        System.out.println("Salario inicial: " + salarioInicial);
        System.out.println("Valor do auxilio alimentação: " + valorAuxilio);
        System.out.println("Salario final: " + salarioFinal);
        System.out.println();
    }

    //Getter e Setter
    //Numero de Horas trabalhadas
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    //Valor da hora trabalhada
    public double getValorHora() {
        return valorHora;
    }

    //Salario inicial
    public void setSalarioInicial(double salarioInicial) {
        this.salarioInicial = salarioInicial;
    }
    public double getSalarioInicial() {
        return salarioInicial;
    }

    //salario final
    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    public double getSalarioFinal() {
        return salarioFinal;
    }

    //Vale alimentação
    public void setValorAuxilio(double valorAuxilio) {
        this.valorAuxilio = valorAuxilio;
    }
    public double getValorAuxilio() {
        return valorAuxilio;
    }

    //Métodos

    private void calcularHora() {
        if (funcionario.getCategoria() == 'G') {
            if (funcionario.getTurno() == 'N') {
                valorHora = SALARIO_MINIMO * 0.18;
            } else {
                valorHora = SALARIO_MINIMO * 0.15;
            } 
        } else if (funcionario.getCategoria() == 'O') {
            if (funcionario.getTurno() == 'N') {
                valorHora = SALARIO_MINIMO * 0.13;
            } else {
                valorHora = SALARIO_MINIMO * 0.10;
            }
        }
    }

    private void calcularSalarioInicial() {
        this.salarioInicial = this.valorHora * this.horasTrabalhadas;
    }

    private void calcularAuxilioAlimentacao() {
        if (salarioInicial <= 300.00) {
            valorAuxilio = salarioInicial * 0.25;
        } else if (salarioInicial > 300 && salarioInicial <= 600) {
            valorAuxilio = salarioInicial * 0.15;
        } else {
            valorAuxilio = salarioInicial * 0.05;
        }
    }
}