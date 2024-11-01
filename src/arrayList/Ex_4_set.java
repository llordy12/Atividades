package arrayList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex_4_set {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Set<Integer> numeros = new HashSet<>();
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
        int index = 0;
        for (Integer numero : numeros) {
            System.out.println(index + ": " + numero);
            index++;
        }

        
        System.out.print("\nDigite o numero que você deseja encontrar: ");
        int numeroBuscado = scanner.nextInt();

       
        if (numeros.contains(numeroBuscado)) {
            System.out.println("\nO numero " + numeroBuscado + " foi encontrado");
        } else {
            System.out.println("\nO numero " + numeroBuscado + " não foi encontrado");
        }

        scanner.close(); 
    }

}
