package br.ifsp.model;

public class Problema {
	private int id;
	private String tipo;
	private String descricao;
	private String data;
	private String nome;
	
	public Problema(int id, String tipo, String descricao, String data,String nome) {
		this.id = id;
		this.tipo = tipo;
		this.descricao = descricao;
		this.data = data;
		this.nome = nome;
	}
	
	public Problema() {
		
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
