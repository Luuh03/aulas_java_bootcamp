package aula_04;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero, contador = 0;
		double total = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				total += numero;
				contador++;
			}
			
		} while(numero != 0);
		
		double media = total / contador;
		
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", media);
		
		leia.close();

	}

}
