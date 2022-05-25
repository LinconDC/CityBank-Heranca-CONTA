package br.com.City.Banco.modelo;
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	@Override
	public String toString() {
		return "conta poupanca, " + super.toString();
	}
}
