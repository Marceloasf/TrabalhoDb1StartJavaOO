package br.com.db1.exercicio6;

import br.com.db1.type.TipoLogradouro;

public class Endereco {
	private TipoLogradouro logradouro;
	private Integer cep;
	
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	
	public Integer getCep() {
		return cep;
	}
	
	public String exibirCepFormatado(){
		return cep.toString();
	}
	
	public void setLogradouro(TipoLogradouro logradouro) {
		this.logradouro = logradouro;
	}
	
	public TipoLogradouro getLogradouro() {
		return logradouro;
	}
}
