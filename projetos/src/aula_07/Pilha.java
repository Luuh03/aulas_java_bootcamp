package aula_07;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Comunicação não violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A Coragem de ser Imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Diário de um Banana");
		pilha.add("Senhor dos Anéis");
		pilha.add("O Código Da Vinci");
		
		System.out.println(pilha);
		
		pilha.pop();

		System.out.println(pilha);
		
		System.out.println(pilha.peek());
		
		System.out.println("O livro Diário de um Banana existe na pilha? " + pilha.contains("Diário de um Banana"));
	}

}
