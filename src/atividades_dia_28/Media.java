package atividades_dia_28;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		//começo
		float portugues;
		float matematica;
		float ingles;
		float fisica;
				
		System.out.println("digite sua notas: ");
		portugues = ler.nextFloat();
		matematica = ler.nextFloat();
		ingles = ler.nextFloat();
		fisica = ler.nextFloat();
		
		
		System.out.println("Sua media final é: " + ((ingles + fisica + matematica + portugues) / 4 ));
		
		
		
		
		
		
	}

}
