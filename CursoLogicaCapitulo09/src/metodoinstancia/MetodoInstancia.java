package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		//O método da classe é conhecido como método de instância. É um método não estático definido na classe.
		//Antes de chamar ou invocar o método de instância, é necessário criar um objeto de sua classe.
		
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Alexandre";
		cliente.segundoNome = "Afonso";
		cliente.telefone = "0000000000";
		cliente.email = "alexandre.afonso@algaworks.com";
		
		//Toda vez eu declaro a variável e uso o método, é um método de instância.
		//Não cria variáveis estáticas dentro de uma classe que visa bstrair conceitos. Ex dentro da classe Cliente, não posso criar métodos estáticos
		System.out.println("Nome cliente: " + cliente.obterNomeCompletoCliente());
		
	}
	
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.segundoNome;
//		
//		return nomeCompleto;
//	}

}
