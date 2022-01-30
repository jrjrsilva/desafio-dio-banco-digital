package br.com.jrss.banco.domain;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente,Agencia agencia) {
		super(cliente, agencia);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	
	
}
