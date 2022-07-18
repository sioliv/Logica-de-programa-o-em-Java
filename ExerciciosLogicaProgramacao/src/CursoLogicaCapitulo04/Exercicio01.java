package CursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		Integer primeiroNumero = scanner.nextInt();
		
		System.out.println("Digite a operacao desejada: [1] - Adicao [2] - Subtracao [3] - multiplicacao [4] - Divisao");
		Integer operacaoDesejada = scanner.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		Integer segundoNumero = scanner.nextInt();
		
				
		if(operacaoDesejada == 1) {
			Integer soma = primeiroNumero + segundoNumero;
			System.out.println("Resultado da operacao: " + soma);
		}else if(operacaoDesejada == 2) {
			Integer subtracao = primeiroNumero - segundoNumero;
			System.out.println("Resultado da operacao subtracao: " + subtracao);
		}else if(operacaoDesejada == 3) {
			Integer multiplicacao = primeiroNumero * segundoNumero;
			System.out.println("Resultado da operacao multiplicacao: " + multiplicacao);
		} else {
			
			Integer divisao = primeiroNumero / segundoNumero;
			System.out.println("Resultado da operacao divisao: " + divisao);
		}
		
		
	}

}
