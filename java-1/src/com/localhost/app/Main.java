package com.localhost.app;

import com.localhost.app.model.entities.Funcionario;

/**
 * @author lucas
 */
public class Main{

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Lucas", "Rafael de Quadros", -9999D);
		Funcionario f2 = new Funcionario("Lucas", "Quadros", 1000D);
		
		System.out.println(f1);
		System.out.println(f2);
		
		f1.setSalarioMensal(100D);
		f1.aumentaSalarioEm(10);
		
		f2.aumentaSalarioEm(50);
		
		System.out.println(f1);
		System.out.println(f2);
	}

}
