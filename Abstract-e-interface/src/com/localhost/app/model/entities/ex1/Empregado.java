package com.localhost.app.model.entities.ex1;

public abstract class Empregado {

	private String nome;
	private String sobrenome;
	private String CPF;
	
	public Empregado() {
		
	}

	/**
	 * 
	 * @param nome
	 * @param sobrenome
	 * @param CPF
	 */
	public Empregado(String nome, String sobrenome, String CPF) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.CPF = CPF;
	}
	
	public abstract double vencimento ();

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() 
				+ " - nome = " + nome + ", sobrenome = " + sobrenome + ", CPF = " + CPF;
	}
}
