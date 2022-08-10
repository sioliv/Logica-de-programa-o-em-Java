
public class TestaContaSemClliente {
	//aula 03 = aula. entendendo a sujeirinha da classe string,  aquele zero

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		//nota que ele roda, compila e aparece o zero como resultado, diferente como as variáveis locais
		
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
	
		//note que apareceu o null antes de dar o erro. 
		
		contaDaMarcela.titular.nome ="Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		//note que nao cosnegsuiu pegar o nome deste titualr, pois a referencia do titular, nao tem flecha para lugar algum.
		
		//logo preciso criar um cliente novo e fazer a atribuição
		//contaDaMarcela.titular = new Cliente();
		// null significa dizer que aquela referência nunca foi populada, ou seja, qual a classe não instancia internamente aquela propriedade, ela será null
		//para popular, eu simplesmente coloco um valor dentro dela.
		//normalmente através de um new ou 
		//pegando uma referência de um valor, como fizemos no código do paulo.
		//coloquei um cliente que era o paulo e coloquei 'dentro 'do titular
		//através de flechas de referência.
		
		contaDaMarcela.cpf = "111.111.111-11";
		System.out.println(contaDaMarcela.cpf);
		
		
		


//Aprendemos neste capítulo:

    //Realizar o relacionamento entre classes através de composição;
    //Vantagens de se isolar informações repetidas em outra classe;
    //Detalhes da composição;
   // NullPointerException para atributos não inicializados e seus cuidados.



	}

}
