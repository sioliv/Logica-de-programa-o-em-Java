package CursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double gastoTotal = 0.0;
		
		System.out.println("Digite o valor da conta de luz");
		gastoTotal += scanner.nextDouble();
		
		System.out.println("Digite o valor da conta de agua: ");
		gastoTotal += scanner.nextDouble();
		
		System.out.println("Digite o valor da conta de telefone");
		gastoTotal += scanner.nextDouble();
		
		System.out.println("Digite o valor da Escola do Filho");
		gastoTotal += scanner.nextDouble();
		
		System.out.println("Digite o valor da fatura do cartão");
		gastoTotal += scanner.nextDouble();
		
		System.out.println("Digite o valor com os gastos do supermercado");
		gastoTotal += scanner.nextDouble();
			
		System.out.println("O gasto total que a familia teve é de R$: " +	gastoTotal);
		
	}

}
