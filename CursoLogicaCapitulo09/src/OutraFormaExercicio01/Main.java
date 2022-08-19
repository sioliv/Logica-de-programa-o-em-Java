package OutraFormaExercicio01;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.nome = "Celular G7";
		produto.quantidadeEstoque = 10;
		
		verificandoQuantidadeMinima(produto);
		

	}
	
	static void verificandoQuantidadeMinima(Produto produto) {
		
		if(produto.quantidadeEstoque < 10) {
			System.out.println("O produto " + produto.nome + " possui " + produto.quantidadeEstoque + " no estoque precisa repor estoque " );
		} else {
			System.out.println("O produto" + produto.nome + " possui " + produto.quantidadeEstoque + " não precisa repor o estoque ");
		}
	}

}
