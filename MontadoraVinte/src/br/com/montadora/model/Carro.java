package br.com.montadora.model;

public class Carro {
	private String nomeMontadora;
	private String nomeCarro;
	
	public Carro(String nomeMontadora, String nomeCarro) {
		super();
		this.nomeMontadora = nomeMontadora;
		this.nomeCarro = nomeCarro;
	}
	public Carro() {
		super();
	}
	public String getNomeMontadora() {
		return nomeMontadora;
	}
	public void setNomeMontadora(String nomeMontadora) {
		this.nomeMontadora = nomeMontadora;
	}
	public String getNomeCarro() {
		return nomeCarro;
	}
	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}
	
	
}
