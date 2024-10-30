package lacos.de.repeticao;

import java.util.Scanner;

public class exercicio_8_switchcase {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int saldo = 1000;
		int saque = 0;
		int deposito = 0;
		int opcao;

		System.out.println("# ## ### #### #########   Hector's Bank   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para Saldo--");
		System.out.println("--Digite 2 para Saque--");
		System.out.println("--Digite 3 para Depósito--");

		System.out.println("\noque opção deseja realizar? ");
		opcao = scanner.nextInt();
		
		switch (opcao) {

		case 1:
			System.out.println(saldo);
			break;
		case 2:
			System.out.println("Quanto deseja sacar? seu saldo é de: 1000");
			saque = scanner.nextInt();
			if (saque <= saldo) {
				System.out.println("saldo atual " + (saque - saldo));
			} else {
				System.out.println("valor indisponivel para saque! ");
			}
			break;
		case 3:
			System.out.println("Quanto deseja depositar? seu saldo é de: 1000");
			deposito = scanner.nextInt();
			if(deposito >= 1){
				System.out.println("saldo atual: " + (deposito + saldo));
			}else {
				System.out.println("nenhum deposito efetuado");
			}
			
			break;
		default:
			System.out.println("Operação inválida");
			return;
		}

	}

}
