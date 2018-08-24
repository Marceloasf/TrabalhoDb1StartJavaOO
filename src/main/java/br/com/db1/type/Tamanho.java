package br.com.db1.type;

public enum Tamanho {
	P("Pequeno"), M("Médio"), G("Grande");
	
	private String tamanho;
	Tamanho(String tamanhoP){
		this.tamanho = tamanhoP;
	}
	
	public String getTamanho() {
		return tamanho;
	}
}
