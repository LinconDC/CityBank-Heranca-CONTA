package br.com.City.Banco.util;

import java.util.ArrayList;

import br.com.City.Banco.modelo.Cliente;
import br.com.City.Banco.modelo.Conta;
import br.com.City.Banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

//		Conta cc1 = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(22, 22);
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		
		
		// Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		Cliente cliente = new Cliente();
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);
		
		
		System.out.println("Ja existe? " + existe);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}







