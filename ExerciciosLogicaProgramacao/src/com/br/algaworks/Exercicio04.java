package com.br.algaworks;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = entrada.nextDouble();
		
		System.out.println("Digite a quantidade do produto: ");
		Double quantidadeProduto = entrada.nextDouble();
		
		Double subtotal = valorProduto * quantidadeProduto;
				
		Double temDesconto = 0.0;
		
		Boolean quantidade = quantidadeProduto > 10;
				
		if(!quantidade) {
			System.out.println("O valor não possui desconto");
			
		} else {
			temDesconto = (subtotal * 10)/100;
						
		}
		
		Double totalFinal = subtotal - temDesconto;
		
		System.out.println("O valor final do produto é: " + totalFinal);
		
		entrada.close();
				
	}
}
