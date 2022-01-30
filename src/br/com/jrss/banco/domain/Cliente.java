package br.com.jrss.banco.domain;

public class Cliente {

	private String nome;
	private String cpfOuCnpj;
	private String tipoCliente;
	
		

	public Cliente() {
	}

	public Cliente(String nome, String cpfOuCnpj, TipoCliente tipoCliente) {
		super();
		this.nome = nome;
		this.cpfOuCnpj = cpfOuCnpj;
		this.tipoCliente = tipoCliente.getDescricao();
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente.getDescricao();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
