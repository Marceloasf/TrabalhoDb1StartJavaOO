package br.com.db1.exercicio8;

public class Agencia {
	private Integer numero;
	private Integer digitoVerificador;
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	
	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void calcularDigitoVerificador(){}
	public Boolean validarDigitoVerificador(){
		return true;
	}
}
