/*
Uma empresa possui dez funcionários com as seguintes características: código, número de horas trabalhadas no mês, turno de trabalho (M – matutino; V – vespertino; N – noturno), categoria (O – operário; ou G – gerente), valor da hora trabalhada. Sabendo-se que essa empresa deseja informatizar sua folha de pagamento, faça um programa que: 

a) Leia as informações dos funcionários, exceto o valor da hora trabalhada, não permitindo que sejam informações dos turnos e nem categorias inexistentes. Trabalhe sempre com a digitação de letras maiúsculas; 

b) Calcule o valor da hora trabalhada, conforme a tabela 1. Adote o valor de R$450,00 para o salário mínimo; 

c) Calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas trabalhadas; 

d) Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo com seu salário inicial, conforme a tabela 2; 

e) Mostre o código, número de horas trabalhadas, valor da hora trabalhada, salário inicial, auxílio alimentação e salário final (salário inicial + auxílio alimentação).

TABELA 1
Categoria          Turno              Valor
    G                N                 18%
    G             M || V               15%
    O                N                 13%
    O             M || V               10%

TABELA 2
Salario Inicial                  Auxilio Alimentação
   <= 300                                20%
>= 300 && < 600                          15%
   >= 600                                5%
*/

import java.util.Scanner;

public class EmpresaDez {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int cod = 0;
        float HorasTrabalhadas = 0;
        String turno = "";
        String categoria = "";
        float ValorHora = 0;
        float SalarioMinimo = 450.00f;
        float SalarioInicial = 0;
        float SalarioFinal = 0;
        float Alimentacao = 0;
        int i = 1;

        //Inicio do código
        while (i <= 10) {

            //Obtendo as informações dos funcionarios.
            System.out.println(" ");
            System.out.println("FUNCIONARIO " + i);
            System.out.println(" ");

            System.out.print("Digite a quantidade de horas trabalhadas: ");
            HorasTrabalhadas = entrada.nextFloat();   //obtendo o numero de horas trabalhadas
            System.out.print("Digite o código do funcionario: ");
            cod = entrada.nextInt();                  //obtendo o código
            System.out.print("Digite o turno do funcionario: ");
            turno = entrada.next();                   //obtendo o turno
            System.out.print("Digite a categoria do funcionario: ");
            categoria = entrada.next();               //obtendo a categoria

            //padronizando o turno e a categoria colocando eles em maiusculas
            turno = turno.toUpperCase();
            categoria = categoria.toUpperCase();

            //Verificando se os dados estão validos
            boolean testeTurno = false;
            boolean testeCat = false;
            
            switch (turno) {
                case "M":
                    testeTurno = true;
                    break;
                case "V": 
                    testeTurno = true;
                    break;
                case "N":
                    testeTurno = true;
                    break;
            }
            switch (categoria) {
                case "O":
                    testeCat = true;
                    break;
                case "G":
                    testeCat = true;
                    break;
            }

            if (testeCat == true && testeTurno == true) { //Codigo se estiver tudo certo
            
                //Valor da hora
            if (categoria.equals("G")) { 
                if (turno.equals("N")) {
                    ValorHora = (SalarioMinimo * 0.18f);
                } else if (turno.equals("M") || turno.equals("V")) {
                    ValorHora = (SalarioMinimo * 0.15f);
                }
            }
            if (categoria.equals("O")) {
                if (turno.equals("N")) {
                    ValorHora = (SalarioMinimo * 0.13f);
                } else if (turno.equals("M") || turno.equals("V")) {
                    ValorHora = (SalarioMinimo * 0.10f);
                }
            }

            //Valor do salario inicial
            SalarioInicial = (ValorHora * HorasTrabalhadas) ;

            //valor do auxilio alimentação
            if (SalarioInicial < 300) { 
                Alimentacao = SalarioInicial * 0.20f;
            } else if ((SalarioInicial >= 300) && (SalarioInicial < 600)) {
                Alimentacao = SalarioInicial * 0.15f;
            } else if (SalarioInicial >= 600) {
                Alimentacao = SalarioInicial * 0.05f;
            }

            //Valor do salario final do usuario
            SalarioFinal = SalarioInicial + Alimentacao;

            //Informando os dados ao usuario
            System.out.println(" ");
            System.out.println("FUNCIONARIO " + i);
            System.out.println(" ");

            System.out.println("Código do funcionario: " + cod);
            System.out.println("Numero de horas trabalhadas: " + HorasTrabalhadas);
            System.out.println("Valor das horas trabalhadas: R$" + ValorHora);
            System.out.println("Salario inicial: R$" + SalarioInicial);
            System.out.println("Valor do auxilio alimentação: R$" + Alimentacao);
            System.out.println("Salario final: R$" + SalarioFinal);

            System.out.println(" ");
            System.out.println("-----------------------------------------------------");

            } else { //Codigo de erro
                System.out.print("[ERRO] TURNO OU CATEGORIA INVALIDOS");
                System.out.println(" ");
                i--;
            }
            i++;
        }

        entrada.close();
    }
}