package ejercicio3;

public class NoPerecedero extends Producto {

	private String tipo;
	
	public NoPerecedero(String nombre, float precio, String tipo) {
		super(nombre, precio);
		
		if(tipo != null && !tipo.isBlank())
			this.tipo = tipo;
	}
	
	/**
	 * Devuelve el tipo del producto
	 * @return tipo del producto
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Establece el tipo del producto
	 * @param newtipo Nuevo tipo
	 */
	public void setTipo(String newtipo) {
		this.tipo = newtipo;
	}

	@Override
	public String toString() {
		return "[No Perecedero] " + super.toString();
	}

}
