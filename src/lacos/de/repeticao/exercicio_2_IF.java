package lacos.de.repeticao;

import java.util.Scanner;

public class exercicio_2_IF {
	public static void main(String[] args) {

		int numero;

		Scanner escreva = new Scanner(System.in);

		System.out.println("Digite seu numero: ");
		numero = escreva.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O numero;" + numero + " é par ");

		} else {
			System.out.println("O numero: " + numero + " é impar");
		}
		if (numero > 0) {
			System.out.printf("e positivo");
		} else {
			System.out.printf("e negativo");
		}
	}

}
