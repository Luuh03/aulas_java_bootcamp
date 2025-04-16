package aula_04;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero, pares = 0, impares = 0;

		for(int i = 0; i <= 9; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			numero = leia.nextInt();
			
			if(numero % 2 == 0)
				pares++;
			else
				impares++;
		}
		
		System.out.printf("\nTotal de números pares: %d", pares);
		System.out.printf("\nTotal de números ímpares: %d", impares);
		
		leia.close();
	}

}
