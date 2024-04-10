package ejercicio3;

public class Producto implements Comparable<Producto> {
	/**
	 * Nombre
	 */
	protected String nombre;

	/**
	 * Precio
	 */
	protected float precio;

	/**
	 * Constructo con parametros
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 */
	public Producto(String nombre, float precio) {
		if (nombre != null && !nombre.isBlank())
			this.nombre = nombre;

		if (precio >= 0)
			this.precio = precio;
	}

	/**
	 * Devuelve el nombre del producto
	 * 
	 * @return nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Etablece el nombre del producto
	 * 
	 * @param newNombre Nuevo nombre
	 */
	public void setNombre(String newNombre) {
		if (newNombre != null && !newNombre.isBlank())
			this.nombre = newNombre;
	}

	/**
	 * Devuelve el precio del poducto
	 * 
	 * @return precio del producto
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del producto
	 * 
	 * @param newPrecio Nuevo precio
	 */
	public void setPrecio(float newPrecio) {
		if (newPrecio >= 0)
			this.precio = newPrecio;
	}

	/**
	 * Devuelve el precio de venta de una cantidad de productos
	 * 
	 * @param cantidad CAantidad a vneder
	 * @return precio total del lote
	 */
	public double calcular(int cantidad) {
		double res = 0;
		if (cantidad > 0)
			res = this.precio * cantidad;

		return res;
	}

	@Override
	public String toString() {
		return "Producto \"%s\" cuesta $%2.f".formatted(this.nombre, this.precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Producto) {
			Producto p = (Producto) obj;
			return this.nombre.equals(p.getNombre());
		}
		return false;
	}

	@Override
	public int compareTo(Producto p) {
		return this.nombre.compareTo(p.getNombre());
	}
}
