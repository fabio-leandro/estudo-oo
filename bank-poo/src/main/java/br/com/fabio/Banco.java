package br.com.fabio;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class Banco {

	private String nome;

	private List<Conta> contas;

	public void imprimirExtrato(String titular) {

		this.contas.stream().filter(c -> c.getCliente().getNome().equalsIgnoreCase(titular))
				.collect(Collectors.toList())
				.forEach(c ->{
			System.out.print(String.format("| Tipo: %-25s |", c.getTipo()));
			System.out.print(String.format(" Titular: %-20s |", c.getCliente().getNome()));
			System.out.print(String.format(" Agencia: %-5d |", c.getAgencia()));
			System.out.print(String.format(" Numero: %-5d |", c.getNumero()));
			System.out.print(String.format(" Saldo: %.2f|%n", c.getSaldo()));
		});
	}
}
