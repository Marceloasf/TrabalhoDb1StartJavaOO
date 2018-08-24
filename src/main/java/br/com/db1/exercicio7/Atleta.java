package br.com.db1.exercicio7;

import br.com.db1.exercicio4.Pessoa;

public class Atleta extends Pessoa{
	@Override
	public void setNome(String nome) {
		super.setNome("Atleta " + nome);
	}
}
