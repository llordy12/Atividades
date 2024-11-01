package vetor;

import java.util.Scanner;

public class Ex_2_vetor {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;

        
        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        System.out.print("Elementos ímpares:\n");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(); 

        
        System.out.print("Elementos pares:\n");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println(); 

        
        for (int num : vetor) {
            soma += num;
        }

        
        double media = (double) soma / vetor.length; 

        
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f\n", media);

        scanner.close(); 
    }

}
