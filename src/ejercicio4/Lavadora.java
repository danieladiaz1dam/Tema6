package ejercicio4;

public class Lavadora extends Electrodomestico {

	private float carga = 5.f;
	
	/**
	 * Constructor vacio
	 */
	public Lavadora() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precio Precio de la Lavadora
	 * @param peso   Peso de la Lavadora
	 * @param carga  Carga de la Lavadora
	 */
	public Lavadora(float precio, float peso, float carga) {
		super(precio, peso);

		if (carga > 0)
			this.carga = carga;
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param carga Carga de la Lavadora
	 */
	public Lavadora(float carga) {
		super();

		if (carga > 0)
			this.carga = carga;
	}

	/**
	 * @return the carga
	 */
	public float getCarga() {
		return carga;
	}

	@Override
	public float precioFinal() {
		float precio = super.precioFinal();

		if (this.carga >= 30)
			precio += 50;

		return precio;
	}

}
