import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que peça dois números do usuário
		 *  e também qual a operação ele deseja fazer - adição ou subtração.
		 *  Para cada operação, 
		 *  você deve construir um método que realize a mesma,
		 *   ou seja, teremos um método para adição,
		 *    que vai receber dois números como parâmetros
		 *   e retornar o resultado da soma entre eles, e outro método para subtração.
Fique a vontade para implementar multiplicação e divisão também.
		 */
		
		Scanner scanner = new Scanner(System.in);
	
		Integer recebendoOprimeiroNumero = recebendoOsDoisNumeros(scanner);
		
		traco();
		
		Integer escolhendoAOperacao =  escolhendoAOperacao( scanner);
		
		traco();
		
		Integer recebendoOsegundoNumero  = recebendoOsDoisNumeros(scanner);
		
		traco();
		
		Integer calculando =  calculadora(escolhendoAOperacao, recebendoOprimeiroNumero, recebendoOsegundoNumero);
		
		System.out.println("O resultado é: " + calculando);
		
		scanner.close();
	}
		
		
	
		
		static Integer recebendoOsDoisNumeros(Scanner scanner) {
			
			System.out.println("Digite o numero : ");
			return scanner.nextInt();
		
		}
		
		static void traco() {
			System.out.println("*********************");
		}
		
		static Integer escolhendoAOperacao(Scanner scanner) {
			
		System.out.println("Escolha a operação: ");
		
		String[] operacao = new String[] {"adição", "subtração"};
		
			for(int i = 0; i < operacao.length; i++) {
				System.out.println("[" + i + "]" + operacao[i]);
			}
			
			return scanner.nextInt();
		}
		
		static Integer calculadora(Integer operacao, Integer numeroUm, Integer numeroDois) {
			
			Integer resultado = null;
			
			switch(operacao) {
			case 0 : {
				
				resultado = numeroUm + numeroDois;
				break;
					
			}
			case 1 : {
				
				resultado = numeroUm - numeroDois;
				break;
			}
			
			default:
				System.err.println("Escolha uma operação válida!");
				System.exit(0);
			
			
		}
			return resultado;
	}
}
