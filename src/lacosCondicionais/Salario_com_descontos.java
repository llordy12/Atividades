package lacosCondicionais;

import java.util.Scanner;

public class Salario_com_descontos {
	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		
		float SalarioBruto;
		float AdicionalNoturno;
		float HorasExtras;
		float Descontos;
		
		
		System.out.println("Digite seu Salario Bruto: ");
		SalarioBruto = ler.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		AdicionalNoturno = ler.nextFloat();
		
		
		System.out.println("Valor recebido de Horas Extras: ");
		HorasExtras = ler.nextFloat();
		
		
		System.out.println("Valores descontados: ");
		Descontos = ler.nextFloat();
		
		System.out.println("Seu Salario Liquido é de: " + (SalarioBruto + AdicionalNoturno + (HorasExtras * 5) - Descontos));
		
		
		
		
	}

}
