package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
	
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numero;
		
		while (numeros.size() < 10) {
			numeros.add(numeros.size() + 1);
		}
		
		System.out.print("Digite o número que deseja encontrar: ");
		numero = leia.nextInt();
		
		if(numeros.contains(numero))
			System.out.printf("\nO número %d está localizado na posição: %d", numero, numeros.indexOf(numero));
		else
			System.out.printf("\nO número %d não foi encontrado!", numero);
			
		leia.close();
	}

}
