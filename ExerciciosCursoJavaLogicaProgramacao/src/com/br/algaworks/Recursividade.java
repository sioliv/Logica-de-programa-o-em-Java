package com.br.algaworks;

public class Recursividade {
	public static void main(String[] args) {
		
		//Recursividade é um método chamando o próprio método
		
		
		String[] alunos = new String[] {"Alexandre", "Joao", "Maria"};
		iterarNomes(alunos, 0);
	}
	
	static void iterarNomes (String[] alunos, Integer i ) {

			System.out.println("Aluno: " +alunos[i]);
			++i;
			
			if(i < alunos.length) {
				
				iterarNomes(alunos,  i);
			
		}
		
	}

}
