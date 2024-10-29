package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio_5_switchcase {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int codigo;
		int quantidade;
		String produto = "";
		int precoUnitario = 0;

		System.out.print("Digite o código do produto (1 a 6): ");
		codigo = scanner.nextInt();

		System.out.print("Digite a quantidade comprada: ");
		quantidade = scanner.nextInt();

		switch (codigo) {
		case 1:
			produto = "Cachorro Quente";
			precoUnitario = 10;
			break;
		case 2:
			produto = "X-Salada";
			precoUnitario = 15;
			break;
		case 3:
			produto = "X-Bacon";
			precoUnitario = 18;
			break;
		case 4:
			produto = "Bauru";
			precoUnitario = 12;
			break;
		case 5:
			produto = "Refrigerante";
			precoUnitario = 8;
			break;
		case 6:
			produto = "Suco de Laranja";
			precoUnitario = 13;
			break;
		default:
			System.out.println("Código do produto inválido.");
			scanner.close();
			return;
		}

		int total = precoUnitario * quantidade;

		System.out.println("Produto: " + produto);
		System.out.println("Valor total: R$ " + total);

		scanner.close();
	}

}
