package main.java.ieseuropa;

import java.util.Arrays;

public class ListaArray {
	
	private static int[] ordenarArray(int[] array) {
		Arrays.sort(array);
		return array;
	}
	
	public static void main(String[] args) {
		int[] arrayOrdenar = new int[] {3,20,15,1,9};
		arrayOrdenar = ordenarArray(arrayOrdenar); 
		for (int i = 0; i < arrayOrdenar.length; i++) {
			System.out.print(arrayOrdenar[i]+" ");
		}
		System.out.println();
	}

}
