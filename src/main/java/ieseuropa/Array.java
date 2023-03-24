package main.java.ieseuropa;

public class Array {

	private static int maximo(int[] array) {
		int max = 0;
		for (int num : array) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(maximo(array));
	}

}
