package br.com.db1.exercicio4;

import br.com.db1.type.TipoTelefone;

public class Telefone {
	private Integer ddd;
	private Integer numero;
	private String formatado;
	private TipoTelefone tipoTelefone;
	
	public Integer getDdd() {
		return ddd;
	}
	public Integer getNumero() {
		return numero;
	}
	
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}
	
	public String exibirTelefoneFormatado(){
		formatado = this.ddd + ("-") + this.numero;
		return formatado;
	}

}
