package aula_02;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		// Definição das variáveis
		//char opcao = 'V';
		//boolean menorIdade = true;
		
		// Definição da constante
		final double pi = 3.1415;
		
		System.out.println("Digite o primeiro numero inteiro: ");
		int numero_01 = leia.nextInt();
		
		System.out.println("Digite o segundo numero inteiro: ");
		int numero_02 = leia.nextInt();
		
		String nome = "Luan";
		
		// Definição de valor
		// numero_02 = 75;
		
		// Exibição em tela
		System.out.printf("Variável numero 1 é igual a: %d\n", numero_01);
		System.out.println("Variável numero 2 é igual a: " + numero_02);
		System.out.printf("Constante PI é igual a: %.2f\n ", pi);

		System.out.println("Variável nome em letras maiúsculas: " + nome.toUpperCase());
		
		leia.close();
	}

}
