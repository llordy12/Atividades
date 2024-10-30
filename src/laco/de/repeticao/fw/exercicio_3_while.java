package laco.de.repeticao.fw;

import java.util.Scanner;

public class exercicio_3_while {

	public static void main(String[] args) {

		int i;
		boolean opcao = true;
		int contadorNovo = 0;
		int ContadorVelho = 0;
		int numero = 0;
		Scanner scanner = new Scanner(System.in);

		while (opcao) {

			for (i = 1; i <= 10; i++) {

				System.out.println("Digite o " + i + "º numero desejado");
				numero = scanner.nextInt();

				if (numero < 21 || numero >= 0) {
					contadorNovo++;
				} else if (numero <= 50 || numero >= 50) {
					ContadorVelho++;
				} else {
					System.out.println("Voce digitou: " + numero);

				}

				if (numero < 0) {
					System.out.println("Voce saiu do sistema!");
					opcao = false;
					break;

				}
			}
			System.out.println("Total de pessoas menores que 21 anos: " + contadorNovo);
			System.out.println("Total de pessoas maiores que 50 anos: " + ContadorVelho);

		}

	}

}
