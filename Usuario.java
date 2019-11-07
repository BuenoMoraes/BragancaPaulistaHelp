package br.ifsp.model;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private String login;
	private int senha;	
	private List<Problema> problemas;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String login, int senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public void addProblemas(Problema problema) {
		problemas.add(problema);
	}
	
	public void setProblemas(List<Problema> problemas) {
		this.problemas = problemas;
	}
	
	public List<Problema> getProblemas() {
		if(problemas == null){
			problemas  = new ArrayList<>();
		}
		return problemas;
	}
	
}
