package estrutura.de.dados;

import java.util.Scanner;

public class BancoFilaClientes {
    public static void main(String[] args) {
        Queue filaClientes = new Queue();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) um Cliente da fila");
            System.out.println("0: Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    String nome = scanner.nextLine();
                    filaClientes.enqueue(nome);
                    break;
                case 2:
                    filaClientes.listClients();
                    break;
                case 3:
                    String clienteChamado = filaClientes.dequeue();
                    if (clienteChamado == null) {
                        System.out.println("A fila esta vazia. Não ha clientes para chamar.");
                    } else {
                        System.out.println("Cliente " + clienteChamado + " foi chamado.");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
