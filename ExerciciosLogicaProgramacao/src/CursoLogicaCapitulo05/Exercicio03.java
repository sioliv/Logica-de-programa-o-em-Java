package CursoLogicaCapitulo05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero referente ao dia da semana: ");
		Integer diaDaSemana = entrada.nextInt();
		
		String dia = null;
		
		switch(diaDaSemana) {
		case 1: dia = "domingo";
			break;
		case 2: dia = "segunda";
			break;
		case 3: dia = "terça";
			break;
		case 4: dia = "quarta";
			break;
		case 5: dia = "quinta";
			break;
		case 6: dia = "sexta";
			break;
		case 7: dia = "sabado";
			break;
		default: System.out.println("Não há dia correspondente digitado");	
		
		}
		System.out.println("O dia escolhido foi: " + dia);
		
		entrada.close();
	}

}
