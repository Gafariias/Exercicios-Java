/*
Uma empresa possui dez funcionários com as seguintes características: código, número de horas trabalhadas no mês, turno de trabalho (M – matutino; V – vespertino; N – noturno), categoria (O – operário; ou G – gerente), valor da hora trabalhada. 
Sabendo-se que essa empresa deseja informatizar sua folha de pagamento, faça um programa que: 

    a) Leia as informações dos funcionários, exceto o valor da hora trabalhada, não permitindo que sejam informações dos turnos e nem categorias inexistentes. Trabalhe sempre com a digitação de letras maiúsculas; 

    b) Calcule o valor da hora trabalhada, conforme a tabela 1. Adote o valor de R$450,00 para o salário mínimo; 

    c) Calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas trabalhadas; 

    d) Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo com seu salário inicial, conforme a tabela 2; 

    e) Mostre o código, número de horas trabalhadas, valor da hora trabalhada, salário inicial, auxílio alimentação e salário final (salário inicial + auxílio alimentação).
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Variaveis
        int horasTrabalhadas = 0;
        char turno;
        char categoria;
        
        Scanner input = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        FolhaPagamento folha = new FolhaPagamento(funcionario, horasTrabalhadas);
        
        //Obtendo dados
        System.out.println("\nFUNCIONARIO " + funcionario.getCodigo());

        System.out.print("\nQual a quantidade de horas trabalhadas por mês? ");
        horasTrabalhadas = input.nextInt();

        System.out.print("Qual o turno do funcionario? ");
        turno = input.next().toUpperCase().charAt(0);

        //Checando a validade do turno inserido
        while (turno != 'M' && turno != 'V' && turno != 'N') {
            System.out.print("Turno invalido, digite 'M' para matutino, 'V' para vespertino e 'N' para noturno: ");
            turno = input.next().toUpperCase().charAt(0);
        }

        System.out.print("Qual a categoria do funcionario? ");
        categoria = input.next().toUpperCase().charAt(0);

        //Checando a validade da categoria inserida
        while (categoria != 'O' && categoria != 'G') {
            System.out.print("Categoria invalida, digite 'O' para operario e 'G' para gerente: ");
            categoria = input.next().toUpperCase().charAt(0);
        }
        
        folha.setHorasTrabalhadas(horasTrabalhadas);
        funcionario.setTurno(turno);
        funcionario.setCategoria(categoria);
        folha.calcularSalarioFinal();

        folha.imprimirFolha();

        input.close();
    }
}
