package app.atividades;

import app.models.Circulo;
import app.models.Quadrado;
import app.models.Retangulo;

public class AppFigurasGeometricas {

	public static void main(String ...args) {
		new AppFigurasGeometricas();
	}

	public AppFigurasGeometricas() {
		try {
			new Quadrado(-100);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		try {
			new Retangulo(-100, -2);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		try {
			new Retangulo(100, 100);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		try {
			new Circulo(-100d);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
