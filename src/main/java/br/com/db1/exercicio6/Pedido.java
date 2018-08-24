package br.com.db1.exercicio6;

import java.util.Date;

public class Pedido {
	private Integer numero;
	private Integer numeroMesa;
	private Date dataPedido;
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public void setNumeroMesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	public Date getDataPedido() {
		return dataPedido;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public Integer getNumeroMesa() {
		return numeroMesa;
	}
	
	public void cadastrarPedido(){}
	public void fecharPedido(){}
	
}
