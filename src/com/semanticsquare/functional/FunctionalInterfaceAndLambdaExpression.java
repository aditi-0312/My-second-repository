package com.semanticsquare.functional;

@FunctionalInterface
interface A {
	void show();
	// int go();
	// String toString();
}

/*
 * class B implements A {
 * 
 * @Override public void show() { System.out.println("hi"); }
 * 
 * }
 */

public class FunctionalInterfaceAndLambdaExpression {
	public static void main(String[] args) {
			A obj = () -> System.out.println("hi in show");
			obj.show();
		}
}
