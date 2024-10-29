package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio_4_IF {
	public static void main(String[] args) {
		//

		Scanner escreva = new Scanner(System.in);
		String animais, Vertebrado, Invertebrado, Ave, Mamifero, Inseto, Anelideo, Carnivoro, Onivoro, Herbivoro,
				Hematofogo, Aguia, Pomba, Homem, Vaca, Pulga, Lagarta, Sanguessuga, Minhoca;

		Vertebrado = "Vertebrado";
		Ave = "Ave";
		Mamifero = "Mamifero";
		Inseto = "Inseto";
		Anelideo = "Analideo";
		Carnivoro = "Carnivoro";
		Onivoro = "Onivoro";
		Herbivoro = "Herbivoro";
		Aguia = "Aguia";
		Pomba = "Pomba";
		Homem = "Homem";
		Vaca = "Vaca";
		Pulga = "Pulga";
		Lagarta = "Lagarta";
		Sanguessuga = "Sanguessuga";
		Minhoca = "Minhoca";
		Hematofogo = "Hematofago";

		System.out.println("Digite o tipo de animal Vertebrado ou Invertebrado: ");
		animais = escreva.nextLine();

		if (animais.equals(Vertebrado)) {
			System.out.println("Digite o tipo de animal Ave ou Mamifero: ");
			animais = escreva.nextLine();

			if (animais.equals(Ave)) {
				System.out.println("Digite o tipo de Carnivoro Ave ou Onivoro: ");
				animais = escreva.nextLine();

				if (animais.equals(Carnivoro)) {
					System.out.println("Aguia");
				} else {
					System.out.println("Pombo");
				}

			} else {
				System.out.println("Digite o tipo de Onivoro ou Herbivoro: ");
				animais = escreva.nextLine();
				if (animais.equals(Onivoro)) {
					System.out.println("Homem");
				} else {
					System.out.println("Vaca");
				}
			}

		} else {
			System.out.println("Digite o tipo de Inseto ou Anelideo: ");
			animais = escreva.nextLine();
			if (animais.equals(Inseto)) {
				System.out.println("Digite o tipo de Hematofago ou Herbivoro: ");
				animais = escreva.nextLine();

				if (animais.equals(Hematofogo)) {
					System.out.println("Pulga");
				} else {
					System.out.println("Lagarta");
				}

			} else {
				System.out.println("Digite o tipo de Onivoro ou Hematofago: ");
				animais = escreva.nextLine();
				if (animais.equals(Onivoro)) {
					System.out.println("Minhoca");
				} else {
					System.out.println("Sanguessuga");
				}
			}
		}

	}

}
