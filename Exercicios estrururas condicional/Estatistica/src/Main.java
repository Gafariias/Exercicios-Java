/*
Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:

a) código da cidade;
b) número de veículos de passeio;
c) número de acidentes de trânsito com vítimas.

Deseja-se saber:

a) Qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;
b) Qual é a média de veículos nas cinco cidades juntas;
c) Qual é a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    String nomeCidade = "";
    int qtdeVeiculos = 0;
    int qtdeAcidentes = 0;

    int somaAcidentes = 0;
    int medAcidentes = 0;
    int somaVeiculos = 0;
    int medVeiculos = 0;

    Scanner input = new Scanner(System.in);
    List<String> cidades = new ArrayList<String>();
    List<Integer> veiculos = new ArrayList<Integer>();
    List<Integer> acidentes = new ArrayList<Integer>();

    //Cabeçalho
    System.out.println();
    System.out.println("==============================================================");
    System.out.println("                         ESTATISTICAS                         ");
    System.out.println("==============================================================");

    for (int i = 1; i <= 5; i++) {

      System.out.println("                         Cidade " + i + "                       ");
      System.out.println();
    
      //Obtendo dados
      System.out.print("Qual o nome da cidade? ");
      nomeCidade = input.next();

      System.out.print("Qual a quantidade de veiculos? ");
      qtdeVeiculos = input.nextInt();
      
      System.out.print("Qual a quantidae de acidentes? ");
      qtdeAcidentes = input.nextInt();
      System.out.println();

      //Adicionando os items as arrays
      cidades.add(nomeCidade);
      veiculos.add(qtdeVeiculos);
      acidentes.add(qtdeAcidentes);
      
      
    }
    
    input.close();

    //Dividindo a aplicação entre recebimento de dados e mostra
    System.out.println();
    System.out.println("==============================================================");
    System.out.println();
     

    //a) Qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem; 
    //Definindo as arrays       
    Integer[] acidentesArray = new Integer[acidentes.size()];
    acidentesArray = acidentes.toArray(acidentesArray);

    Integer[] veiculosArray = new Integer[veiculos.size()];
    veiculosArray = veiculos.toArray(veiculosArray);

    String[] cidadesArray = new String[cidades.size()];
    cidadesArray = cidades.toArray(cidadesArray);
    
    //Valor do maior e menor numero de acidentes
    Integer max = acidentesArray[0];
    Integer min = acidentesArray[0];

    //Cidade com o maior e menor numero de acidentes
    int minCidadeI = 0;
    int maxCidadeI = 0;
    
    //Index dos maiore e menores valores
    int minIndex = 0;
    int maxIndex = 0;

    //Descobrindo o maior valor
    while (maxIndex < acidentesArray.length){
      if(acidentesArray[maxIndex] > max){
        max = acidentesArray[maxIndex];
        maxCidadeI = maxIndex;
      }

      maxIndex++;
    }

    //Descobrindo o menor valor
    while (minIndex < acidentesArray.length){
      if(acidentesArray[minIndex] < min){
        min = acidentesArray[minIndex];
        minCidadeI = minIndex;
      }

      minIndex++;
    }

    //Cidade com maior e menor numeros de acidentes
    String minCidade = cidadesArray[minCidadeI];
    String maxCidade = cidadesArray[maxCidadeI];

    //b) Qual é a média de veículos nas cinco cidades juntas;
    //Soma de Veiculos
    for (int i = 0; i < veiculosArray.length; i++) {
      somaVeiculos = somaVeiculos + veiculosArray[i];
    }

    //Média de veiculos
    medVeiculos = somaVeiculos / veiculosArray.length;

    //c) Qual é a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
    Arrays.sort(acidentesArray);

    for (int n = 0; n <= 4; n++) {
      if (acidentesArray[n] < 2000) {
        somaAcidentes = somaAcidentes + acidentesArray[n];
        if (n > 0) {
          n++;
          medAcidentes = somaAcidentes / n;
          n--;
        }
      }
    };

    //Informando os dados aos usuarios
    System.out.println("A cidade com o menor indice de acidentes foi: " + minCidade + " com " + min + " acidentes.");
    System.out.println("A cidade com o maior indice de acidentes foi: " + maxCidade + " com " + max + " acidentes.");

    System.out.println();

    System.out.println("A média de veiculos nas cinco cidades juntas é de " + medVeiculos + " veiculos.");
    
    System.out.println();

    System.out.println("A média de acidentes nas cidades com menos de 2000 habitantes é igual a: " + medAcidentes + ".");

    System.out.println();
    System.out.println("==============================================================");

  }
}
