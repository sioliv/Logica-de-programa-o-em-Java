package com.br.algaworks;

import java.util.Scanner;

public class Exercicio03ComConstante {
	
	static final Double NOTA_CORTE_ALUNO_NAO_FICAR_REPROVADO = 7.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		Double nota = scanner.nextDouble();
		
		Boolean notaAluno = nota >= NOTA_CORTE_ALUNO_NAO_FICAR_REPROVADO;
		
		if(notaAluno) {
			System.out.println("O aluno passou de ano");
		} else {
			System.out.println("O aluno não passou de ano");
		}
		
	}

}
