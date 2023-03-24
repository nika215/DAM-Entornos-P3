package main.java.ieseuropa;

public class Array {

	public static int calcularMinimo(int[] array) {
		int minimo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}

	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 1, 7 };
		int minimo = Array.calcularMinimo(array);
		System.out.println("El valor mínimo del array es: " + minimo);
	}
}