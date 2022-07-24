package CursoLogicaCapitulo05;

import java.util.Scanner;

public class UtilizandoIFEncadeado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu peso ");
		
		Double pesoDoLutador = entrada.nextDouble();
		
		Boolean ehPesoLeve = pesoDoLutador <= 60;
		Boolean ehPesoMedio = (pesoDoLutador > 60 ) && (pesoDoLutador <=90);
		Boolean ehPesoPesado = pesoDoLutador > 90; 
		
		if(ehPesoLeve) {
			System.out.println("O lutador é peso leve");
		}
		
		if(ehPesoMedio) {
			System.out.println("O lutador é peso medio");
		}
		
		if(ehPesoPesado) {
			System.out.println("O lutador é peso pesado");
		}
		
		entrada.close();

	}

}
