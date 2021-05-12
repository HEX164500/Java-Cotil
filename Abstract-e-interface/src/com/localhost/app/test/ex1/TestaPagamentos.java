package com.localhost.app.test.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.localhost.app.model.entities.ex2.CartaoCredito;
import com.localhost.app.model.entities.ex2.Cheque;
import com.localhost.app.model.entities.ex2.Dinheiro;
import com.localhost.app.model.interfaces.ex2.TipoPagamento;

public class TestaPagamentos {

	final List<TipoPagamento> pagamentos = new ArrayList<>();
	
	public TestaPagamentos(){
		pagamentos.addAll(Arrays.asList(
				new CartaoCredito(100),
				new CartaoCredito(200),
				new Dinheiro(300),
				new Dinheiro(400),
				new Cheque(500),
				new Cheque(600)
				));
		
		pagamentos.forEach( ( pagamento ) -> System.out.println(pagamento) );
	}
	
	public TestaPagamentos( double valorTeste ) throws RuntimeException {
		pagamentos.addAll(Arrays.asList(
				new CartaoCredito(valorTeste),
				new CartaoCredito(valorTeste),
				new Dinheiro(valorTeste),
				new Dinheiro(valorTeste),
				new Cheque(valorTeste),
				new Cheque(valorTeste)
				));
		
		pagamentos.forEach( ( pagamento ) -> System.out.println(pagamento) );
	}
	
	
}