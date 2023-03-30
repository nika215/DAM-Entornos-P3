package main.java.ieseuropa;

public class Numero {
	
	public static String segundosAHorasMinutos(int segundos) {
		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		segundos = segundos % 60;
		return horas + " hora(s), " + minutos + " minuto(s), " + segundos + " segundo(s)";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(segundosAHorasMinutos(3000));
	}

}
