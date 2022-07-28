package estruturaderepeticao;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    PrintStream out = System.out;

    char desejaContinuar = 'S';

    while (desejaContinuar == 'S' || desejaContinuar == 's' ) {

      int numero = sc.nextInt();
      
      if (numero == 0) {
        out.println("O número é zero!");
      } else {
        if (numero > 0) {
          out.println("O número é maior que zero!");
        } else {
          out.println("O número é menor que zero!");
        }
      }

      out.println("Deseja continuar? S - sim | N - não");
      desejaContinuar = sc.next().charAt(0);
    }
  }
}
