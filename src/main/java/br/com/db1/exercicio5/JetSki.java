package br.com.db1.exercicio5;

public class JetSki extends TransporteAquatico {
	private String motor;
	
	@Override
	public void setNome(String nome) {
		super.setNome("Jetski "+nome);
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public String getMotor() {
		return motor;
	}
}
