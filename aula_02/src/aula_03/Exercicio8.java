package aula_03;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float saldo = 1000;
		
		System.out.println("Operações bancárias\n"
				+ "1 - Saldo\n"
				+ "2 - Saque\n"
				+ "3 - Depósito\n");
		System.out.print("Digite o código da operação que deseja realizar: ");
		int operacao = leia.nextInt();
		
		switch(operacao) {
			case 1:
				System.out.printf("\nOperação - Saldo\n"
						+ "\nSaldo: R$ %.2f", saldo);
				break;
			case 2:
				System.out.print("Digite o valor que deseja sacar: ");
				float saque = leia.nextFloat();
				
				System.out.println("\nOperação - Saque\n");
				if(saque > saldo)
					System.out.println("Saldo Insuficiente!");
				else
					System.out.printf("Novo Saldo: R$ %.2f", saldo - saque);
				break;
			case 3:
				System.out.print("Digite o valor que deseja depositar: ");
				float deposito = leia.nextFloat();
				
				System.out.printf("\nOperação - Depósito\n"
						+ "\nNovo Saldo: R$ %.2f", saldo + deposito);
				break;
			default:
				System.out.println("Operação Inválida!");
				leia.close();
				return;
		}
		
		leia.close();

	}

}
