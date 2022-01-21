package br.com.fabio;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Conta aplicacao = new ContaAplicacao(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.depositar(500);
		cc.transferir(400, aplicacao);

		poupanca.gerarRedimento();
		aplicacao.gerarRedimento();

		//********************************************************\\

		Cliente paula = new Cliente();
		paula.setNome("Paula");

		Conta ccPaula = new ContaCorrente(paula);
		Conta poupancaPaula = new ContaPoupanca(paula);
		Conta aplicacaoPaula = new ContaAplicacao(paula);


		ccPaula.depositar(300);
		ccPaula.transferir(150, poupancaPaula);
		poupanca.depositar(600);
		poupanca.transferir(500,aplicacaoPaula);

		poupancaPaula.gerarRedimento();
		aplicacaoPaula.gerarRedimento();


		//*********************************************//
		Banco banco = new Banco();
		List<Conta> contas = new ArrayList<>();
		contas.add(cc);
		contas.add(poupanca);
		contas.add(aplicacao);

		contas.add(ccPaula);
		contas.add(poupancaPaula);
		contas.add(aplicacaoPaula);

		banco.setContas(contas);

		banco.imprimirExtrato("Venilton");

	}

}
