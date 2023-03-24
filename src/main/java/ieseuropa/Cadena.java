package main.java.ieseuropa;

public class Cadena {

	private static String cambiarMayus(String string) {
		return string.toUpperCase();
	}

	private static int longitud(String string) {
		return string.length();
	}

	public static void main(String[] args) {
		String bicho = "Aaaaaay mi madre el Bicho";
		cambiarMayus(bicho);
		longitud(bicho);
	}

}
