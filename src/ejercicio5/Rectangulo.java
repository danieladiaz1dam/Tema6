package ejercicio5;

/**
 * Clase que representa un rectangulo
 */
public class Rectangulo extends Poligono {

	/**
	 * Tamaño del lado1
	 */
	private int lado1;

	/**
	 * Tamaño del lado2
	 */
	private int lado2;

	/**
	 * Constructor sin parametros
	 */
	public Rectangulo() {
		super(2);
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param numeroLados Numero de lados del poligono
	 * @param lado1       Tamaño del lado1
	 * @param lado2       Tamaño del lado 2
	 */
	public Rectangulo(int lado1, int lado2) {
		super(2);
		if (lado1 > 0)
			this.lado1 = lado1;

		if (lado2 > 0)
			this.lado2 = lado2;
	}

	/**
	 * Calcula el area de un rectangulo
	 * 
	 * @return area
	 */
	@Override
	public double area() {
		return this.lado1 * this.lado2;
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

	@Override
	public String toString() {
		return super.toString() + "(Rectangulo)";
	}

}
