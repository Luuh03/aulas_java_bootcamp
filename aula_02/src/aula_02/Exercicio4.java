package aula_02;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float valores[] = new float[4];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Digite o %d° valor: ", i+1);
			valores[i] = leia.nextFloat();
		}
		System.out.printf("\nA diferença é de: %.1f", CalculaDiferenca(valores[0], valores[1], valores[2], valores[3]));
		
	}
	
	static float CalculaDiferenca(float valor1, float valor2, float valor3, float valor4) {
		return (valor1 * valor2) - (valor3 * valor4);
	}
}
