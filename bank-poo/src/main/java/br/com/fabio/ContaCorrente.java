package br.com.fabio;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		super.tipo = "Conta-Corrente";
	}


}
