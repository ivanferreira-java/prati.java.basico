package lista.exerbasicos.java.parte1;

import java.util.Scanner;

public class CalculeMediaSalariosEmpresa {
	
	public static void main(String[] args) {
		
		Scanner lerSalario = new Scanner(System.in);
		double salario1, salario2, salario3, salario4, mediaSalario;
		
		System.out.println("Informe o salario da primeira pessoa: ");
		salario1 = lerSalario.nextDouble();
		System.out.println("Informe o salario da primeira pessoa: ");
		salario2 = lerSalario.nextDouble();
		System.out.println("Informe o salario da primeira pessoa: ");
		salario3 = lerSalario.nextDouble();
		System.out.println("Informe o salario da primeira pessoa: ");
		salario4 = lerSalario.nextDouble();
		
		mediaSalario = (salario1 + salario2 + salario3 + salario4) / 4;
		
		System.out.println("A média de salários da empresa é: " + mediaSalario);
		
	}
}
