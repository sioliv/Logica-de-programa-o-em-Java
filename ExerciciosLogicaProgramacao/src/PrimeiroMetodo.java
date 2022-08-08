import java.util.Scanner;

public class PrimeiroMetodo {
	
	static Boolean posicaoValida;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        imprimirTraco();

	        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

	        System.out.println("Escolha dentre os cursos abaixo: ");

	        for(int i = 0; i < cursos.length; i++) {
	            System.out.println("[" + i + "] " + cursos[i]);
	        }

	        System.out.print("O curso que você deseja é o: ");
	        Integer posicaoCursoEscolhido = scanner.nextInt();

	        posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

	        validarPosicao();

	        imprimirTraco();

	        String[] formasPagamento = new String[] {"Cartão", "Boleto"};

	        System.out.println("Escolha dentre as formas de pagamento abaixo: ");

	        for(int i = 0; i < formasPagamento.length; i++) {
	            System.out.println("[" + i + "] " + formasPagamento[i]);
	        }

	        System.out.print("Sua forma de pagamento escolhida é: ");
	        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

	        posicaoValida = posicaoFormaPagamentoEscolhida >= 0
	                && posicaoFormaPagamentoEscolhida < formasPagamento.length;

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

	}
