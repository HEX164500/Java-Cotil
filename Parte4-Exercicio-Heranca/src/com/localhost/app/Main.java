package com.localhost.app;

import com.localhost.app.test.TestEmployees;

/**
 * Application entry point class
 * @author lucas
 * @version 1.0
 */
public class Main{
	public static void main(String[] args) {
		new Thread( new TestEmployees() ).run();
	}
}
