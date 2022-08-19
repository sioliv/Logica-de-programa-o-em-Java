package primeiraClasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "smartphone";
		produto.preco = 500.0;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);
		
		

	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		//A classe produto se tornou um tipo que faz abstração dos outros atributos.
		System.out.println("Quantidade em estoque do produto "+ produto.nome + " é " + produto.quantidade);
	}

}
