package metodoinstancia;

public class Cliente {
	
	String primeiroNome;
	
	String segundoNome;
	
	String telefone;
	
	String email;
	
	String obterNomeCompletoCliente() {
		String nomeCompleto = primeiroNome + " " + segundoNome;
		
		return nomeCompleto;
	}

}
