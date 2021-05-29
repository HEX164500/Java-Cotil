package app.models;

import app.interfaces.AreaCalculavel;

public class Retangulo implements AreaCalculavel {

	private Double base, altura;

	public Retangulo(double base, double altura) throws IllegalArgumentException {
		if (base == altura)
			throw new IllegalArgumentException(
					"Valor inválido,modifique um dos valores a fim de torná-los diferentes.");

		if (base < 0 || altura < 0)
			throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero).");

		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}
}
