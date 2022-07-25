package CursoLogicaCapitulo05;

import java.util.Scanner;

public class UtilizandoIFEncadeado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu peso ");
		
		Double pesoDoLutador = entrada.nextDouble();
		
		Boolean ehPesoLeve = (pesoDoLutador <= 60) && (pesoDoLutador > 0);
		Boolean ehPesoMedio = (pesoDoLutador > 60 ) && (pesoDoLutador <=90);
		Boolean ehPesoPesado = pesoDoLutador > 90; 
		
		if(ehPesoLeve) {
			System.out.println("O lutador é peso leve");
		} else if (ehPesoMedio) {
			System.out.println("O lutador é peso médio");
		} else if (ehPesoPesado) {
			System.out.println("O lutador é peso pesado");
		}	else {
			System.out.println("O lutador não se encaixa em nenhuma categoria");
		}
	
		
		entrada.close();

	}

}
