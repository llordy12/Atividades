package lacos.de.repeticao;

import java.util.Scanner;

public class exercicio_6_switchcase {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        int codigoCargo;
        float salario;
        String cargo = "";
        float percentualReajuste = 0;
        
        //pensa q sao as recompensas de cada pirata do mundo de one piece sendo reajustadas apos o fim do arco do anime.
        
        System.out.print("Digite o nome do tripulante: ");
        nome = scanner.nextLine();

        System.out.print("Digite o código do cargo do tripulante (1 a 6): ");
        codigoCargo = scanner.nextInt();

        System.out.print("Digite a recompensa atual: ");
        salario = scanner.nextFloat();
     

        switch (codigoCargo) {
            case 1:
                cargo = "Capitão";
                percentualReajuste = 0.10f;
                break;
            case 2:
                cargo = "Braço-Direito";
                percentualReajuste = 0.07f;
                break;
            case 3:
                cargo = "Navegador(a)";
                percentualReajuste = 0.09f;
                break;
            case 4:
                cargo = "Atirador";
                percentualReajuste = 0.06f;
                break;
            case 5:
                cargo = "Construtor";
                percentualReajuste = 0.05f;
                break;
            case 6:
                cargo = "Cozinheiro";
                percentualReajuste = 0.08f;
                break;
            default:
                System.out.println("se errar o codigo de novo o luffy vai roubar sua comida.");
                scanner.close();
                return;
        }

  
        float novoSalario = salario * (1 + percentualReajuste);//somei 1 pra ficar mais facil, mas quebrei a mente 1000x fzndo contas sem sentido e pedi ajuda do gepeto pra fzr a conta. 

        System.out.println("Nome do tripulante: " + nome);
        System.out.println("Cargo no navio: " + cargo);
        System.out.println("Nova recompensa reajustada: R$ " + novoSalario);

        scanner.close();
    }

}
