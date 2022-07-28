package estruturawhile;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {

    PrintStream out = System.out;
    int totalAlunos = 10;
    
    try (Scanner sc = new Scanner(System.in)) {

      while (totalAlunos > 0) {

        String nomeAluno = sc.nextLine();
        int idadeAluno = sc.nextInt();

        out.println("\nNome do aluno: " + nomeAluno + " | Idade: "
                    + idadeAluno + " | Total de Alunos: " + totalAlunos);
         
        totalAlunos = totalAlunos - 1;
    
      }
    }
  }
}
