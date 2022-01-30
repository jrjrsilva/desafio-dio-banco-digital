package br.com.jrss.banco.domain;

public enum TipoCliente {
	PESSOAFISICA("Pessoa F�sica"), PESSOAJURIDICA("Pessoa Jur�dica");

	private String descricao;
	
	TipoCliente(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
}
