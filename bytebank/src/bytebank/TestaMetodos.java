package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {
		// Classe testa métodos para aprender a utiizar métodos
		// main ctrl + espaço
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);//para chamar um metodo
		//utiliza-se o nome da referencia.nomeDoMetodo e passar o valor dentro dos parametros
		//exemplo nomeDaReferencia.nomeDoMetodo()
		System.out.println(contaDoPaulo.saldo);
		
		
		boolean conseguiuRetirar = contaDoPaulo.sacar(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar); // o retorno do metodo fica ao seu critério

		
		

		//aula 08 - 03 : métodos com referÇEncia e mais retorno
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		contaDaMarcela.transfere(300, contaDoPaulo);//passei a referencia da conta do paulo para fazer a transferencia
		//a conta de origem é a conta da marcela, já eh o objeto na qual esta sendo invocado o método
		
		
		
		if (contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("Transferencia efetuada com sucesso");
		}else {
			System.out.println("Transferencia, nao efetuada");
			
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		
		//aula 04 - 01
		contaDoPaulo.titular = "paulo silveira";
		
		System.out.println(contaDoPaulo.titular);
		
		
		
		
	}
	
	
	
	
	
		
		
		
		
		

}
