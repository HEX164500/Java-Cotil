package com.localhost.app.model.entities.ex1;

public class Comissionado extends Empregado {

	private double totalVendas;
	private double taxaComissao;
	
	public Comissionado() {
	}

	/**
	 * @param nome
	 * @param sobrenome
	 * @param CPF
	 * @param totalVendas
	 * @param taxaComissao
	 */
	public Comissionado(String nome, String sobrenome, String CPF, double totalVendas, double taxaComissao) {
		super(nome, sobrenome, CPF);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

	@Override
	public double vencimento() {
		return  totalVendas * ( 1 + ( taxaComissao / 100 ));
	}

	@Override
	public String toString() {
		return super.toString() + ", totalVendas + " + totalVendas + ", taxaComissao = " + taxaComissao;
	}
}
