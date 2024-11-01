package vetor;

import java.util.Scanner;

public class Ex_1_vetor {

	public static void main(String[] args) {
        
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

       
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + ": " + vetor[i]);
        }

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número que voce deseja encontrar: ");
        int numProcurado = scanner.nextInt();

        
        int posicao = -1;

  
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numProcurado) {
                posicao = i;
               
            }
        }

  
        if (posicao != -1) {
            System.out.println("O numero " + numProcurado + " esta na posição: " + posicao);
        } else {
            System.out.println("O numero " + numProcurado + " não foi encontrado");
        }

        scanner.close(); 

}}
