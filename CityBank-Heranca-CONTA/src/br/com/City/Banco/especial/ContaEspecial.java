package br.com.City.Banco.especial;

import br.com.City.Banco.modelo.Conta;

public class ContaEspecial extends Conta {

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
