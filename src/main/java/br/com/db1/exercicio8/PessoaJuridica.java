package br.com.db1.exercicio8;

import br.com.db1.exercicio4.Pessoa;
import br.com.db1.exercicio6.Endereco;

public class PessoaJuridica extends Pessoa{
	private Integer cnpj;
	private String formatado;
	private Endereco endereco;
	
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public Integer getCnpj() {
		return cnpj;
	}
	
	public Boolean validaCnpj(){
		return true;
	}
	
	public String formataCnpj(){
		return formatado;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
}
