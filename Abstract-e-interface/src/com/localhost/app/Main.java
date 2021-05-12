package com.localhost.app;

import com.localhost.app.test.ex1.TestaEmpregados;
import com.localhost.app.test.ex1.TestaPagamentos;

public class Main {

	public static void main(String[] args) {
		new TestaEmpregados();
		
		System.out.println("\n\n\n\n\n\n");
		
		new TestaPagamentos();
		
		System.out.println("\n\n\n\n\n\n");
		
		try {
			new TestaPagamentos(-100);
			
			/*
			 * IllegalArgument é uma RuntimeException que é uma exception que é um Throwable 
			 * poliformismo em exceções
			 */
		}catch( Throwable e ) { 
			System.out.println("Algo deu errado\n\n");
			e.printStackTrace();
		}
		
		System.out.println("Cabou");
	}
}
