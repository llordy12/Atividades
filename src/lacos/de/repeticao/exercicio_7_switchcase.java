package lacos.de.repeticao;

import java.util.Scanner;

public class exercicio_7_switchcase {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n1, n2, opcao;

        System.out.println("# ## ### #### #########   Calculadora   ########## #### ### ## #");
        System.out.println("\n--Digite 1 para Soma--");
        System.out.println("--Digite 2 para Subtração--");
        System.out.println("--Digite 3 para Multiplicação--");
        System.out.println("--Digite 4 para Divisão--");
        
        System.out.print("\nEscolha uma operação: ");
        opcao = scanner.nextInt();
        
        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextInt();
        
        switch(opcao) {
            case 1:
                System.out.println("Resultado da Soma: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Resultado da Divisão: " + ((double)n1 / n2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
        
        scanner.close();
    }
}
