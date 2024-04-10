package ejercicio4;

public class Electrodomestico {
	/**
	 * Precio base del Electrodomestico
	 */
	protected float precioBase = 100.f;

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	};

	/**
	 * Color del electrodimestico
	 */
	protected Color color = Color.BLANCO;

	/**
	 * Consumo energetico del electrodomestico
	 */
	protected char consumo = 'F';

	/**
	 * Peso del electrodomestico
	 */
	protected float peso = 5.f;

	/**
	 * Constructor vacio
	 */
	public Electrodomestico() {
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precio Precio del electrodomestico
	 * @param peso   Precio del peso
	 */
	public Electrodomestico(float precio, float peso) {
		if (precio > 0)
			this.precioBase = precio;

		if (peso > 0)
			this.peso = peso;
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase Precio del electrodomestico
	 * @param color      Color del electrodomestico
	 * @param consumo    Consumo del electrodomestico
	 * @param peso       Peso del electrodomestico
	 */
	public Electrodomestico(float precio, String color, char consumo, float peso) {
		if (precio > 0)
			this.precioBase = precio;

		if (peso > 0)
			this.peso = peso;

		comprobarConsumoEnergetico(consumo);

		comprobarColor(color);
	}

	/**
	 * @return the precioBase
	 */
	public float getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @return the consumo
	 */
	public char getConsumo() {
		return consumo;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}

	private void comprobarConsumoEnergetico(char letra) {
		letra = Character.toUpperCase(letra);

		if (letra >= 'A' && letra <= 'F')
			this.consumo = letra;
		else
			this.consumo = 'F';
	}

	private void comprobarColor(String color) {
		Color c = Color.BLANCO;

		try {
			c = Color.valueOf(color.toUpperCase());

		} catch (IllegalArgumentException e) {
			System.err.println("Invalid Color: " + color);
			c = Color.BLANCO;
		}

		this.color = c;
	}

	public float precioFinal() {
		float precio = 0;

		switch (this.consumo) {
		case 'A' -> precio = 100;
		case 'B' -> precio = 80;
		case 'C' -> precio = 60;
		case 'D' -> precio = 50;
		case 'E' -> precio = 30;
		case 'F' -> precio = 10;
		default -> throw new IllegalArgumentException("Unexpected value: " + this.consumo);
		}

		if (this.peso <= 19)
			precio += 10;
		if (this.peso <= 49)
			precio += 50;
		if (this.peso <= 79)
			precio += 80;
		else
			precio += 100;

		return precio;
	}
}
