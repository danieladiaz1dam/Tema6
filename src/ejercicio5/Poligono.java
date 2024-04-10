package ejercicio5;

public abstract class Poligono {
	protected int numeroLados;

	public Poligono() {};
	
	public Poligono(int numeroLados) {
		if (numeroLados > 1)
			this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}
	
	public abstract double area();

	@Override
	public String toString() {
		return "Poligono de %d lados ".formatted(this.numeroLados);
	}
}
