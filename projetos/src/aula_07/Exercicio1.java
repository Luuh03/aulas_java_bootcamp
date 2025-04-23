package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Queue<String> nomes = new LinkedList<String>();
		int opcao;
		
		System.out.println("************************************************");
		System.out.println("\n\t1 - Adicionar Cliente na Fila");
		System.out.println("\t2 - Listar todos os Clientes");
		System.out.println("\t3 - Retirar Cliente da Fila");
		System.out.println("\t0 - Sair");
		System.out.println("\n************************************************");
		
		do {
			
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.print("\nDigite o nome do cliente: ");
					leia.skip("\\R");
					nomes.add(leia.nextLine());
					
					System.out.println("\nFila:");
					imprimeFila(nomes);
					
					System.out.println("\nCliente adicionado!");
					break;
				case 2:
					System.out.println("\nLista de Cliente na Fila:");
					imprimeFila(nomes);
					break;
				case 3:
					System.out.println("\nFila:");
					
					if(nomes.isEmpty())
						imprimeFila(nomes);
					else {
						nomes.remove();
						imprimeFila(nomes);
						
						System.out.println("\nO Cliente foi Chamado!");
					}
					break;
				case 0:
					System.out.println("\nPrograma Finalizado!");
					break;
				default:
					System.out.println("\nOpção inválida! Tente novamente.");
					break;
			}
			
			System.out.println("\n************************************************");
			
		} while (opcao != 0);
		
		
		leia.close();
	}
	
	static void imprimeFila(Queue<String> nomes) {
		if(nomes.isEmpty()) {
			System.out.println("\nA fila está vazia!");
		} else {
			for(var cliente : nomes) {
				System.out.println(cliente);
			}
		}
	}

}
