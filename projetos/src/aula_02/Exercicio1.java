package aula_02;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		float salario = leia.nextFloat();
		
		System.out.print("Digite o abono: ");
		float abono = leia.nextFloat();
		
		System.out.printf("\nO novo salário será de: R$%.2f", (salario + abono));

		leia.close();
	}

}
