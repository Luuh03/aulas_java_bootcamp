package aula_02;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o salário bruto do colaborador: ");
		float salarioBruto = leia.nextFloat();
		
		System.out.print("Digite o adicional noturno: ");
		float adicionalNoturno = leia.nextFloat();
		
		System.out.print("Digite o valor das horas extras: ");
		float horasExtras = leia.nextFloat();
		
		System.out.print("Digite os descontos: ");
		float descontos = leia.nextFloat();
		
		System.out.printf("\nO salário liquido do colaborador é: %.2f", CalculaSalarioLiquido(salarioBruto, adicionalNoturno, horasExtras, descontos));
		
		leia.close();
	}
	
	static float CalculaSalarioLiquido(float salarioBruto, float adicionalNoturno, float horasExtras, float descontos) {
		return (salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos);
	}
	
}
