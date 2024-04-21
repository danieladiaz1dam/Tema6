package ejercicio1;

import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		Socio[] socios = new Socio[3];

		socios[0] = new Socio(3, "Eileen", 24);
		socios[1] = new Socio(1, "Alonso", 19);
		socios[2] = new Socio(2, "Maria", 19);

		Arrays.sort(socios);
		System.out.println(Arrays.toString(socios));
	}
}
