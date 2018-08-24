package br.com.db1.exercicio7;

public class Olimpiada {
	private Integer ano;
	private Atleta atleta;
	private Voluntario voluntario;
	private Juiz juiz;
	private Modalidade modalidade;
	private Sede sede;
	
	public Olimpiada(Atleta atleta, Voluntario voluntario, Juiz juiz, Modalidade modalidade, Sede sede){
		this.atleta = atleta;
		this.juiz = juiz;
		this.voluntario = voluntario;
		this.modalidade = modalidade;
		this.sede = sede;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public Atleta getAtleta() {
		return atleta;
	}
	
	public Juiz getJuiz() {
		return juiz;
	}
	
	public Modalidade getModalidade() {
		return modalidade;
	}
	
	public Sede getSede() {
		return sede;
	}
	
	public Voluntario getVoluntario() {
		return voluntario;
	}
	
}
