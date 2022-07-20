package CursoLogicaCapitulo05;

public class EstruturaIf {
	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		
		//Boolean movimentaPeloMenosMetadeDoValor =  (movimentacaoMedia * 2) >= emprestimo;
		
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		
		Boolean temNomeLimpo = true;
		
		/*Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficienteDeAbertura
				&& temNomeLimpo;*/
		
		// Toda expressão com valor booleano pode ser usado dentro do parenteses do if
		if(((movimentacaoMedia * 2) >= emprestimo) && aContaTemTempoSuficienteDeAbertura
		&& temNomeLimpo){
			System.out.println("Sim! Pode liberar empréstimo.");
		}	else {
			System.out.println("Não pode liberar o empréstimo");
		}
	}

}
