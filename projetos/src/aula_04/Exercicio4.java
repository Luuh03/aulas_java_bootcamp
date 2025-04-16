package aula_04;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String continua = "s";
		int idade, genero, cargoDev, backend = 0, mulheresFront = 0, homensMobile = 0, nbFullstack = 0, totalPessoas = 0, totalIdade = 0;
		
		while (continua.equalsIgnoreCase("s")) {
			do {
				System.out.print("Digite sua idade: ");
				idade = leia.nextInt();
				
				if(idade < 1)
					System.out.println("Idade inválida!");
				
			} while(idade < 1);
			
			do {
				System.out.println("Informe seu gênero (1- Mulher Cis / 2- Homem Cis / 3- Não binário / 4- Mulher Trans / 5- Homem trans / 6- Outros): ");
				genero = leia.nextInt();
				
				if(genero < 1 || genero > 6)
					System.out.println("Deve ser um número entre 1 e 6");
				
			} while(genero < 1 || genero > 6);
			
			do {
				System.out.println("Informe seu cargo (1- Backend / 2- Frontend / 3- Mobile / 4- FullStack): ");
				cargoDev = leia.nextInt();
				
				if(cargoDev < 1 || cargoDev > 4)
					System.out.println("Deve ser um número entre 1 e 4");
				
			} while(cargoDev < 1 || cargoDev > 4);
			
			if(cargoDev == 1)
				backend++;
			else if(cargoDev == 2 && (genero == 1 || genero == 4))
				mulheresFront++;
			else if(cargoDev == 3 && (genero == 2 || genero == 5) && idade > 40)
				homensMobile++;
			else if(cargoDev == 4 && genero == 3 && idade > 30)
				nbFullstack++;
			
			totalPessoas++;
			totalIdade += idade;
			
			System.out.println("Deseja continuar? (S/N): ");
			leia.skip("\\R");
			continua = leia.nextLine();
		}
		
		double mediaIdade = totalIdade / totalPessoas;
		
		System.out.printf("\nTotal de pessoas desenvolvedoras Backend: %d", backend);
		System.out.printf("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: %d", mulheresFront);
		System.out.printf("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d", homensMobile);
		System.out.printf("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d", nbFullstack);
		System.out.printf("\nNúmero total de pessoas que responderam à pesquisa: %d", totalPessoas);
		System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.1f", mediaIdade);
		
		
		leia.close();

	}

}
