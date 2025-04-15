package aula_03;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String palavras[] = new String[3];
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.printf("Digite a %dª palavra: ", i+1);
			palavras[i] = leia.next();
		}
		
		if(palavras[0].equalsIgnoreCase("vertebrado")) {
			if(palavras[1].equalsIgnoreCase("Ave")) {
				if(palavras[2].equalsIgnoreCase("carnívoro"))
					System.out.println("Águia");
				else if(palavras[2].equalsIgnoreCase("Onívoro"))
					System.out.println("Pomba");
				else
					System.out.println("Animal não encontrado!");
			} else if(palavras[1].equalsIgnoreCase("Mamífero")) {
				if(palavras[2].equalsIgnoreCase("Herbívoro"))
					System.out.println("Vaca");
				else if(palavras[2].equalsIgnoreCase("Onívoro"))
					System.out.println("Homem");
				else
					System.out.println("Animal não encontrado!");
			}
		} else if(palavras[0].equalsIgnoreCase("invertebrado")) {
			if(palavras[1].equalsIgnoreCase("Inseto")) {
				if(palavras[2].equalsIgnoreCase("Herbívoro"))
					System.out.println("Lagarta");
				else if(palavras[2].equalsIgnoreCase("Hematófago"))
					System.out.println("Pulga");
				else
					System.out.println("Animal não encontrado!");
			} else if(palavras[1].equalsIgnoreCase("Anelídeo")) {
				if(palavras[2].equalsIgnoreCase("Hematófago"))
					System.out.println("Sanguessuga");
				else if(palavras[2].equalsIgnoreCase("Onívoro"))
					System.out.println("Minhoca");
				else
					System.out.println("Animal não encontrado!");
			}
		} else {
			System.out.println("Animal não encontrado!");
		}
		
		leia.close();
	}

}
