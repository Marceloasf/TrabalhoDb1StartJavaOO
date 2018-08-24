package br.com.db1.type;

public enum Sexo {
	MASCULINO("Masculino"), FEMININO("Feminino"), OUTRO("Outro");
	
	private String sexo;
	Sexo(String sexoParametro){
		this.sexo = sexoParametro;
	}
	
	public String getSexo() {
		return sexo;
	}
}
