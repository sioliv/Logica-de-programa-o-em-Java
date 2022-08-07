import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
		
//		String[] cardapio = new String[] {"Calabresa", "Atum", "queijo", "Prezunto"};
//		
//		System.out.println("Escolha o sabor: ");
//		//Exibindo a quantidade dos ítens linha a linha de forma dinâmica
//		for(int i = 0; i< cardapio.length; i++) {
//			System.out.println("[" +i+"]" + cardapio[i]); // as posições em um vetor são os seus índices e começam com zero
//			//Pegando as posições dinamicamente, basta colocar a variável i dentro dos []
//		}
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("Digite o numero referente ao sabor: ");
//		Integer numeroReferenteAoSabor = scanner.nextInt();
//		//Acessando a posição dos índices no cardápio
//		System.out.println("Você escolheu o sabor: " + cardapio[numeroReferenteAoSabor]);
//		
//		scanner.close();
		
//	String[] cardapio = new String[] {"Calabresa", "Atum", "queijo", "Prezunto"};
//		
//		cardapio[3] = "Frango";
//		
//		for(int i =0;i < cardapio.length; i++) {
//			System.out.println(cardapio[i]);
//			
//		}
		
		String[] cardapio = new String[4];
		cardapio[0] = "Calabresa";
		cardapio[1] = "Atum";
		cardapio[2] = "Queijo";
		cardapio[3] = "presunto";
		
		for(int i = 0;i<cardapio.length; i++) {
			System.out.println(cardapio[i]);
		}
	}

}
