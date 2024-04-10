package ejercicio4;

public class Television extends Electrodomestico {

	private float resolucion = 20.f;
	private boolean tdt = false;

	/**
	 * Constructor vacio
	 */
	public Television() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precio Precio del TV
	 * @param peso   Precio del TV
	 */
	public Television(float precio, float peso) {
		super(precio, peso);
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param precioBase Precio del TV
	 * @param color      Color del TV
	 * @param consumo    Consumo del TV
	 * @param peso       Peso del TV
	 * @param resolucion Resolucion del TV
	 * @param tdt        Defidir si el TV tiene TDT
	 */
	public Television(float precio, String color, char consumo, float peso, float resolucion, boolean tdt) {
		super(precio, color, consumo, peso);

		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	/**
	 * @return the resolucion
	 */
	public float getResolucion() {
		return resolucion;
	}

	/**
	 * @return the tdt
	 */
	public boolean isTdt() {
		return tdt;
	}
	
	@Override
	public float precioFinal() {
		float precio = super.precioFinal();

		if (this.resolucion >= 40)
			precio *= 1.3;

		if (this.tdt)
			precio += 50;
		
		return precio;
	}

}
