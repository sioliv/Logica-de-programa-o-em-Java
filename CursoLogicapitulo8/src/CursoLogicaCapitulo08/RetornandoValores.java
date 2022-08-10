package CursoLogicaCapitulo08;

public class RetornandoValores {

	public static void main(String[] args) {
		//Integer numeroQualquer = numeroAleatorio(); // invocando o método. Atribuo o método na variávl numeroQualquer
		Double[] premissa = new Double[] {50.0, 100.0};
		Double proporcao = 20.0;
		
		Double resultadoFinal = regraDeTres(premissa, proporcao);
		
		System.out.println();
		

	}
	
//	static Integer numeroAleatorio() {
//		Integer numero = 1;
//		
//		return numero;
//	}
	
	static Double regraDeTres(Double[] premissa, Double proporcao) {
		Double resultado = (premissa[0] * proporcao) / premissa [1];
		return resultado;
	}
	

}
