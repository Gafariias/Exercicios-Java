/*
    Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida e  ACESSO NEGADO caso a senha seja inválida.
*/

import java.util.Scanner;

public class ValidarSenha {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int senhaValida = 1234;

        //Rebendo a senha
        System.out.print("Digite a senha: ");
        int senha = entrada.nextInt();

        //Testando as senhas
        if (senha == senhaValida) { //Senha valida
            System.out.print("[ACESSO PERMITIDO] A senha que você digitou é valida.");
        } else { //Senha invalida
            System.out.print("[ACESSO NEGADO] A senha que você digitou é invalida");
        }

        entrada.close();
    }
}
