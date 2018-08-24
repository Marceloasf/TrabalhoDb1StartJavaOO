package br.com.db1.exercicio5;

public class Canoa extends TransporteAquatico {
	private String modalidade;
	
	@Override
	public void setNome(String nome) {
		super.setNome("Canoa " + nome);
	}
	
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public String getModalidade() {
		return modalidade;
	}
}
