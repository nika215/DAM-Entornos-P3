package main.java.ieseuropa;

public class CalcularMedia {

	private static int calcularMedia(int [] numeros) {
		int suma = 0;
		for(int i=0;i<numeros.length;i++) {
			suma += numeros[i];
			
		}return suma/numeros.length;
	}
	
	public static void main(String[] args) {
		int[] numeros = {228,9, 26, 16, 87,65,47,3,56,108};
		

		System.out.println("La media es: " + calcularMedia(numeros));
	}
}
