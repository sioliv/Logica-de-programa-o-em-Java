import java.util.Scanner;

public class RecebendoParametros {

	static Boolean posicaoValida;
	
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        imprimirTraco();

	        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

	        System.out.println("Escolha dentre os cursos abaixo: ");

	        iterarEExibirPosicoesDoVetorString(cursos);

	        System.out.print("O curso que você deseja é o: ");
	        Integer posicaoCursoEscolhido = scanner.nextInt();

	        verificacaoPosicaoFormaPagamentoEscolhida(posicaoCursoEscolhido, cursos);
	       
	        validarPosicao();

	        imprimirTraco();

	        String[] formasPagamento = new String[] {"Cartão", "Boleto"};

	        System.out.println("Escolha dentre as formas de pagamento abaixo: ");

	        iterarEExibirPosicoesDoVetorString(formasPagamento);

	        System.out.print("Sua forma de pagamento escolhida é: ");
	        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

	        verificacaoPosicaoFormaPagamentoEscolhida(posicaoFormaPagamentoEscolhida, formasPagamento);
	       

	        validarPosicao();

	        String cursoEscolhido = cursos[posicaoCursoEscolhido];
	        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

	        imprimirTraco();

	        System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

	        scanner.close();
	    }

	    static void imprimirTraco() {
	        System.out.println("----------------------------------------------");
	    }

	    static void validarPosicao() {
	        if (!posicaoValida) {
	        	posicaoInvalida();
	            System.exit(1);
	        }
	    }
	    
	    static void posicaoInvalida() {
	    	System.err.println("Posição inválida!");
	    }
	    
	    static void iterarEExibirPosicoesDoVetorString(String[] vetor){
	    	 for(int i = 0; i < vetor.length; i++) {
		            System.out.println("[" + i + "] " + vetor[i]);
		        }
	    }
	    
	    static void verificacaoPosicaoFormaPagamentoEscolhida(Integer posicaoFormaPagamentoEscolhida, String[] formasPagamento) {
	    	 posicaoValida = posicaoFormaPagamentoEscolhida >= 0
		                && posicaoFormaPagamentoEscolhida < formasPagamento.length;
	    }
}