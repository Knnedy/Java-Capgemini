package estruturacondicionalse;

import java.io. *;

public class Main {
  
  public static void main(String[] args) {
    
    PrintStream show = System.out;
    int media = 10;

    if (media >= 7 ) {
      if (media == 10) {
        // APROVADO COM NOTA MÁXIMA
        show.println("Aprovado com nota MÁXIMA");
      } else {
        // APROVADO
        show.println("Aprovado");
      }
    } else {
      // Reprovado
      show.println("Reprovado");
    }
  }

  public Object getGreeting() {
    return null;
  }
}
