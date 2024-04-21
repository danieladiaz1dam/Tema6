package ejercicio3;

public abstract class AnimalDomestico implements Animal {
	protected String nombre;
	protected String raza;
	protected float peso;
	protected String color;
	protected boolean vacunado = false;

	public AnimalDomestico(String nombre, String raza, float peso, String color, boolean vacunado) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
		this.vacunado = vacunado;
	}

	@Override
	public void comer() {
		System.out.println(this.nombre + " come");

	}

	@Override
	public void dormir() {
		System.out.println(this.nombre + " duerme");
	}

	public void vacunar() {
		this.vacunado = true;
	}

	@Override
	public abstract void hacerRuido();

	public abstract boolean hacerCaso();

	@Override
	public String toString() {
		String str = "";
		
		str += "Nombre: " + this.nombre;
		str += "\nRaza: " + this.raza;
		str += "\nPeso: " + this.peso;
		str += "\nColor: " + this.color;
		str += "\nVacunado: " + (this.vacunado ? "Sí" : "No");
		
		return str;
	}

}
