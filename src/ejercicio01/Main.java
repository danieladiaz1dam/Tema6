package ejercicio01;

public class Main {

	public static void main(String[] args) {
		// HORA
		Hora h = new Hora(14, 45);

		System.out.println(h);

		if (h.setHora(15))
			System.out.println("Done");
		else
			System.out.println("No se pudo");

		if (h.setMinuto(59))
			System.out.println("Done");
		else
			System.out.println("No se pudo");

		if (h.setMinuto(500))
			System.out.println("Done");
		else
			System.out.println("No se pudo");

		h.inc();

		System.out.println(h);

		// HORA EXACTA

		HoraExacta he = new HoraExacta(3, 23, 59);

		System.out.println(he);
		if (he.setHora(15))
			System.out.println("Done");
		else
			System.out.println("No se pudo");

		if (he.setMinuto(59))
			System.out.println("Done");
		else
			System.out.println("No se pudo");

		if (he.setSegundo(500))
			System.out.println("Done");
		else
			System.out.println("No se pudo");

		he.inc();

		System.out.println(he);
	}
}
