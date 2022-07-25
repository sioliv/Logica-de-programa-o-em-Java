package CursoLogicaCapitulo05;

import java.util.Scanner;

public class Exercicio01 {
	
	static final int NOTA_MINIMA_TOTAL = 150;
	static final int NOTA_DE_CORTE = 60;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota de matematica: ");
		Integer notaDeMatematica = scanner.nextInt();
		
		System.out.println("Digite a nota de português: ");
		Integer notaDePortugues = scanner.nextInt();
		
		Boolean notaDeCorteMatematica = notaDeMatematica >= NOTA_DE_CORTE;
		
		Boolean notaDeCortePortugues = notaDePortugues >= NOTA_DE_CORTE;
				
		int notaTotalDaProva = notaDePortugues + notaDeMatematica;
		System.out.println(notaTotalDaProva);
		
		if(notaDeCorteMatematica && notaDeCortePortugues &&(notaTotalDaProva >= NOTA_MINIMA_TOTAL)) {
			System.out.println("Candidato classificado");
		} else {
			System.out.println("Candidato Desclassificado");
		}
				
		scanner.close();
	}
	

}
