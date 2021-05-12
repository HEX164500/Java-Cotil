package com.localhost.app.model.entities.ex2;

import com.localhost.app.model.interfaces.ex2.TipoPagamento;

public class Dinheiro implements TipoPagamento {

	private double valor;
	
	public Dinheiro() {
	}
	
	/**
	 * @param valor
	 */
	public Dinheiro(double valor) {
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
		return 0;
	}

	@Override
	public double getPorcentagemFinanceiraPaga() {
		return 0;
	}

	@Override
	public String toString() {
		return "Dinheiro [valor=" + valor + "]";
	}
	
}
