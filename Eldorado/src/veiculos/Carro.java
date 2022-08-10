package veiculos;

public class Carro extends Veiculo {
	
	 //public int litros_Cacamba;
		String modelo_esportivo;
		int potencia;
	 
	 
	




	public Carro(String andar, String parar) {
		super(andar, parar);
		
	}
	
	
	
	@Override
	   protected boolean parar() {
	        return this.parar;
	    }
		
	


}
