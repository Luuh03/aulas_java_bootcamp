package aula_03;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valores[] = new int[3]; 
		
		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Digite o %d° valor: ", i+1);
			valores[i] = leia.nextInt();
		}
		
		int soma = valores[0] + valores[1];
		
		if(soma > valores[2])
			System.out.printf("\nA soma de %d + %d é maior que %d", valores[0], valores[1], valores[2]);
		else if(soma < valores[2])
			System.out.printf("\nA soma de %d + %d é menor que %d", valores[0], valores[1], valores[2]);
		else
			System.out.printf("\nA soma de %d + %d é igual a %d", valores[0], valores[1], valores[2]);
		
		leia.close();
	}
}
