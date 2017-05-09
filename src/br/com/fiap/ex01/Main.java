package br.com.fiap.ex01;

public class Main {
	public static void main(String[] args) {
		Cliente c = new Cliente();
		System.out.println(c);
		
		Cliente c1 = new Cliente("123456789");
		System.out.println(c1);
		
		Cliente c2 = new Cliente("13456789", "234567890-", "Teste", "fghjklç");
		System.out.println(c2);
	}
}