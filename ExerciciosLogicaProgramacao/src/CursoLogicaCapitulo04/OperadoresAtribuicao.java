package CursoLogicaCapitulo04;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		Double numero = 10.0;
		
		numero = numero + 4;
		System.out.println("O numero + 4: " +	numero);
		
		numero += 4;
		System.out.println("numero += 4: " + numero);
		
		numero -= 4;
		System.out.println("numero -= 4: " + numero);
		
		numero *=4;
		System.out.println("numero *= 4: " + numero);
		
		numero /= 4;
		System.out.println("numero /= 4: " + numero);
		
		numero %= 4;
		System.out.println("numero %= " + numero);
	}

}
