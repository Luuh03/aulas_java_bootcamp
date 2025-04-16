package aula_04;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int numero1 = leia.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = leia.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O intervalo entre os números é inválido! O primeiro deve ser menor que o segundo.");
		}
		
		for (int i = numero1; i <= numero2; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.printf("\n%d é múltiplo de 3 e 5", i);
			}
		}
		
		leia.close();
	}

}
