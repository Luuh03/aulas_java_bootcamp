package aula_05;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeros[] = new int[10], contador = 0, numero, posicao;
		
		while (contador < 10) {
			System.out.printf("Digite o %d número: ", contador+1);
			numero = leia.nextInt();
			
			posicao = buscaNumero(numeros, 10, numero);
			
			if(posicao != 10)
				System.out.println("Os números não podem ser repetidos!");
			else {
				numeros[contador] = numero;
				contador++;
			}
		}
		
		System.out.print("\nDigite o número que deseja encontrar: ");
		numero = leia.nextInt();
		
		posicao = buscaNumero(numeros, 10, numero);
		
		if(posicao != 10)
			System.out.printf("\nO número %d está localizado na posição: %d", numero, posicao);
		else
			System.out.printf("\nO número %d não foi encontrado!", numero);
		
		leia.close();
	}
	
	public static int buscaNumero(int numeros[], int contador, int numero) {
		for (int i = 0; i < contador; i++) {
			if(numeros[i] == numero) {
				return i;
			}
		}
		return 10;
	}

}
