package CursoLogicaCapitulo04;

public class OperadoresIncrementoDecremento {

	public static void main(String[] args) {
		Integer numero = 10;
		
		++numero;
		System.out.println("Numero depois:" + numero);
		
		numero--;
		System.out.println("Numero antes do depois:" + numero);
		
		//Integer numero02 = ++numero;
		Integer numero02 = numero++;
		
		System.out.println("Numero: " + numero + "," + "numero02 " + numero02);

	}

}
