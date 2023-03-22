package main.java;

public class Cadena {

	public static String duplicarLetras(String nombre) {
		StringBuilder resultado = new StringBuilder();
		for (int i = 0; i < nombre.length(); i++) {
			char letra = nombre.charAt(i);
			resultado.append(letra);
			resultado.append(letra);
		}
		return resultado.toString();
	}

	public static void main(String[] args) {
		String entrada = "tres";
		String salida = duplicarLetras(entrada);
		System.out.println("Entrada: " + entrada);
		System.out.println("Salida: " + salida);
	}
}
