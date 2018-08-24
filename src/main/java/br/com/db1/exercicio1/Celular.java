package br.com.db1.exercicio1;

public class Celular {
	private String operadora;
	private String marca;
	private Boolean dualChip;
	private Double tamanhoTela;
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getOperadora() {
		return operadora;
	}
	
	public Boolean getDualChip() {
		return dualChip;
	}
	
	public Double getTamanhoTela() {
		return tamanhoTela;
	}
	
	public Boolean temSinal(){
		return true;
	}
}
