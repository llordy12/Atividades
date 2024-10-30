package lacos.de.repeticao;

import java.util.Scanner;

public class exercicio_1_IF {
	public static void main(String[] args) {

		int a, b, c;
		Scanner soma = new Scanner(System.in);

		System.out.println("Digite os numeros desejados: ");
		a = soma.nextInt();
		b = soma.nextInt();
		c = soma.nextInt();

		if ((a + b) > c) {

			System.out.println("o resultado é maior que C");
		} else if ((a + b) < c) {

			System.out.println(" O resultado é menor que C");

		} else {

			System.out.println("o resultado é igual a C");
		}

	}

}
