package main.java.ieseuropa;

public class CalcularMedia {

	public static void main(String[] args) {
		
		int[] numeros = {2,8,28,35,17,80,23,99,12,23};
		
		int mayor = 0;
		int suma = 0;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] > mayor) {
				mayor = numeros[i];
			}
			suma += numeros[i];
		}
		System.out.println("La media es " + suma/numeros.length);
	}
}