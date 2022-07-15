package com.br.algaworks;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite a nota do aluno: ");
		Double nota = scanner.nextDouble();
		
		Boolean notaAlunoMaiorQueSete = nota  >  7.0;
		
		if(notaAlunoMaiorQueSete) {
			System.out.println("O aluno " + nome + " passou de ano!");
		} else {
			System.out.println("O aluno " + nome + " foi reprovado ");
		}
		
	}

}
