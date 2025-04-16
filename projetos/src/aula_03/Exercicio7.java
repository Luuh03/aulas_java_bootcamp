package aula_03;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Calculadora\n"
				+ "1 - Soma\n"
				+ "2 - Subtração\n"
				+ "3 - Multiplicação\n"
				+ "4 - Divisão\n");
		
		System.out.print("Digite o primeiro número: ");
		float numero1 = leia.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float numero2 = leia.nextFloat();
		
		System.out.print("Digite o código da operação: ");
		int operacao = leia.nextInt();
		
		switch(operacao) {
			case 1:
				System.out.printf("\n%.1f + %.1f = %.1f", numero1, numero2, numero1 + numero2);
				break;
			case 2:
				System.out.printf("\n%.1f - %.1f = %.1f", numero1, numero2, numero1 - numero2);
				break;
			case 3:
				System.out.printf("\n%.1f * %.1f = %.1f", numero1, numero2, numero1 * numero2);
				break;
			case 4:
				System.out.printf("\n%.1f / %.1f = %.1f", numero1, numero2, numero1 / numero2);
				break;
			default:
				System.out.println("Operação inválida!");
		}
		
		leia.close();
	}

}
