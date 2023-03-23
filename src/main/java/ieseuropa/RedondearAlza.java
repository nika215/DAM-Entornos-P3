package main.java.ieseuropa;

import java.util.Scanner;

public class RedondearAlza {
	
	private static double numAlza(double num) {
		double redondeado = Math.ceil(num);
		return redondeado;
	}
	
	public static void main(String[] args) {
		
		double num =6.5;
		System.out.println("El numero redondeado es: " + numAlza(num));
		
	}

}
