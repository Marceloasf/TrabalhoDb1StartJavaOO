package br.com.db1.type;

public enum TipoLogradouro {
	AVENIDA("Avenida"),
	RUA("Rua");
	
	private String tipoLogradouro;
	TipoLogradouro(String logradouro){
		this.tipoLogradouro = logradouro;
	}
	
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
}
