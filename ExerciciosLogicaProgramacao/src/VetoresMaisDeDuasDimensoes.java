
public class VetoresMaisDeDuasDimensoes {
	public static void main(String[] args) {
		Double faturamentoDoDia = 1000.0;
		
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.00, 1700.00};
		
		Double[] faturamentoFevereiro = new Double[] {1000.0, 2500.00, 1800.00};

		
		Double[][] faturamentoAnual = new Double[][] {faturamentoJaneiro, faturamentoFevereiro}; //Cada posição dentro de um vetor de duas dimensões precisa ser um vetor de uma dimensão.
	
		System.out.println("faturamento do dia 1o de Janeiro: " + faturamentoAnual[0][0]);
		System.out.println("faturamento do dia 3o de Fevereiro: " + faturamentoAnual[1][2]);
		//analogia a uma célula a planilha de excel.
		
		for(int i = 0; i < faturamentoAnual.length; i ++) {
			System.out.println("Mês: " + (i + 1));
			
			Double[] mes = faturamentoAnual[i];
			
			for(int j = 0; j < faturamentoAnual[i].length; j++) {
				Double dia = mes[j];
//				Double dia = faturamentoAnual[i][j];
				System.out.println("Dia " + (j+ 1) + ":" + dia);
			}
		}
		
		
	}

}
