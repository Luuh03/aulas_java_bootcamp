package aula_06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
	
		Set<Integer> numeros = new HashSet<Integer>();
		int numero;
		
		while (numeros.size() < 10) {
			numeros.add(numeros.size() + 1);
		}
		
		System.out.print("Digite o número que deseja encontrar: ");
		numero = leia.nextInt();
		
		if(numeros.contains(numero))
			System.out.printf("\nO número %d foi encontrado!", numero);
		else
			System.out.printf("\nO número %d não foi encontrado!", numero);
			
		leia.close();
	}
}
