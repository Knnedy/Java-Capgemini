package Classes;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    try (Scanner sc = new Scanner(System.in)) {

      Pessoa objetoPessoa = new Pessoa(); // criando objeto

      System.out.println("Digite o peso da pessoa: ");
      objetoPessoa.setPeso(sc.nextFloat()) ;
      System.out.println("Digite a altura da pessoa: ");
      objetoPessoa.setAltura(sc.nextFloat());

      System.out.printf("IMC: %.2f%n",  objetoPessoa.calcularIMC());

    }

    
  }
}