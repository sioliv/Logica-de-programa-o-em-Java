package classeInstancia;

public class ClasseInstancia {

	public static void main(String[] args) {
		/*
		 * Você só não vai criar instâncias quando for utilizar métodos estáticos de uma classe ou por motivos específicos. Agora como no exemplo que você deu dos dois funcionários, neste caso é necessário ter dois objetos funcionário, e para isso você precisa instanciar.
		 * Agora como no exemplo que você deu dos dois funcionários,
			neste caso é necessário ter dois objetos funcionário, e para isso você precisa instanciar.
		 */
		//Chamando métodos estáticos de uma classe. Não preciso instânciar
		System.out.println("Quantidade minima estoque: "+ Produto.quantidade_minima_estoque);
		
		//Como vou ter mais de dois produtos, tenho que instânciar o objeto, criando um produto para cada uma instância de Produto
		Produto produto = new Produto(); // Criação de uma instância
		// new produto estou instanciando a classe produto, o tipo produto e o vvalor referente a instancia, estou passando para variável produto
		produto.nome = "Caneca";
		
		//Criando outra instância. a variável produto2 é do tipo produto
		Produto produto2 = new Produto();
		produto.quantidade_minima_estoque = 10; // uma variavel estatica, quando altero em qualquer ponto do programa, ela é atribuida par
		produto2.nome = "Carteira";
		//No caso, o java permite que eu utilize a variável nome para cada produto diferente.
		System.out.println("quantidade minima estoque " + produto.quantidade_minima_estoque);
		System.out.println("quantidade minima estoque: "+ produto2.quantidade_minima_estoque);
		
		
		//System.out.println("produto 1: " + produto.nome);
		//System.out.println("Produto 2: " + produto2.nome);
		
		Impressao.informacao("produto 1: " + produto.nome);
		Impressao.informacao("produto 1: " + produto2.nome);
		//Da mesma forma que posso ter métodos estáticos, posso ter variáveis estáticas.

	}

}
