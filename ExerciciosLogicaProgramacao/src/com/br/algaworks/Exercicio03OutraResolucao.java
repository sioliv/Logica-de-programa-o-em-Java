package com.br.algaworks;

import java.util.Scanner;

public class Exercicio03OutraResolucao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = entrada.nextDouble();
		
		System.out.println("Digite a quantidade do produto");
		Double quantidadeProduto = entrada.nextDouble();
		
		Double subtotal = valorProduto * quantidadeProduto;
		System.out.println(subtotal);
		
		Double desconto = 0.0;
		
		Boolean compraComDesconto = quantidadeProduto >= 10;
		
		if(compraComDesconto) {
			
			desconto = ((subtotal * 10)/100);
			System.out.println("Valor da compra com desconto: " + desconto);
			
		}else {
			
			System.out.println("Compra sem desconto");
		}
		
		Double valorTotal = subtotal - desconto;
		
		System.out.println("O valor total da compra é:" + valorTotal);
	}

}
