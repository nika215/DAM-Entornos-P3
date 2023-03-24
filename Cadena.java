import java.util.Scanner;

public class Cadena {

    private static int contarOcurrencias(String nombre, char letra) {
        int contador = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una palabra");
        String nombre = teclado.nextLine();
        System.out.println("Dime una letra");
        char letra = teclado.next().charAt(0);
        int cantidad = contarOcurrencias(nombre, letra);
        System.out.println("En el nombre '" + nombre + "' la letra '" + letra + "' aparece " + cantidad + " veces.");
    }
}

