package app.testes;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import app.interfaces.Autenticar;
import app.models.Livro;
import app.models.Produto;
import app.models.Revista;
import app.models.RevistaDigital;

public class TestaProdutos {


	private final List<Produto> produtos = new ArrayList<>(Arrays.asList(
			new Revista("Revista 1", "0001"),
			new Revista("Revista 1", "0002"),
			new Livro("Livro 1", 1),
			new Livro("Livro 2", 2),
			new RevistaDigital("Revista 1", "0001", "0001"),
			new RevistaDigital("Revista 2", "0002", "0002")
			));
	/**
	 * Estranhei ter a interface mais não pedir nada sobre, notei que faltava o item a, então fiz isso por precaução
	 */
	@Test
	public void autenticar() {
		Autenticar item = new RevistaDigital("", "", "");
		
		assertEquals(true, item.autentica("assinante"));
	}

	@Test
	public void mostraDados() {
		produtos.forEach(System.out::println);
	}

	@Test
	public void mostraRevistas() {

		System.out.println("Exibindo apenas revistas digitais....");

		produtos.stream().filter(item -> item instanceof RevistaDigital).forEach(System.out::println);
	}

	@Test(expected = NullPointerException.class)
	public void testaDescricaoNull() {
		new Livro(null, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testaISBNNegativo() {
		new Livro("", -1);
	}

	@Test(expected = NullPointerException.class)
	public void testaISSNNull() {
		new Revista("", null);
	}
}
