package main.java.ieseuropa;

import java.util.Scanner;

public class CalcularCoeficientes {
	

	public static void calcularSoluciones(double a, double b, double c) {
	    double discriminante = b * b - 4 * a * c;
	    double x1, x2;
	    
	    if (discriminante > 0) {
	        x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
	        x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
	        System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
	    } else if (discriminante == 0) {
	        x1 = -b / (2 * a);
	        System.out.println("La solución doble es x1 = x2 = " + x1);
	    } else {
	        System.out.println("No hay solución real.");
	    }
	}
	
	public static void main(String[] args) {
		calcularSoluciones(1, -2 , 1);
	}
}
