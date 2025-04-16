package aula_03;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float total;
		String produto;
		
		System.out.println("Código do Produto		Produto				Preço Unitário");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("	1  	  	|	Cachorro Quente		|	R$ 10.00");
		System.out.println("	2	  	|	X-Salada		|	R$ 15.00");
		System.out.println("	3	  	|	X-Bacon			|	R$ 18.00");
		System.out.println("	4	  	|	Bauru			|	R$ 12.00");
		System.out.println("	5	  	|	Refrigerante		|	R$ 8.00");
		System.out.println("	6	  	|	Suco de laranja		|	R$ 13.00");
		
		
		System.out.print("\nDigite o código do item: ");
		int item = leia.nextInt();
		
		System.out.print("Digite a quantidade comprada: ");
		int quantidade = leia.nextInt();

		leia.close();
		switch(item) {
			case 1:
				produto = "Cachorro Quente";
				total = 10 * quantidade;
				break;
			case 2:
				produto = "X-Salada";
				total = 15 * quantidade;
				break;
			case 3:
				produto = "X-Bacon";
				total = 18 * quantidade;
				break;
			case 4:
				produto = "Bauru";
				total = 12 * quantidade;
				break;
			case 5:
				produto = "Refrigerante";
				total = 8 * quantidade;
				break;
			case 6:
				produto = "Suco de laranja";
				total = 13 * quantidade;
				break;
			default:
				System.out.println("Código de item inválido!");
				return;
		}
		
		System.out.printf("\nProduto: %s"
				+ "\nValor total: R$ %.2f", produto, total);
		
	}
}
