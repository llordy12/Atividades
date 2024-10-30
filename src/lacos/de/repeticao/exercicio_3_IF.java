package lacos.de.repeticao;

import java.util.Scanner;

public class exercicio_3_IF {
	public static void main(String[] args) {

		String nome;
		int idade;
		boolean primeiraDoacao;

		Scanner escreva = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		nome = escreva.nextLine();

		System.out.println("Digite sua idade: ");
		idade = escreva.nextInt();

		System.out.println("Digite true pra sim e false pra não");
		primeiraDoacao = escreva.nextBoolean();

		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69) {
				if (primeiraDoacao) {
					System.out.println("o doador " + nome + " de " + idade + "anos," + "nao esta apto a doar.");
				} else {
					System.out.println("o doador " + nome + " de " + idade + "anos," + " esta apto a doar.");
				}
			} else {
				System.out.println("o doador " + nome + " de " + idade + "anos," + " esta apto a doar.");
			}

		} else {
			System.out.println("o doador " + nome + " de " + idade + "anos," + "nao esta apto a doar.");
		}

	}

}
