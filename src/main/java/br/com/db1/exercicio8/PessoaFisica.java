package br.com.db1.exercicio8;

import br.com.db1.exercicio4.Pessoa;
import br.com.db1.exercicio6.Endereco;

public class PessoaFisica extends Pessoa{
	private Integer cpf;
	private String formatado;
	private Endereco endereco;
	
	public void setCnpj(Integer cnpj) {
		this.cpf = cnpj;
	}
	public Integer getCnpj() {
		return cpf;
	}
	
	public Boolean validaCpf(){
		return true;
	}
	
	public String formataCpf(){
		return formatado;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
}
