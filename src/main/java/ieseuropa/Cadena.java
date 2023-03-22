package main.java.ieseuropa;

public class Cadena {

	public static String borrarApariencias(String cadena1, String cadena2) {
		return cadena1.replaceAll(cadena2, "");
	}

	public static void main(String[] args) {
		String String1 = "La casa grande";
		String String2 = "casa";

		String resultado = borrarApariencias(String1, String2);
		System.out.println(resultado);
	}
}
