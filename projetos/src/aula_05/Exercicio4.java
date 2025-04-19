package aula_05;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float notas[][] = new float[10][4], media[] = new float[10], soma;
		
		for(int linha = 0; linha < notas.length; linha++) {
			for(int coluna = 0; coluna < notas[linha].length; coluna++) {
				System.out.printf("Digite a nota do %d° aluno no %d° bimestre: ", linha+1, coluna+1);
				notas[linha][coluna] = leia.nextFloat();
			}
		}
		
		for(int linha = 0; linha < notas.length; linha++) {
			soma = 0;
			for(var contador : notas[linha]) {
				soma += contador;
			}
			media[linha] = soma / 4;
		}
		
		System.out.println("\nVetor: ");
		for(var notaMedia : media)
			System.out.printf("%.1f ", notaMedia);
		
		leia.close();
	}

}
