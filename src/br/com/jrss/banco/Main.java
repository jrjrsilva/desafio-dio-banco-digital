package br.com.jrss.banco;
import br.com.jrss.banco.domain.Agencia;
import br.com.jrss.banco.domain.Cliente;
import br.com.jrss.banco.domain.Conta;
import br.com.jrss.banco.domain.ContaCorrente;
import br.com.jrss.banco.domain.ContaPoupanca;
import br.com.jrss.banco.domain.TipoCliente;

public class Main {

	public static void main(String[] args) {
		Agencia agencia = new Agencia(1,"Agencia Central");
		Agencia agencia2 = new Agencia(2,"Agencia Poupança");
		Cliente cliente = new Cliente("José","85296374296",TipoCliente.PESSOAFISICA);
		Cliente cliente2 = new Cliente("Maria","85296374000198",TipoCliente.PESSOAJURIDICA);
			
		Conta cc = new ContaCorrente(cliente,agencia);
		Conta cc1 = new ContaCorrente(cliente2,agencia);
		Conta poupanca = new ContaPoupanca(cliente,agencia2);

		cc.depositar(100);
		cc1.depositar(2000);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc1.imprimirExtrato();
			
	}

}
