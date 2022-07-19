package CursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio04 {
	
	static final String MENSAGEM_PARA_QUEM_NAO_PODE_APOSENTAR = "Você não pode se aposentar!";
	static final String MENSAGEM_PARA_QUEM_PODE_APOSENTAR = "Você pode se aposentar!!!";
	static final int IDADE_MINIMA_PARA_APOSENTAR = 55;
	static final int IDADE_MINIMA_PARA_CONTRIBUICAO = 25;
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		int idadeDaPessoa = scanner.nextInt();
		
		System.out.println("digite a quantidade de tempo que a pessoa contribuiu com a previdência");
		int tempoDeContribuicao = scanner.nextInt();
		
		Boolean condicaoParaAposentadoria = idadeDaPessoa >= IDADE_MINIMA_PARA_APOSENTAR && tempoDeContribuicao >= IDADE_MINIMA_PARA_CONTRIBUICAO;
		
		if(condicaoParaAposentadoria) {
			System.out.println(MENSAGEM_PARA_QUEM_PODE_APOSENTAR);
		} else {
			System.out.println(MENSAGEM_PARA_QUEM_NAO_PODE_APOSENTAR);
		}
		
		scanner.close();
	}

}
