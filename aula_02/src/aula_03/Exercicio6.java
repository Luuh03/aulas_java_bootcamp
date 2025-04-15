package aula_03;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double novoSalario;
		String nomeCargo;
		
		System.out.println("Código do Cargo		Cargo			Percentual do Reajuste");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("	1  	|	Gerente		   |	10%");
		System.out.println("	2  	|	Vendedor	   |	7%");
		System.out.println("	3  	|	Supervisor	   |	9%");
		System.out.println("	4  	|	Motorista	   |	6%");
		System.out.println("	5  	|	Estoquista	   |	5%");
		System.out.println("	6  	|	Técnico de TI	   |	8%");
		
		System.out.print("\nDigite o nome do colaborador: ");
		String nomeColaborador = leia.next();
		
		System.out.print("Digite o código do cargo: ");
		int cargo = leia.nextInt();
		
		System.out.print("Digite o salário: ");
		float salario = leia.nextFloat();

		leia.close();
		switch(cargo) {
			case 1:
				nomeCargo = "Gerente";
				novoSalario = salario * 1.1;
				break;
			case 2:
				nomeCargo = "Vendedor";
				novoSalario = salario * 1.07;
				break;
			case 3:
				nomeCargo = "Supervisor";
				novoSalario = salario * 1.09;
				break;
			case 4:
				nomeCargo = "Motorista";
				novoSalario = salario * 1.06;
				break;
			case 5:
				nomeCargo = "Estoquista";
				novoSalario = salario * 1.05;
				break;
			case 6:
				nomeCargo = "Técnico de TI";
				novoSalario = salario * 1.08;
				break;
			default:
				System.out.println("Código de cargo inválido!");
				return;
		}
		
		System.out.printf("\nNome do colaborador: %s"
				+ "\nCargo: R$ %s"
				+ "\nSalário: R$ %.2f", nomeColaborador, nomeCargo, novoSalario);
		
	}
}
