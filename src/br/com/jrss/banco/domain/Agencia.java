package br.com.jrss.banco.domain;

public class Agencia {
	
	private String nome;
	private Integer numero;
	

	public Agencia() {
		
	}

	public Agencia(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Agencia [ " + numero + " :: " + nome + "]";
	}
	
	

}
