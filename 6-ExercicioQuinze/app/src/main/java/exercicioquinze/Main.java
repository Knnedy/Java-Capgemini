package exercicioquinze;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    PrintStream show = System.out;
    
    show.println("Olá! \nDigite um valor: ");

    try (Scanner sc = new Scanner(System.in)) {
      
      int numero;
      numero = sc.nextInt();

      if (numero >= 100 && numero <= 200) {
        show.println("Muito bem! \nO número está no intervalo ");
      } else {
        show.println("Que pena! \nO número não está no intervalo");
      }
    }
  }  
}
