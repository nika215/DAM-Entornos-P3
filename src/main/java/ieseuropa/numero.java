package main.java.ieseuropa;

import java.util.ArrayList;

public class numero {
	public static boolean numArmstrong(int numero) {
		int suma = 0;
		int numeroOriginal = numero;
		int numDigitos = String.valueOf(numero).length();
		while (numero != 0) {
			int digito = numero % 10;
			suma += Math.pow(digito, numDigitos);
			numero /= 10;
		}
		if (suma == numeroOriginal) {
			return true;
		} else {
			return false;
		}
	}

	private static int factorial(int num) {
		int factorial = 1;
		for (int i = num - 1; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}

	private static boolean numSuerte(int num) {
		if (num > 0) {
			ArrayList<Integer> numeros = new ArrayList<>();
			for (int i = 1; i <= num; i++) {
				numeros.add(i);
			}
			for (int i = 1; i < numeros.size(); i += 2) {
				numeros.remove(i);
			}
			for (int i = 2; i < numeros.size(); i += 3) {
				numeros.remove(i);
			}
			for (int i = 6; i < numeros.size(); i += 7) {
				numeros.remove(i);
			}
			return numeros.contains(num);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(numSuerte(99));
		System.out.println(numArmstrong(142));
		System.out.println(factorial(7));
	}

}
