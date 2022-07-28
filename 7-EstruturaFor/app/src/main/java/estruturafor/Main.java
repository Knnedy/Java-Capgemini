package estruturafor;

import java.io.PrintStream;

public class Main {
  
  public static void main(String[] args) {
    
    PrintStream show = System.out;

    for (int  i = 0; i <= 10; i++) {
      if (i % 2 == 1) {
        show.println(i + " é ímpar");
      } else {
        show.println(i + " é par");

      }
    }
  }
}
