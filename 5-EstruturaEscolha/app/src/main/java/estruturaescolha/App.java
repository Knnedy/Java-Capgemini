package estruturaescolha;

import java.io.PrintStream;

public class App {

	public static void main(String[] args) {
			
		PrintStream show = System.out;
		int codProduto = 2;

		switch (codProduto) {

		case 1:
			show.println("Cod produto 1");
			break;
		case 2:
			show.println("Cod produto 2");
			break;
		default:
		
		}
	}

	public Object getGreeting() {
		return null;
	}
}
