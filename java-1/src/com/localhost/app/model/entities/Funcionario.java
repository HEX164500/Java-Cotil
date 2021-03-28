package com.localhost.app.model.entities;

import java.io.Serializable;

public final class Funcionario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String sobrenome;
	private Double salarioMensal;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, String sobrenome, Double salarioMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		setSalarioMensal(salarioMensal);
	}
	
	public Double getSalarioAnual () {
		return this.salarioMensal * 12;
	}
	
	public void aumentaSalarioEm( double porcentagem ) {
		setSalarioMensal( salarioMensal += salarioMensal * ( porcentagem / 100 ) );
	}

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

	public Double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(Double salarioMensal) {
		this.salarioMensal = salarioMensal > 0 ? salarioMensal : 0 ;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " " + sobrenome + ", salario: " + salarioMensal;
	}
}
