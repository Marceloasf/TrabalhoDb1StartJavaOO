package br.com.db1.type;

public enum TipoTelefone {
	COMERCIAL("Comercial"),
	RESIDENCIAL("Residencial"),
	REFERENCIA("Referência"),
	CELULAR("Celular");
	
	private String tipoTelefone;
	TipoTelefone(String tipoTel){
		this.tipoTelefone = tipoTel;
	}
	
	public String getTipoTelefone() {
		return tipoTelefone;
	}
}
