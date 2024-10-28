package atividades_dia_28;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		//começo
			int salario = 10000;
			int abono = 1000;
			
		
			System.out.println("Digite o salario: " );
			salario = ler.nextInt();
						
			System.out.println("Digite o Abono: ");
			abono = ler.nextInt();
						
			System.out.println("Novo Salario: " + (salario + abono));
			
		
	}

}
