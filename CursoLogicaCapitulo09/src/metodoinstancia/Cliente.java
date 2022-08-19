package metodoinstancia;

public class Cliente {
	
	//O método da classe é conhecido como método de instância. É um método não estático definido na classe.
	//Antes de chamar ou invocar o método de instância, é necessário criar um objeto de sua classe.
	
	String primeiroNome;
	
	String segundoNome;
	
	String telefone;
	
	String email;
	
	String obterNomeCompletoCliente() {
		String nomeCompleto = primeiroNome + " " + segundoNome;
		
		return nomeCompleto;
	}
	
	String obterDDD() {
		String ddd = telefone.substring(0, 2);
		return ddd;
	}

}
