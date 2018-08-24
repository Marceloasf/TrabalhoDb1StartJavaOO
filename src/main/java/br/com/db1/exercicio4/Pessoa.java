package br.com.db1.exercicio4;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.db1.type.Sexo;


public class Pessoa {
		private String nome;
		private Date dataNascimento;
		private Sexo sexo;
		private List<Telefone> telefone = new ArrayList<Telefone>();
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		
		public Date getDataNascimento() {
			return dataNascimento;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}
		
		public Sexo getSexo() {
			return sexo;
		}
		
		public void setTelefone(List<Telefone> telefone) {
			this.telefone = telefone;
		}
		
		public List<Telefone> getTelefone() {
			return telefone;
		}
		
}
