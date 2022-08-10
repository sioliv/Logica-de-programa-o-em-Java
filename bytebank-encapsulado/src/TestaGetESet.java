
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo; agora nao compila porque o titular é privado
		
		conta.setTitular(paulo);
		
		//invoca metodos:
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		
		System.out.println("O nome do titular da conta é " +conta.getTitular().getNome() + " A sua profissão é  " +conta.getTitular().getProfissao());

	}

}
