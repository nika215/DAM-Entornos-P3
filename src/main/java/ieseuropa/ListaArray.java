package main.java.ieseuropa;

import java.util.Arrays;

public class ListaArray {
	
	private static int[] ordenarArray(int[] array) {
		Arrays.sort(array);
		return array;
	}
	private static float mediana (int[] array) {
		array = ordenarArray(array);
		int size = array.length;
		float mediana = 0;
		if(size%2!=0) {
			mediana=array[(size-1)/2];
		}
		else {
			int posicion=(size/2);
			mediana=(float)(array[posicion-1]+array[posicion])/2;
		}
		return mediana;
	}
	public static void main(String[] args) {
		int[] arrayOrdenar = new int[] {3,20,15,1,9};
		arrayOrdenar = ordenarArray(arrayOrdenar); 
		for (int i = 0; i < arrayOrdenar.length; i++) {
			System.out.print(arrayOrdenar[i]+" ");
		}
		System.out.println();
		
		System.out.println("Mediana: "+ mediana(arrayOrdenar));
	}

}
