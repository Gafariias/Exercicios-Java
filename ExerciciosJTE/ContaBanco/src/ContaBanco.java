public class ContaBanco {
    
    //Atributos
    private double saldo;
    private double limite;

    //Construtor
    public ContaBanco(double valorSaldo, double valorLimite) {
        this.saldo = valorSaldo;
        this.limite = valorLimite;

        if (saldo > limite) {
            ContaException conta = new ContaException("Valor do saldo excede o limite da conta.");
            conta.mensagemErro();
        }
    }

    //Retorna o saldo da conta
    public double getSaldo() {
        return saldo;
    }
    //Retorna o limite da conta
    public double getLimite() {
        return limite;
    }

    //Retorna o saldo somado ao limite
    public double getSaldoComLimite() {
        return saldo + limite;
    }

    //Métodos

    //Sacar valor
    public boolean sacar(double valor) throws ContaException {

        if (valor < 500 && saldo > valor) {

            saldo = saldo - valor;

            System.out.println("Saque bem sucedido");
            System.out.println();
            System.out.println("Saldo: R$" + saldo);
            System.out.println("Limite: R$" + limite);

            return true;
        } else {
            //Mensagem de erro
            if (valor >= 500) {
                ContaException erro = new ContaException("Impossivel realizar saques maiores que R$500.00");
                erro.mensagemErro();
            } else {
                ContaException erro = new ContaException("Saldo insuficiente para realizar a transação");
                erro.mensagemErro();
            }
            System.out.println();

            return false;
        }

        
    }

    //Depositar valor
    public void depositar(double valor) throws ContaException {

        if (saldo > limite) {
            //Mensagem de erro
            ContaException conta = new ContaException("Valor do saldo excede o limite da conta.");
            conta.mensagemErro();
        } else {
            if (valor < 1000.0) {
                if ((valor + saldo) > limite) {
                    //Mensagem de erro
                    ContaException conta = new ContaException("O saldo excederá o limite da conta.");
                    conta.mensagemErro();
                } else {
                    saldo = saldo + valor;
                    System.out.println("Deposito realizado com sucesso");
    
                    System.out.println();
                    System.out.println("Saldo: " + saldo);
                    System.out.println("Limite: " + limite);
                    System.out.println();
                }
                
            } else {
                //Mensagem de erro
                ContaException conta = new ContaException("Imposivel realizar depositos superiores a R$1000.0.");
                conta.mensagemErro();
    
                System.out.println();
                System.out.println("Saldo: " + saldo);
                System.out.println("Limite: " + limite);
                System.out.println();
            }
        }
    }
}
