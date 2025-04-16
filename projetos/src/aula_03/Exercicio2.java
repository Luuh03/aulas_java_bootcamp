package aula_03;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = leia.nextInt();
		
		if(numero == 0)
			System.out.println("O número 0 não se enquadra nas categorias!");
		else if(numero % 2 == 0) {
			if(numero > 0)
				System.out.printf("O número %d é par e positivo!", numero);
			else
				System.out.printf("O número %d é par e negativo!", numero);
		} 
		else {
			if(numero > 0)
				System.out.printf("O número %d é impar e positivo!", numero);
			else
				System.out.printf("O número %d é impar e negativo!", numero);
		}
		
		
		leia.close();
	}

}
