package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();
		
		while (cores.size() < 5) {
			System.out.printf("Digite a %dª cor: ", cores.size()+1);
			cores.add(leia.next());
		}
		
		System.out.println("\nListar todas as cores:");
		cores.forEach(System.out::println);
		
		cores.sort(null);
		
		System.out.println("\nOrdenar as cores:");
		cores.forEach(System.out::println);
		
		leia.close();
	}
	
}
