package com.localhost.app.model.entities.ex1;

public class Horista extends Empregado {

	private double precoHora;
	private double horasTrabalhadas;
	
	public Horista() {
	}

	/**
	 * @param nome
	 * @param sobrenome
	 * @param CPF
	 * @param precoHora
	 * @param horasTrabalhadas
	 */
	public Horista(String nome, String sobrenome, String CPF, double precoHora, double horasTrabalhadas) {
		super(nome, sobrenome, CPF);
		this.precoHora = precoHora;
		setHorasTrabalhadas(horasTrabalhadas);
	}
	
	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = Math.ceil(horasTrabalhadas);
	}

	@Override
	public double vencimento() {
		return precoHora * horasTrabalhadas;
	}

	@Override
	public String toString() {
		return super.toString() + ", precoHora = " + precoHora + ", horasTrabalhadas = " + horasTrabalhadas;
	}
}
