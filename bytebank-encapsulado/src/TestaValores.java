
public class TestaValores {

	public static void main(String[] args) {
		
		//quantas contas foram abertas, instanciadas, construidas, dada o new Conta?
		
		Conta conta = new Conta(1337, 24226);
		//total++;// toda vez que uma pessoa abre uma conta, total ++ incrementa
		
		//problemas: a variavel de escopo. nao valera em outro local.
		//devera ser um atributo que ssera um int total e sera privado;
		
		
		//criando uma segunda conta para testar quantas contas eu consegui criar.
		
		Conta conta2 = new Conta(1335, 242325);
		
		//teria como eu deixar a conta com valores negativos?
		//a conta esta inconsistente com relacao a nossa regra de neg[ocio.
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		//teria que alterar os dois metodos e fazer um if neles.
		
		
		
		
		
		System.out.println(conta.getAgencia());
		
		//existe uma forma de restringir dados, atraves de construtor
		//os parenteses invocam os construtores.
		//ver o codigo conta
		
		
		System.out.println(Conta.getTotal());

	}
	
	
	
}
