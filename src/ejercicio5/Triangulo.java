package ejercicio5;

public class Triangulo extends Poligono {
	/**
	 * Tamaño del lado1
	 */
	private int lado1;
	/**
	 * Tamaño del lado2
	 */
	private int lado2;
	/**
	 * Tamaño del lado3
	 */
	private int lado3;

	/**
	 * Constructor sin parametros
	 */
	public Triangulo() {
		super(3);
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param lado1 Tamaño del lado1
	 * @param lado2 Tamaño del lado2
	 * @param lado3 Tamaño del lado3
	 */
	public Triangulo(int lado1, int lado2, int lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	/**
	 * @return the lado1
	 */
	public int getLado1() {
		return lado1;
	}

	/**
	 * @return the lado2
	 */
	public int getLado2() {
		return lado2;
	}

	/**
	 * @return the lado3
	 */
	public int getLado3() {
		return lado3;
	}

	/**
	 * @param lado1 the lado1 to set
	 */
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	/**
	 * @param lado2 the lado2 to set
	 */
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	/**
	 * @param lado3 the lado3 to set
	 */
	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	@Override
	public String toString() {
		return super.toString() + "(Triangulo)";
	}

	@Override
	public double area() {
		double s = (this.lado1 + this.lado2 + this.lado3) / 2.f;
		double area = Math.sqrt((s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3)));
		return area;
	}

}
