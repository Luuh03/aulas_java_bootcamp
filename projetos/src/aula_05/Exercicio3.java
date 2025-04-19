package aula_05;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][] = new int[3][3];
		int diagPrincipal[] = new int[3], diagSecundaria[] = new int[3];
		int somaPrincipal = 0, somaSecundaria = 0, contadorPrincipal = 0, contadorSecundaria = 0;
				
		// Preenche a Matriz
		for(int linha = 0; linha < matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizInteiros.length; coluna++) {
				System.out.printf("Digite o número da posição [%d][%d]: ", linha+1, coluna+1);
				matrizInteiros[linha][coluna] = leia.nextInt();
			}
		}
		
		// Percorre matriz separando elementos das diagonais
		for(int linha = 0; linha < matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizInteiros.length; coluna++) {
				if(linha == coluna) {
					diagPrincipal[contadorPrincipal] = matrizInteiros[linha][coluna];
					somaPrincipal += matrizInteiros[linha][coluna];
					contadorPrincipal++;
				}
				if(linha + coluna == matrizInteiros.length - 1) {
					System.out.print(linha + coluna);
					diagSecundaria[contadorSecundaria] = matrizInteiros[linha][coluna];
					somaSecundaria += matrizInteiros[linha][coluna];
					contadorSecundaria++;
				}
			}
		}
		
		System.out.print("\nElementos da Diagonal Principal: ");
		for(int elemento : diagPrincipal)
			System.out.print(elemento + " ");
		
		System.out.print("\nElementos da Diagonal Secundária: ");
		for(int elemento : diagSecundaria)
			System.out.print(elemento + " ");
		
		System.out.printf("\nSoma dos Elementos da Diagonal Principal: %d", somaPrincipal);
		System.out.printf("\nSoma dos elementos da Diagonal Secundária: %d", somaSecundaria);

		leia.close();
	}

}
