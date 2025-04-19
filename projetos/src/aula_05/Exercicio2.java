package aula_05;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetorNumeros[] = new int[10], soma = 0;
		
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			vetorNumeros[i] = leia.nextInt();
			soma += vetorNumeros[i];
		}
		
		double media = (double) soma / 10;
		
		System.out.println("\nElementos nos indices ímpares:");
		imprimeIndiceImpares(vetorNumeros);
		
		System.out.println("\nElementos pares:");
		imprimePares(vetorNumeros);
		
		System.out.println("\nSoma: " + soma);
		System.out.printf("Média: %.2f", media);
		
		leia.close();
	}
	
	static void imprimeIndiceImpares(int vetorNumeros[]) {
		for(int i = 0; i < vetorNumeros.length; i++) {
			if(i % 2 != 0) 
				System.out.printf("%d ", vetorNumeros[i]);
		}
	}
	
	static void imprimePares(int vetorNumeros[]) {
		for(var contador : vetorNumeros) {
			if(contador % 2 == 0) 
				System.out.printf("%d ", contador);
		}
	}

}
