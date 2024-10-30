package laco.de.repeticao.fw;

import java.util.Scanner;

public class exercicio_2_for {
	public static void main(String[] args) {
		
  	
    	int numero, i;
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	  int contadorPares = 0;
          int contadorImpares = 0;
          
    	for(i = 1;i <=10; i++) {
    		
    		System.out.println("Digite o " + i + "º numero desejado");
        	numero = scanner.nextInt();
        	if(numero % 2 == 0) {
        		contadorPares++;
        	}else {
        		contadorImpares++;
        	}
        	
    	}
    	System.out.println("Quantidade de numeros pares: " + contadorPares);
		System.out.println("Quantidade de numeros impares: " + contadorImpares);
		scanner.close();

	}

}
