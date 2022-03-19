package lista.exerbasicos.java.parte1;

import java.util.Scanner;

public class TemperaturaGrausCelsius {
	
	/*1. Escreva um programa que, com base em uma temperatura em graus celsius, 
	 * a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
	 * seguindo as fórmulas: 
	 * F = C * 1.8 + 32; 
	 * K = C + 273.15; 
	 * Re = C * 0.8; 
	 * Ra = C * 1.8 + 32 + 459.67
	 */
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double grausCelsius = 0;
		double grauKelvin = 0;
		double grauReamur = 0;
		double grauRankine = 0;
		double grauFahrenheit = 0;
		
		System.out.print("Informe a temperatuda em GRAUS CELSIUS: ");
		grausCelsius = ler.nextDouble();
		
		grauKelvin = grausCelsius + 273.15;
		grauReamur = grausCelsius * 0.8;
		grauRankine = grausCelsius * 1.8 + 32 + 459.67;
		grauFahrenheit = grausCelsius * 1.8 + 32; 
		
		System.out.println("\nA conversão de  " + grausCelsius + " GRAUS CELSIUS para a seguintes tempreatura fica: \n" 
		+ grauKelvin + " Kelvin (K),\n" 
		+ grauReamur + " Réaumur (Re),\n"
		+ grauRankine + " Rankine (Ra) e\n" 
		+ grauFahrenheit + " Fahrenheit (F)");
		
	}

}