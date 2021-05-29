package app.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.models.Aluno;
import app.models.Escola;

public class TestEscola {

	@Test
	public void test() {
		Escola escola = new Escola();

		for (int aux = 1; aux <= 200; aux++)
			escola.addMatricula(new Aluno(aux, "Aluno: " + aux, aux));

		// desnecessário
		// escola.analisa();

		assertEquals(1, escola.getMaisNovo());
		assertEquals(200, escola.getMaisVelho());
	}
}
