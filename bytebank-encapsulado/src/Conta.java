

public class Conta {
	//Declarando atributos da classe conta
	
	
	 private static int total; // pois eu quero que esse seja um atributo da classe e nao um agtributo geral.
	 private double saldo; // atributo de instância
	 private int agencia;
	 private int numero;
	 private Cliente titular;// = new Cliente(); // posso brincar, falando que sempre que eu abrir uma conta, ela terá um novo clliente.
	 
	 //aula 01 - 04, quero guardar além do nome do titular, o seu cpf e sua profissão
	 // String cpf;
	 // String profissao;
	 //note que a classe começa a ficar inchada. sera que toda conta tem um cpf? 
	 //será que cpf é uma informaçao da conta? 
	 //será que profissão é uma informação da conta?
	 //ao invés de aumentar o atributo da classe conta
	 //podemos criar um tipo novo, chamado cliente, e posso falar
	 //que todo cliente tem nome, cpf e profissao.
	 
	 
	 
	 //criando gets e setters
		public  double getSaldo() {//como o saldo é privado e sentimos a necessidade que outrS PESSOAS PEGUEM ESSA INFO, 
			return this.saldo;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public void setNumero(int numero){
			if(numero <= 0 ) {
				System.out.println("nao pode valor menor ou igual a 0");
				return;
			}
			
			this.numero = numero;
			//aqui você pode fazer if, ou seja, validações. essa é uma das vantagens dos got setters
			
			
		}
		
		public int getAgencia() {
			return agencia;
		}
		
		public void setAgencia(int agencia) {
			if (agencia <= 0) {
				System.out.println("nao pode valor menor igual a 0");
				return; // como é void, nao coloco retorno. para a execução
			}
			this.agencia = agencia;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		
		public Cliente getTitular() {
			return titular;
		}
		
	
	
	//criando os métodos, ou seja, os comportamentos aula  01 - 03
	 //void pois o deposito não retorna nenhuma informação
		//caso ele somen-te execute alguma operação sem precisar retornar valores, o valor de retorno deverá servoidvoid
	 public void deposita(double valor){  //entre parenseses eh o que o metodo recebe de informacao, você coloca o que vocÇe recebe.
		 this.saldo = saldo + valor;// entre chaves é o que o método devolve para voce de informacao
	 }
	 //executou uma operação sem retornar valores;
	 //entre parenteses é chamado de parâmetro.
	 //this indica a referencia para o objeto na conta do paulo.
	 //valor é uma variavel temporaria, é um argumento . logo nao precisa ser declarada como atributo
	 
	 
	 
	 //construtor nao é um metodo. [e uma rotina de inicializacao.
	 //só é exectado uma unica vez
	 //através do constrtor, posso inicializar alguns dados como 
	 //o saldo valer 100 reais..
	 //seria o equivalente em colocar no private double saldo = 100;
	 //posso colocar o system.out.println
	 //posso conectar ao banco de dados..
	 //obriguei que a conta deve ter agencia e número, atrav´es do construtor
	 //no construtor, coloco a minha regra de negócios..
	 public Conta(int agencia, int numero) {
		 //this.saldo = 100;
		 
		 Conta.total++;//esse atributo total é da classe Conta e nao do objeto Conta
		 System.out.println("o total de contas é: "+ Conta.total);
		 this.agencia = agencia;
		 this.numero = numero;
		 
		 System.out.println("Estou criando uma conta" +this.numero);
		 
		 //mas o mais interessante é que o construtor pode receber parânmetros
		 
	 }
	 //depois que criei o construtor, preciso do get e setters?
	 //nope
	 
	 
	 
	 //sobre construtor
	 //O Construtor é um método especial que é chamado toda vez que um objeto é instanciado. Ele possibilita tanto a inicialização de alguns dados em sua criação como também sobrescrever o Construtor padrão (que atribui os valores padrões aos atributos da classe) por um Construtor que recebe parâmetros. Isso significa que, caso você implemente um Construtor que receba os parâmetros int agencia e int numero como no exemplo:

		// public Conta( int agencia, int numero) { 
		     //   this.agencia = agencia;
		       // this.numero = numero;
		       // System.out.println("estou criando uma conta" + this.numero);
		  //  }

		//Você estará forçando a inicialização desses dois atributos logo no processo de criação, isso é útil para quando você quer que no seu sistema não seja permitido a criação de uma Conta sem agencia e/ou sem número. Agora, por exemplo, sempre que alguém quiser criar uma conta nova, será obrigado a fornecer uma agencia e um número, caso contrário, não conseguirá nem criar um novo objeto do tipo Conta.
	 
	 // a inicialização de atributos é a principal responsabilidade do construtor.
	 
	 
	 
	 //aula 05 - 03 metodo com retorno. metodo saca
	 
	 public boolean sacar(double valor) {
		 
		 if (this.saldo>= valor) {
			 this.saldo = this.saldo - valor;
			 return true;//note que o método retorna alguma coisa, logo ele nao é void
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

	public static int getTotal() {
		
		return Conta.total;
	}
	 
	
	 
	 

}
