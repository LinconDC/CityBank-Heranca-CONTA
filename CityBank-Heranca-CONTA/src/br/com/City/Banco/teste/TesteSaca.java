package br.com.City.Banco.teste;

import br.com.City.Banco.modelo.Conta;
import br.com.City.Banco.modelo.ContaCorrente;
import br.com.City.Banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200.0);
		try {
			conta.saca(210.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("ex " + ex.getLocalizedMessage());
		}
		System.out.println(conta.getSaldo());
	}

}
