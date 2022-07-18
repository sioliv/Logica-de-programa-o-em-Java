package com.br.algaworks;

import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18; // ver aula de orientação a objeto para entender melhor. 
	
	public static void main(String[] args) {
		//Variável que Não pode ser alterada ao longo do meu algorítmo. Ela deve ser fixa. 
		//Logo antes do tipo, coloco a palavra final
		
		//final Integer idadeMinimaParaTirarCarteira = 18;
		
		
		Scanner scanner = new Scanner(System.in);
		Integer idade = scanner.nextInt();
		
		
		System.out.println("----------------------------------");
		
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		
		// System.out.println("Pode tirar carteira? " + podeTirarCarteira);
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira");
		} else {
			System.out.println("Não, Ele(a) não pode tirar carteira.");
		}
	}
	

}
