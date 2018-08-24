package br.com.db1.exercicio8;

import java.util.Date;

public class Banco {
	private String nome;
	private Date dataFundacao;
	private String publico;
	
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPublico(String publico) {
		this.publico = publico;
	}
	
	public Date getDataFundacao() {
		return dataFundacao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getPublico() {
		return publico;
	}
	
	public Boolean isPublico(){
		return true;
	}
}
