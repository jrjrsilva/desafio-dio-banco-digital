package br.com.jrss.banco.domain;

import br.com.jrss.banco.interfaces.IConta;

public abstract class Conta implements IConta {
		
	private static int SEQUENCIAL = 1;

	protected Agencia agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente, Agencia agencia) {
		this.agencia = agencia;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			saldo -= valor;
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if(this.saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		
	}



	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()+" -- "+ this.cliente.getTipoCliente()));
		System.out.println(String.format("Agencia: %s", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
