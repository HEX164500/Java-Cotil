package com.localhost.app.model.entities.ex2;

import com.localhost.app.model.interfaces.ex2.TipoPagamento;

public class Cheque implements TipoPagamento {

	private double valor;
	
	public Cheque() {
	}
	
	/**
	 * @param valor
	 */
	public Cheque(double valor) {
		setValor(valor);
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if ( valor < 0 )
			throw new IllegalArgumentException("Valor deve ser maior que zero");
		this.valor = valor;
	}

	@Override
	public int getDiasFaturamento() {
		return 3;
	}

	@Override
	public double getPorcentagemFinanceiraPaga() {
		return 3;
	}

	@Override
	public String toString() {
		return "Cheque [valor=" + valor + "]";
	}

}
