package br.com.db1.exercicio8;

import java.util.ArrayList;
import java.util.List;

import br.com.db1.exercicio4.Pessoa;

public class Conta {
	private Pessoa pessoa;
	private Agencia agencia;
	private List<Banco> listaBanco = new ArrayList<Banco>();
	
	public Conta(Pessoa pessoa, Agencia agencia){
		this.pessoa = pessoa;
		this.agencia = agencia;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setListaBanco(List<Banco> listaBanco) {
		this.listaBanco = listaBanco;
	}
	
	public List<Banco> getListaBanco() {
		return listaBanco;
	}
}
