package estrutura.de.dados;
import java.util.Stack;

public class GerenciadorPilhaLivros {
    private Stack<String> pilhaLivros;

    public GerenciadorPilhaLivros() {
        this.pilhaLivros = new Stack<>();
    }

   
    public void adicionarLivro(String nomeLivro) {
        pilhaLivros.push(nomeLivro);
        System.out.println("Livro \"" + nomeLivro + "\" adicionado a pilha.");
    }

   
    public void listarLivros() {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha esta vazia.");
        } else {
            System.out.println("Livros na pilha:");
            for (int i = pilhaLivros.size() - 1; i >= 0; i--) {
                System.out.println("- " + pilhaLivros.get(i));
            }
        }
    }

    
    public void retirarLivro() {
        if (pilhaLivros.isEmpty()) {
            System.out.println("A pilha esta vazia. Não tem livros para retirar.");
        } else {
            String livroRetirado = pilhaLivros.pop();
            System.out.println("Livro \"" + livroRetirado + "\" foi retirado da pilha.");
        }
    }

}
