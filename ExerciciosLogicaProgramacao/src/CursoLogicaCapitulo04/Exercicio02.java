package CursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio02 {
	
	static final Double VALOR_DO_FRETE = 15.00; 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorDoProduto = scanner.nextDouble();
		
		
		Double valorFinalDoProduto = 0.0;
		
		Boolean valorFinalForMaiorQueCem = valorFinalDoProduto >= 100;
		
		if(!valorFinalForMaiorQueCem) {
			valorFinalDoProduto = valorDoProduto + VALOR_DO_FRETE;
		} else {
			System.out.println("O valor final do produto é: " + valorFinalDoProduto);
		}
		
		System.out.println("O valor final do produto e: " +valorFinalDoProduto);
		
		scanner.close();
	}

}
