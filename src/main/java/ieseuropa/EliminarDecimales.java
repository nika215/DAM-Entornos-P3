package main.java.ieseuropa;

public class EliminarDecimales {
	
	private static double eliminarDec(double num) {
		
		int numEntero = (int) num;
		
		return numEntero;
	}

	public static void main(String[] args) {
		double num = 6.5;
		System.out.println("Eliminando sus decimales es: " + eliminarDec(num));
	}

}
