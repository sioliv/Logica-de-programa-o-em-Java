package com.br.algaworks;

import java.util.Scanner;

public class AlterandoValorVariavel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		
		Double produto = scanner.nextDouble();
		
		System.out.print("Digite o tipo do pagamento: [1 = à vista / 2 = à prazo]:");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (!pagamentoAVista) {
			
			juros = 10.0;
			
		}
		
		Double acrescimoJurosProduto = produto * juros / 100;
		
		Double valorTotal = acrescimoJurosProduto + produto;
		
		System.out.println("Valor total: " +valorTotal);
		
		
		scanner.close();
		
	}

}
