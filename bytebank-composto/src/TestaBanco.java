
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente(); //a referencia
		
		//criamos uma nova classe chamada TestaBanco. Fizemos um main e criaremos uma
		//referencia para um cliente que chamaremos de paulo
		
		//vamos pupolar esse objeto, criando seus atributos, setando atributos nesse objeto
		
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		//criando a conta do paulo, 
		//criei  o objeto na memória, devolveu o numerozinho e guardou o numero na referência
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		//como fazer para que o titular, que quero que nao seja mais uma string, seja uma referência 
		//para um  objeto do tipo cliente?
		//vou para a classe conta , troco a string titular para cliente
		//note que o titular tornou-se uma flecha para o paulo, tornando-se uma
		//referÊncia para o cliente paulo.
		//associacao - atribuo uma referencia ao atributo titular.
		
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
		
		
		
		
		
		
		

	}

}
