package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		//aula 11
		//Sobre referÊncias, quando voce o objeto conta, ou seja, instancia uma conta, atraves do new conta()
		//damos um "nome" a essa conta, de forma a referencia=las.
		//note que a variavel primeira conta é um nome com o intuito de criarmos uma referencia a esse objeto conta, que foi instanciado, ou seja, criado
		//Assim podemos atribuir valores aos atributos (ficou redundante rs) através dessa variável.
		//Teremos a mesma forma se quiséssemos instanciar uma nova contae atribuir valores a ela também
		// Conta segundaConta = new Conta(); 
        //segundaConta.saldo = 300;
		//E para pegarmos esse valores, chamamos a referência através da variável acrescentado de ponto e o atributo que queremos pegar.
		//Note através da saída do print.
		
		//System.out.println(primeiraConta.saldo);
		//System.out.println(segundaConta.saldo);
		//Existe uma maneira melhor e mais segura seria encapsular esses atributos, mas foi só um spoilerpara o que virá!

		//Agora quando queremos saber qual o endereço em que esse objeto está na jvmbasta colocarmos

		//System.out.println(primeiraConta);
		//System.out.println(segundaConta);

		//Verá que ele vai trazer não os valores dos atributos, mas os nomes dessa referência onde estão guardados os valores dos atributos, como Conta@algumaCoisa.
		
		
		Conta primeiraConta = new Conta(); //crio a  flecha , referencia da primeira conta que é  um objeto do tipo contA
		//o new conta, diz que criei um objeto do tipo conta
		primeiraConta.saldo = 300;
		
		//ctrl + espaço : corrige
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
		

		
		//copia o numero que está no endereco de memória para ca, ou seja, copia o número da primeira conta para a segunda conta, como fosse uma otra flecha para 
		//copia e cola o que ta na direita para a esquerda. copia o numero interno para a segunda conta, como 
		//fosse uma nova flecha para o novo objeto
		//para que serve isso?
		//será referenciado para o mesmo endereço, ou seja, para o mesmo lugar
		
		Conta segundaConta = primeiraConta;
		//Se eu fizer o print para mostrar o saldo da segunda conta
		System.out.println("saldo da segunda conta:" +segundaConta.saldo);
		//note que será impresso o saldo da primeira conta, pois cria-se duas
		//flechas para o mesmo objeto.
		//nao temos duas contas criadas, pois quando voce da o new, ou seja, instancia
		//o objeto, vc so fez isso em uma. e nao na segunda conta
		//estou brincando com referências.
		
		
		segundaConta.saldo += 100;
		//comentario : idade +- 5; é a mesma coisa que idade = idade + 5;
		
		System.out.println("saldo da segunda conta:" +segundaConta.saldo);
		
		System.out.println("saldo da primeira conta:" +primeiraConta.saldo);
		
		//saira 400 pois as duas referencias sao para o mesmo objeto.
		//pois so tenho uma conta, que foi criada com o new Conta
		//as duas variaveis não sao contas. a variavel em java é uma flecha.
		//são as variáveis de referencia ao objeto, funcionam como ponteiros
		
		
		//vamos fazer um if para ver se a primeira conta é diferente da segunda conta
		
		//boolean
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesmissima conta");
			} else {
				System.out.println("As contas são diferentes");
			}
		
		System.out.println(primeiraConta);
		
		System.out.println(segundaConta);
			}
	
	
			
			
		}
	
	
	
	


