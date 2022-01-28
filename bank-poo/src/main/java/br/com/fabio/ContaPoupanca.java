package br.com.fabio;

public class ContaPoupanca extends Conta implements IRendimento{

	private final static double TAXA_RENDIMENTO = 0.0005;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		super.tipo = "Conta Poupança";
	}

	@Override
	public void gerarRedimento() {
		super.saldo = super.saldo * (1 + TAXA_RENDIMENTO);
	}
}
