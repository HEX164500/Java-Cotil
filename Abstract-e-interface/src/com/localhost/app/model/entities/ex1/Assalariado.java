package com.localhost.app.model.entities.ex1;

public class Assalariado extends Empregado {

	private double salario;
	
	public Assalariado() {
	}

	/**
	 * @param nome
	 * @param sobrenome
	 * @param CPF
	 * @param salario
	 */
	public Assalariado(String nome, String sobrenome, String CPF, double salario) {
		super(nome, sobrenome, CPF);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double vencimento() {
		return salario;
	}

	@Override
	public String toString() {
		return super.toString() + ", salario = " + salario;
	}
}
