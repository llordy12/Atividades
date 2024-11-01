package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_2_arrayList {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

       
        System.out.println("Lista:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("posição: "+ i + " = " + numeros.get(i));
        }
        

        System.out.print("\nDigite o numero que voce quer encontrar: ");
        int numeroBuscado = scanner.nextInt();

      
        int indice = numeros.indexOf(numeroBuscado);
        if (indice != -1) {
            System.out.println("\nO numero " + numeroBuscado + " esta localizado na posição: " + indice);
        } else {
            System.out.println("\nO numero " + numeroBuscado + " não foi encontrado");
        }

        scanner.close(); 
    }
}
