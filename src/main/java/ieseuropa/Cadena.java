package main.java.ieseuropa;

public class Cadena {

	private static String cambiarMayus(String string) {
		return string.toUpperCase();
	}

	private static String repetir(String string1,String string2, int veces) {
		String resultado = "";
		for (int i = 0; i < veces; i++) {
			resultado += string1 + " " + string2 + " ";
			
		}
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println(repetir("coche", "casa", 2));
	}

}
