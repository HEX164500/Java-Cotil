package com.localhost.app.test.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.localhost.app.model.entities.ex1.Assalariado;
import com.localhost.app.model.entities.ex1.Comissionado;
import com.localhost.app.model.entities.ex1.Empregado;
import com.localhost.app.model.entities.ex1.Horista;

public class TestaEmpregados {

	final List<Empregado> empregados = new ArrayList<>();
	
	public TestaEmpregados() {
		empregados.addAll(Arrays.asList(
				new Assalariado("Assalariado 1", "sobrenome 1"  , "12345", 1000),
				new Assalariado("Assalariado 2", "sobrenome 2"  , "23456", 2000),
				new Comissionado("Comissionado 1", "sobrenome 2", "34567", 5000, 20),
				new Comissionado("Comissionado 2", "sobrenome 3", "45678", 10000, 10),
				new Horista("Horista 2", "sobrenome 1"  , "56789", 500, 10),
				new Horista("Horista 2", "sobrenome 2"  , "67890", 200, 10)
				));
		
		double total = empregados.stream()
				.reduce(0.0, (soma, empregado) -> soma + empregado.vencimento(), Double::sum);
		
		System.out.println("Total a pagar de vencimentos: " + total);
	}
}