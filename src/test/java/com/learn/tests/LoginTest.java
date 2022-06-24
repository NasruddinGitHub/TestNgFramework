package com.learn.tests;

import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void displayMessageToConsole() {
		System.out.println("Hello World!");
		System.out.println("Made chnage in merge learn branch");
	}

	@Test
	public void sum() {
		int a, b;
		a = 100;
		b = 200;
		System.out.println(a + b);

	}
}
