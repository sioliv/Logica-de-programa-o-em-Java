
public class TesteSacaNegativo {

	public static void main(String[] args) {
		//aula 01 de 05.
		//o objetivo da aula é ter uma quantidade de dinheiro negativa
		
		
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.sacar(101));//mostra falso, nao conseguindo sacar
		
		//logo irá retornar falso, e nao efetuará o saque
		//System.out.println(conta.saldo);
		
		//logo,t oda conta nao pode ter valores negativos. será que nao pode?
		
		
		
		//proibido:
		//conta.saldo = conta.saldo-101;
		System.out.println(conta.getSaldo());
		
		
		
		
		

	}

}
