package main.java.ieseuropa;

public class Cadena {

	private static String cambiarMayus(String string) {
		return string.toUpperCase();
	}
	
	public static String convertirMinusculas(String nombre) {
		return nombre.toLowerCase();
	}
	
	public static void main(String[] args) {
		  String texto1 = "Hola Mundo!";
	        String texto2 = "ESTOY HARTO DE PRACTICAS!!!"; 
	        
	        String resultado1 = cambiarMayus(texto1);
	        System.out.println(resultado1); 
	      
	        String resultado2 = convertirMinusculas(texto2);
	        System.out.println(resultado2); 

	}
}
