package atividades_dia_28;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
	
		float portugues, matematica, ingles, fisica, media;

		System.out.println("digite sua notas: ");
		portugues = ler.nextFloat();
		matematica = ler.nextFloat();
		ingles = ler.nextFloat();
		fisica = ler.nextFloat();
		
		media = (ingles + fisica + matematica + portugues) / 4;
		
		System.out.printf("Sua media final é: %.1f%n", media);
		
		
		
		
		
		
	}

}
