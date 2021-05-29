package app.models;

import app.interfaces.AreaCalculavel;

public class Circulo implements AreaCalculavel {

	private Double raio;

	public Circulo(Double raio) {
		if (raio < 0)
			throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero).");
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

}
