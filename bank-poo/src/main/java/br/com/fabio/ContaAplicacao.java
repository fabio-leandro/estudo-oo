package br.com.fabio;


public class ContaAplicacao extends Conta{

    private final static double TAXA_RENDIMENTO = 0.0035;

    public ContaAplicacao(Cliente cliente) {
        super(cliente);
        super.tipo = "Aplicacao Financeira";
    }

    @Override
    public void gerarRedimento() {
        super.saldo = super.saldo * (1 + TAXA_RENDIMENTO);
    }
}
