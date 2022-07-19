package CursoLogicaCapitulo04;

public class OperadoresLogicos {
	public static void main(String[] args) {
		/*(E ) &&
		 * true true = true
		 * true false = false
		 * false true = false
		 * false false = false
		 *
		 *OU ||
		 *true true = true
		 *true false = true
		 *false true = true
		 *false false = false
		 *
		 **/
	
		Boolean carrinhoMaiorQueCem = false;
		
		Boolean periodoDePromocao = true;
		
		Boolean jaFezCompraNaLoja = true;
		
		Boolean pagamentoAVista = true;
		
		//Valida o primeiro lado. Depois valida o segundo lado, depois valida o terceiro lado. Se tudo é true, cai no true.
		//Se qualquer uma for false, vai dar false.
		//Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQueCem && jaFezCompraNaLoja;
		
		//Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQueCem || jaFezCompraNaLoja;
		
		//Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQueCem || jaFezCompraNaLoja);
		
		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQueCem || jaFezCompraNaLoja) && pagamentoAVista;
		
		//Boolean aplicarDesconto = carrinhoMaiorQueCem && periodoDePromocao; // Os dois lados devem ser true para
		//A expressão como um todo retorne true
		
		//Boolean aplicarDesconto = carrinhoMaiorQueCem || periodoDePromocao;
		
		if(aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		} else {
			System.out.println("Nao aplique o desconto! ");
		}
	}

}
