package br.com.City.Banco.teste;

import br.com.City.Banco.modelo.Cliente;
import br.com.City.Banco.modelo.ContaCorrente;

public class TesteObject {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);

		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaCorrente(33, 22);
		Object cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());

//		println(cliente);

	}

	static void printl() {

	}

	static void println(int a) {

	}

	static void println(boolean valor) {

	}

	static void println(Object conta) {
	}
}
