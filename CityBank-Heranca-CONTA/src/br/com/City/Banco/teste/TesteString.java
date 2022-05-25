package br.com.City.Banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String vazio = " Alura ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		
		String name = "Alura"; // Object literal
//		String outro = new String("Alura";)
		
		System.out.println(name.length());
		for(int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
//		String sub = name.substring(1);
//		System.out.println(sub);
		
//		int pos = name.indexOf("ur");
//		System.out.println(pos);

//		char c = name.charAt(2);
//
//		System.out.println(c);
//		char c = 'A';
//		char d = 'a';
//
//		String outra = name.replace(c, d);

//		String outra = name.toUpperCase();
//
//		System.out.println(name);
//		System.out.println(outra);

	}

}
