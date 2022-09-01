/*
  Faça um programa que receba o preço, a categoria (1 – limpeza; 2 – alimentação; ou 3 – vestuário) e a situação (R – produtos que necessitam de refrigeração; e N – produtos que não necessitam de refrigeração). Calcule e mostre:

  O valor do aumento, usando as regras que se seguem.

  O valor do imposto, usando as regras a seguir.

  O produto que preencher pelo menos um dos seguintes requisitos pagará imposto equivalente a 5% do preço; caso contrário, pagará 8%. Os requisitos são:

  Categoria: 2

  Situação: R

  O novo preço, ou seja, o preço mais aumento menos imposto.
  A classificação, usando as regras a seguir.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      Float preco = 0f;
      int categoria = 0;
      String situacao = "";
      Float aumento = 0f;
      Float imposto = 0f;
      Float valorAumento = 0f;
      Float valorImposto = 0f;
      float novoPreco = 0f;
      String classificacao = "";
      

      //Obtendo os dados
      System.out.print("Qual o preço do produto? ");
      preco = input.nextFloat();

      System.out.print("Qual a categoria do produto? (Digite 1 para limpeza, 2 para alimentação ou  3 para vestuário). ");
      categoria = input.nextInt();

      //Testando a validade do dado inserido
      while (categoria != 1 && categoria != 2 && categoria != 3) {
        System.out.println();
        System.out.print("Categoria invalidade, Digite 1 para limpeza, 2 para alimentação ou  3 para vestuário. ");
        categoria = input.nextInt();
      }

      //obtendo e testando a validade da situação inserida
      System.out.print("Qual a situação do produto? (Digite R caso ele necessite de refrigeração ou N caso ele não necessite de refrigeração) ");
      situacao = input.next();
      situacao = situacao.toUpperCase();

      //Testando a validade da situação
      while (!situacao.equals("R") && !situacao.equals("N")) {
        System.out.println();
        System.out.print("Situacao invalida, digite R caso o produto necessite de refrigeração ou N caso ele não necessite de refrigeração. ");
        situacao = input.next();
        situacao = situacao.toUpperCase();
      }

      //Gerando o produto
      // Produto produto = new Produto(preco, categoria, situacao);

      //Testando o aumento no valor do produto
      switch (categoria) {
        case 1:

          if (preco <= 25) {
            aumento = 0.05f;
          } else {
            aumento = 0.12f;
          }
          break;

        case 2:

          if (preco <= 25) {
            aumento = 0.08f;
          } else {
            aumento = 0.15f;
          }
          break;

        case 3:

          if (preco <= 25) {
            aumento = 0.10f;
          } else {
            aumento = 0.18f;
          }
      }

      //Testando o valor do imposto
      if (categoria == 2 || situacao.equals("R")) {
        imposto = 0.05f;
      } else {
        imposto = 0.08f;
      }

      //Calculos
      valorAumento = preco * aumento;
      valorImposto = preco * imposto;
      novoPreco = preco + (valorAumento + valorImposto);

      //Obtendo a classificação
      if (novoPreco <= 50) {
        classificacao = "barato";
      } else if (novoPreco < 120) {
        classificacao = "normal";
      } else {
        classificacao = "caro";
      }

      //Gerando o produto
      Produto produto = new Produto(preco, categoria, situacao, valorAumento, valorImposto, novoPreco, classificacao);

      produto.imprimirResultado();

      input.close();
    }
}
