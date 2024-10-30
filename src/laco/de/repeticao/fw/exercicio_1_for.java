package laco.de.repeticao.fw;

import java.util.Scanner;

public class exercicio_1_for {


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	
			System.out.print("Digite o primeiro número do intervalo: ");
			int primeiroNumero = scanner.nextInt();

	
			System.out.print("Digite o último número do intervalo: ");
			int ultimoNumero = scanner.nextInt();

			if (primeiroNumero >= ultimoNumero) {
				System.out.println("Intervalo inválido!");
			} else {
				System.out.println("\nNo Intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");


				for (int i = primeiroNumero; i <= ultimoNumero; i++) {
					if (i % 3 == 0 && i % 5 == 0) {
						System.out.println(i + " é múltiplo de 3 e 5");
					}
				}
			}

			scanner.close();
		}
	
}