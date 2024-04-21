package ejercicio2;

public class Futbolista implements Comparable<Futbolista> {
	private int numero;
	private String nombre;
	private int edad;
	private int nGoles;

	public Futbolista(int numero, String nombre, int edad, int nGoles) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.edad = edad;
		this.nGoles = nGoles;
	}


	@Override
	public String toString() {
		return "Futbolista [numero=" + numero + ", nombre=" + nombre + ", edad=" + edad + ", nGoles=" + nGoles + "]";
	}


	@Override
	public boolean equals(Object obj) {
		boolean res = false;

		if (obj instanceof Futbolista) {
			Futbolista f = (Futbolista) obj;
			res = this.numero == f.numero && this.nombre.equals(f.nombre);
		}

		return res;
	}

	@Override
	public int compareTo(Futbolista o) {
		int res = this.numero - o.numero;

		if (res == 0)
			res = this.nombre.compareTo(o.nombre);

		return res;
	}
}
