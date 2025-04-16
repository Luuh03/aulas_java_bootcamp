package aula_04;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade = 1, menores21 = 0, maiores50 = 0;

		while (idade > 0) {
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0)
				menores21++;
			else if(idade > 50)
				maiores50++;
			
		}
		
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d", menores21);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", maiores50);
		
		leia.close();
	}

}
