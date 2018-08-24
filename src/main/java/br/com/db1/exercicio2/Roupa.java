package br.com.db1.exercicio2;

import br.com.db1.type.Tamanho;

public class Roupa {
		
		private String marca;
		private Integer anoFabricacao;
		private Tamanho tamanho;
		
		public void setTamanho(Tamanho tamanho) {
			this.tamanho = tamanho;
		}
		
		public Tamanho getTamanho() {
			return tamanho;
		}
		
		public String getMarca() {
			return marca;
		}
		
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public Integer getAnoFabricacao() {
			return anoFabricacao;
		}
		
		public void setAnoFabricacao(Integer anoFabricacao) {
			this.anoFabricacao = anoFabricacao;
		}
}
