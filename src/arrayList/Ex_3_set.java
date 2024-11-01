package arrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex_3_set {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>(); 

        
        System.out.println("Digite 10 valores inteiros não repetidos:");
        while (numeros.size() < 10) {
            System.out.print("Valor " + (numeros.size() + 1) + ": ");
            int valor = scanner.nextInt();
            
            if (!numeros.add(valor)) {
                System.out.println("Valor ja existe, digite um valor diferente.");
            }
        }

        
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close(); 
    }
}
