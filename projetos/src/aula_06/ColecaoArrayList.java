package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		// Criação do arraylist
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		// Injeção de dados no arraylsit
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
		/*System.out.print("Digite um número real: ");
		double input = leia.nextDouble();
		
		numeros.add(input);*/
		
		// Listando valores da coleção arraylist
		for(var numero : numeros)
			System.out.println(numero);
		
		System.out.println("Indice do número 9.0: " + numeros.indexOf(9.0));

		System.out.println("O número 9.0 existe na coleção?  " + numeros.contains(9.0));

		System.out.println("Qual o valor armazenado no indice 2?  " + numeros.get(2));
		
		// Altera o valor de um elemento
		numeros.set(2, 10.0);
		
		// Exibe dados atualizados com o método foreach
		System.out.println("Exibe os dados após a atualização: ");
		numeros.forEach(System.out::println);
		
		//Exclui um elemento da lista
		numeros.remove(2);
		numeros.remove(2.0);

		System.out.println("Exibe os dados após a exclusão: ");
		numeros.forEach(System.out::println);
		
		System.out.println("Qual o tamanho da coleção?  " + numeros.size());
		
		// Limpar a coleção
		// numeros.clear();
		
		System.out.println("A coleção está vazia?  " + numeros.isEmpty());
		
		numeros.sort(null);
		
		System.out.println("Exibir os dados ordenados em ordem crescente:");
		numeros.forEach(System.out::println);
		
		numeros.sort(Comparator.reverseOrder());
		
		System.out.println("Exibir os dados ordenados em ordem decrescente:");
		numeros.forEach(System.out::println);
		
		
		leia.close();

	}

}
