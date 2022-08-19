package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		//O método da classe é conhecido como método de instância. É um método não estático definido na classe.
		//Antes de chamar ou invocar o método de instância, é necessário criar um objeto de sua classe.
		
		//Criando um objeto da classe  
		Cliente cliente = new Cliente();
		
		cliente.primeiroNome = "Alexandre";
		cliente.segundoNome = "Afonso";
		cliente.telefone = "2100000000";
		cliente.email = "alexandre.afonso@algaworks.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Joao";
		cliente2.segundoNome = "Alves";
		cliente2.telefone = "34888888888";
		cliente2.email = "joao@algaworks.com";
		
		//Toda vez eu declaro a variável e uso o método, é um método de instância.
		//Não cria variáveis estáticas dentro de uma classe que visa bstrair conceitos. Ex dentro da classe Cliente, não posso criar métodos estáticos
		 //invocando o método da instância   
		System.out.println("Nome cliente: " + cliente.obterNomeCompletoCliente() + ", DDD " + cliente.obterDDD());
		System.out.println("Nome cliente: " + cliente2.obterNomeCompletoCliente() + ", DDD " + cliente2.obterDDD());
	}
	
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.segundoNome;
//		
//		return nomeCompleto;
//	}

}
