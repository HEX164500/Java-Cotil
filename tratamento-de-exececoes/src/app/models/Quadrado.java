package app.models;

import app.interfaces.AreaCalculavel;

public class Quadrado implements AreaCalculavel {

	private Double lado;

	public Quadrado(double lado) throws IllegalArgumentException {
		if (lado < 0)
			throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero).");

		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}

}
