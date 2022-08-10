package veiculos;

public abstract class Veiculo {
	protected String placa;
	protected String cor;
	protected boolean andar;
	protected boolean parar;
	private double velocidade;
	
	public Veiculo(String cor2, String placa2) {
		
	}

	

	public String getCor() {
		return cor;
		
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public boolean getAndar() {
		return andar;
	}


	public void setAndar(boolean andar) {
		this.andar = andar;
	}


	public boolean getParar() {
		return parar;
	}


	public void setParar(boolean parar) {
		this.parar = parar;
	}
	
	public double getVelocidade() {
		return velocidade;
	}



	protected boolean parar() {
		
		return true;
	}



	


	
	
	
	
}
