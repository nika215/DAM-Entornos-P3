package main.java.ieseuropa;

public class Numero {
	
	public static boolean esPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(esPrimo(7));
	}
}
