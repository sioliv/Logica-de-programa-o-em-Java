package Exercicio01;

public class Main {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto(); //criando a variável do tipo produto.
		
		produto.nomeProduto = "Celular lg";
		produto.quantidade = 2;
		
		verificandoEstoque(produto);
		
		System.out.println("Favor, é necessário repor o estoque do produto " + produto.nomeProduto + " ? " + verificandoEstoque(produto));

	}

	static Boolean verificandoEstoque(Produto produto) {
		
		if(produto.quantidade < produto.QUANTIDADE_MINIMA) {
			return true;
		
		}	else 	{
			
			return false;
		}
	}
}
