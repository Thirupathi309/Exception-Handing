package com.user.defined.Exceptions;

public class Calculator {
	public void add(int a, int b) {
		System.out.println("Sum from 1st Method:" + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("Sum of the 2st Method:" + (a + b + c));
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10, 20);
		c.add(10, 20, 30);
	}

}