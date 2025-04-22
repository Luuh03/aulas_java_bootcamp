package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Set<Integer> valores = new HashSet<Integer>();
		
		System.out.println("Escreva números inteiros não repetidos!");
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			valores.add(leia.nextInt());
		}
		
		Iterator<Integer> iValores = valores.iterator();

		System.out.println("Listar dados do Set:");
		while(iValores.hasNext())
			System.out.println(iValores.next());
		
		leia.close();
	}

}
