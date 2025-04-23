package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		int opcao;
		
		System.out.println("************************************************");
		System.out.println("\n\t1 - Adicionar Livro na pilha");
		System.out.println("\t2 - Listar todos os Livros");
		System.out.println("\t3 - Retirar Livro da pilha");
		System.out.println("\t0 - Sair");
		System.out.println("\n************************************************");
		
		do {
			
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.print("\nDigite o nome do livro: ");
					leia.skip("\\R");
					livros.add(leia.nextLine());
					
					System.out.println("\nPilha:");
					imprimePilha(livros);
					
					System.out.println("\nLivro adicionado!");
					break;
				case 2:
					System.out.println("\nLista de Livros na Pilha:");
					imprimePilha(livros);
					break;
				case 3:
					System.out.println("\nPilha:");
					
					if(livros.isEmpty())
						imprimePilha(livros);
					else {
						livros.pop();
						imprimePilha(livros);
						
						System.out.println("\nUm Livro foi retirado da pilha!");
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
	
	static void imprimePilha(Stack<String> livros) {
		if(livros.isEmpty()) {
			System.out.println("\nA pilha está vazia!");
		} else {
			for(var livro : livros) {
				System.out.println(livro);
			}
		}
	}

}
