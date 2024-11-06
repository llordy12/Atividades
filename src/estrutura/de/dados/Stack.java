package estrutura.de.dados;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        GerenciadorPilhaLivros gerenciador = new GerenciadorPilhaLivros();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String nomeLivro = scanner.nextLine();
                    gerenciador.adicionarLivro(nomeLivro);
                    break;
                case 2:
                    gerenciador.listarLivros();
                    break;
                case 3:
                    gerenciador.retirarLivro();
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}


