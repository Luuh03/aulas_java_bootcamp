package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {

		// Cria a coleção set
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("maçã");
		
		System.out.println(frutas);

		//Exibe hashcode dos itens
		/*for(var fruta : frutas) {
			System.out.println(fruta.hashCode());
		}*/
		
		System.out.println("Morango existe na coleção? " + frutas.contains("Morango"));
		
		// Excluir elemento da coleção
		frutas.remove("Morango");

		// Cria um iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		// Listar os dados após a exclusão de um elemento
		while(iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}
		
		// Cria novo arraylist
		ArrayList<String> frutasList = new ArrayList<String>();
		
		// Copia todos os itens da coleção set para o arraylist
		frutasList.addAll(frutas);
		
		// Organiza frutasList em ordem crescente
		frutasList.sort(null);

		System.out.println("Exibir os dados do arraylist");
		frutasList.forEach(System.out::println);
	}

}
