package aula_03;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		boolean primeiraDoacao;
		
		System.out.print("Digite o nome do doador: ");
		String nome = leia.nextLine();
		
		System.out.print("Digite a idade : ");
		int idade = leia.nextInt();
		
		System.out.print("Primeira doação de sangue? (S ou N): ");
		String respostaDoacao = leia.next();
		
		if(respostaDoacao.equalsIgnoreCase("s")) {
			primeiraDoacao = true;
		} else if(respostaDoacao.equalsIgnoreCase("n")) {
			primeiraDoacao = false;
		} else {
			System.out.println("Resposta inválida!");
			leia.close();
			return;
		}
		
		if(idade >= 18 && idade <= 69) {
			if(idade >= 60 && primeiraDoacao == true) {
				System.out.printf("\n%s não está apto(a) para doar sangue!", nome);
			} else {
				System.out.printf("\n%s está apto(a) para doar sangue!", nome);
			}
		} else {
			System.out.printf("\n%s não está apto(a) para doar sangue!", nome);
		}
		
		
		
		leia.close();
	}

}
