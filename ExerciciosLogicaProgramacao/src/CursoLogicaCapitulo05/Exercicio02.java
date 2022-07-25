package CursoLogicaCapitulo05;

import java.util.Scanner;

public class Exercicio02 {
	
	//
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a meta do faturamento anual da empresa");
		Double metaDoFaturamentoAnual = scanner.nextDouble();
		
		System.out.println("Digite o faturamento real da empresa no ultimo ano");
		Double faturamentoRealDaEmpresa = scanner.nextDouble();
		
		System.out.println("Digite a média salarial do funcionario(a) ");
		Double mediaSalarialDoFuncionario = scanner.nextDouble();
		
		Double oitentaPorCentoDoValorDaMeta = (metaDoFaturamentoAnual * 8.0) / 10;
		
		Boolean faturamentoParaBonus = faturamentoRealDaEmpresa >= metaDoFaturamentoAnual;
		
		Boolean faturamentoMenorQueAmeta =  (faturamentoRealDaEmpresa >= oitentaPorCentoDoValorDaMeta);
		
		
		Double bonus = 0.0;
		Double bonusFaturamentoMenorQueMeta = 0.0;
		
		if(faturamentoParaBonus) {
			bonus = bonus + mediaSalarialDoFuncionario;
			
			System.out.println("Você ganhou bonus integral!" + bonus);
			
		} else if (faturamentoMenorQueAmeta ) {
			bonusFaturamentoMenorQueMeta = (mediaSalarialDoFuncionario * 80) / 100;
			
			System.out.println(bonusFaturamentoMenorQueMeta);
		} else {
			System.out.println("Infelizmente, esse ano não tem bônus!");
		}
		
		scanner.close();
	}

	
}
