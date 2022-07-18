package CursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio01OutroJeito {
	public static void main(String[] args) {

		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		Integer primeiroNumero = scanner.nextInt();
		
		System.out.println("Digite a operacao desejada: [1] - Adicao [2] - Subtracao [3] - multiplicacao [4] - Divisao");
		Integer operacaoDesejada = scanner.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		Integer segundoNumero = scanner.nextInt();
		
		Integer resultado = null;
				
		if(operacaoDesejada.equals(1)) {
			
			resultado = primeiroNumero + segundoNumero;
			
		}else if(operacaoDesejada.equals(2)) {
			
			resultado = primeiroNumero - segundoNumero;
			
		}else if(operacaoDesejada.equals(3)) {
			
			resultado = primeiroNumero * segundoNumero;
			
		} else {
			
			resultado = primeiroNumero / segundoNumero;
			
		}
		
		System.out.println("Resultado da operacao: " + resultado);
	}

}
