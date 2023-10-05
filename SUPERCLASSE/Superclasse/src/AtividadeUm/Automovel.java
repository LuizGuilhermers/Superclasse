package AtividadeUm;

public class Automovel {
	
	private int numeroPortas;
	private String motor;
	
	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public Automovel(int numeroPortas, String motor) {
		super();
		this.numeroPortas = numeroPortas;
		this.motor = motor;
	}
	

}
