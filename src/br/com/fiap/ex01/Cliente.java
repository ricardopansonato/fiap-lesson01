package br.com.fiap.ex01;

public class Cliente {
	private String numeroRG;
	private String numeroCPF;
	private String endereco;
	private String nome;

	public Cliente() {

	}

	public Cliente(String numeroRG) {
		this.numeroRG = numeroRG;
	}

	public Cliente(String numeroRG, String numeroCPF, String endereco, String nome) {
		this(numeroRG);
		this.numeroCPF = numeroCPF;
		this.endereco = endereco;
		this.nome = nome;
	}

	public String getNumeroRG() {
		return numeroRG;
	}
	public void setNumeroRG(String numeroRG) {
		this.numeroRG = numeroRG;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [numeroRG=" + numeroRG + ", numeroCPF=" + numeroCPF + ", endereco=" + endereco + ", nome="
				+ nome + "]";
	}
	
}
