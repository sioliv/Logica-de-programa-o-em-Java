package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		 //instanciando
		Conta primeiraConta = new Conta(); //instanciando conta, criando uma variável para acessar os atributos
		primeiraConta.saldo = 200; // o saldo da primeira conta deve valer 200. A variável primeira conta é referencia para o objeto conta
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50; //instancia diferente , ou seja, essa instância é um outro objeto. é a segunda conta
		//qual conta tenho o saldo? Várias contas possuem saldo. Qual conta você está falando????
		//objeto.atributo
		//sempre trabalhando orientado ao objeto
		
		
		System.out.println(segundaConta.saldo);
		
		//segundaConta.saldo += 100;
		//System.out.println(segundaConta.saldo);
		System.out.println ("primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		//note que no java, quando os seus atributos são criados, eles são default, ou seja, nulos, 0, por padrão
		//boolean é false...
		//os valores padrões é zero, a nao ser que você set um valor ao atributo
		System.out.println(primeiraConta.agencia);
		
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta está" + "na agencia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesmissima conta");
		} else {
			System.out.println("as contas são diferentes");
		}
		
		
		
		//testando se sao as mesmas contas
		System.out.println(primeiraConta);
		
		System.out.println(segundaConta);
	}

}
