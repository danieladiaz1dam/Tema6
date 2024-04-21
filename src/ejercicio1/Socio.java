package ejercicio1;

public class Socio implements Comparable<Socio> {
	private int id;
	private String nombre;
	private int edad;

	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		String str = "";
		str += "N Socio: " + this.id;
		str += "\nNombre: " + this.nombre;
		str += "\nEdad: " + this.edad;
		str += "\n====================\n";

		return str;
	}

	@Override
	public int compareTo(Socio o) {
		return this.id - o.id;
	}
}
