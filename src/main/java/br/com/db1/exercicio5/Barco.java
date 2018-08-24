package br.com.db1.exercicio5;

public class Barco extends TransporteAquatico{
	private Boolean pesqueiro;
	
	@Override
	public void setNome(String nome) {
		super.setNome("Barco " + nome);
	}
	
	public void setPesqueio(Boolean pesqueiro) {
		this.pesqueiro = pesqueiro;
	}
	
	public Boolean getPesqueiro() {
		return pesqueiro;
	}
	
	public Boolean isPesqueiro(){
		return true;
	}
}
