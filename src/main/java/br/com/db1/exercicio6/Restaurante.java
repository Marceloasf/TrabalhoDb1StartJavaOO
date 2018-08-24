package br.com.db1.exercicio6;

import java.util.ArrayList;
import java.util.List;

import br.com.db1.exercicio4.Telefone;

public class Restaurante {
	private String nome;
	private Boolean serveAlmoco;
	private Boolean serveJantar;
	private Boolean serveCafeDaManha;
	private List<Telefone> telefoneRestaurante = new ArrayList<Telefone>();
	private List<Pedido> pedido = new ArrayList<Pedido>();
	private Endereco endereco;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Boolean almoco(){
		return this.serveAlmoco = true;
	}
	public Boolean janta(){
		return this.serveJantar = true;
	}
	public Boolean cafeDaManha(){
		return this.serveCafeDaManha = true;
	}
	
	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}
	
	public Boolean getServeCafeDaManha() {
		return serveCafeDaManha;
	}
	
	public Boolean getServeJantar() {
		return serveJantar;
	}
	
	public void setTelefoneRestaurante(List<Telefone> telefoneRestaurante) {
		this.telefoneRestaurante = telefoneRestaurante;
	}
	
	public List<Telefone> getTelefoneRestaurante() {
		return telefoneRestaurante;
	}
	
	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
	
	public List<Pedido> getPedido() {
		return pedido;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
}
