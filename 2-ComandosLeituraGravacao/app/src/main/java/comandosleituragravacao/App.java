package comandosleituragravacao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();
        String codeRua = leitor.next();

        System.out.println("\nvariáveis:\n");
        System.out.println(idade);
        System.out.println(cotacaoDolar);
        System.out.println(cotacaoEuro);
        System.out.println(nome);
        System.out.println(codeRua);
        System.out.println("fim");
    
    }
}

