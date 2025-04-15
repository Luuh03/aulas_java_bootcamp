package aula_02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float notas[] = new float[4];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dª nota: ", i+1);
			notas[i] = leia.nextFloat();
		}
		
		System.out.printf("\nA média final do participante é: %.1f", ((notas[0] + notas[1] + notas[2] + notas[3]) / 4));

		leia.close();
	}

}
