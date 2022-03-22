package lista.exerbasicos.java.parte1;

import java.util.Scanner; 

public class ConjuntoDadosContendoAlturaSexo {
	
	/*2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva: 
	 * a. a maior e a menor altura do grupo; 
	 * b. média de altura dos homens; 
	 * c. o número de mulheres.*/
	
	public static void main(String[] args) {
		
		int sexo, quantidadeMulher=0, quantidadeHomen=0;
		double altura, somarHomen=0, mediaAlturaHomen=0, menorAltura=10 /*Não pode ser 0, pois, não tem uma altura menor*/, maiorAltura=0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			System.out.println("Escolha o sexo da pessoa (1- Mulher e 2-Homen): ");
			sexo = entrada.nextInt();
			System.out.println("Informe a altura: ");
			altura = entrada.nextDouble();
			
			if (sexo == 1) {
				quantidadeMulher++;
			}else if (sexo == 2) {
				quantidadeHomen++;
				somarHomen = somarHomen + altura;
			} else {
				System.out.println("Opção não informada!");
			}
			
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}else if (altura < menorAltura) {
				menorAltura = altura;
			}
	
		}//FECHAMENTO DO FOR
		
		mediaAlturaHomen = somarHomen / quantidadeHomen;
		
		System.out.println("\n\nA maior altura do grupo é: " + maiorAltura + " m,\ne a menor altura é: " + menorAltura + " m.");
		System.out.println("\nA média de altura dos homens é: " + mediaAlturaHomen + " m.");
		System.out.println("\nO número de mulhres é: " + quantidadeMulher + ".");
		
		entrada.close();
		
	}

}

