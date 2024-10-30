package lacos.condicionais;

import java.util.Scanner;

public class LeiaOsNumeros {
	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		
		float n1;
		float n2;
		float n3;
		float n4;
		
		
		System.out.println("Digite os numeros: ");
		n1 = ler.nextFloat();
		n2 = ler.nextFloat();
		n3 = ler.nextFloat();
		n4 = ler.nextFloat();
		
		System.out.println("Diferenças entre os numeros é:  " + ((n1 * n2)- (n3 * n4)));
		
		
		
	}

}
