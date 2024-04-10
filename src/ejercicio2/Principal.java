package ejercicio2;

public class Principal {
	public static void main(String[] args) {
		Empleado e = new Empleado("Daniela");
		Directivo d = new Directivo("Daniela");
		Operario o = new Operario("Daniela");
		Oficial of= new Oficial("Daniela");
		Tecnico t = new Tecnico("Daniela");

		System.out.println(e);
		System.out.println(d);
		System.out.println(o);
		System.out.println(of);
		System.out.println(t);
	}
}
