package bytebank;

public class Conta {
	//Declarando atributos da classe conta
	
	 double saldo;
	 int agencia;
	 int numero;
	 String titular;
	 //aula 01 - 04, quero guardar além do nome do titular, o seu cpf e sua profissão
	 String cpf;
	 String profissao;
	 //note que a classe começa a ficar inchada. sera que toda conta tem um cpf? 
	 //será que cpf é uma informaçao da conta? 
	 //será que profissão é uma informação da conta?
	 //ao invés de aumentar o atributo da classe conta
	 //podemos criar um tipo novo, chamado cliente, e posso falar
	 //que todo cliente tem nome, cpf e profissao.
	 
	
	
	//criando os métodos, ou seja, os comportamentos aula  01 - 03
	 //void pois o deposito não retorna nenhuma informação
	 public void deposita(double valor){  //entre parenseses eh o que o metodo recebe de informacao, você coloca o que vocÇe recebe.
		 this.saldo = saldo + valor;// entre chaves é o que o método devolve para voce de informacao
	 }
	 //entre parenteses é chamado de parâmetro.
	 //this indica a referencia para o objeto na conta do paulo.
	 //valor é uma variavel temporaria, é um argumento . logo nao precisa ser declarada como atributo
	 
	 
	 
	 //aula 05 - 03 metodo com retorno. metodo saca
	 
	 public boolean sacar(double valor) {
		 if (this.saldo>= valor) {
			 this.saldo = this.saldo - valor;
			 return true;
		 }else {
			 return false;
		 }
		  
	 }
	 
	 
	 //aula08 - 03 metodos com referencia e mais retorno
	 
	 public boolean transfere(double valor, Conta destino ) {
		 if (this.saldo>=valor) {
			 this.saldo = this.saldo - valor; //this.saldo-=valor;
			 destino.deposita(valor); //destino.saldo += valor; // aqui vai o deposito dos valores
			 return true;
		 }else {
			 return false; //caso contrario nao tenha valor suficiente, retorne falso
		 }
		 
	 }
	 
	 
	 

}
