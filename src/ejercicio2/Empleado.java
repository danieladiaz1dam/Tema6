package ejercicio2;

/**
 * HAce referencia a un trabajador de la empresa
 */
public class Empleado {
	/**
	 * Nombre del empleado
	 */
	private String nombre;

	public Empleado(String nombre) {
		if (nombre != null)
			this.nombre = nombre;
	}

	/**
	 * Cambia el nombre del empleado
	 * @param newNombre nuevo nombre
	 */
	public void setNombre(String newNombre) {
		if (newNombre != null)
			this.nombre = newNombre;
	}
	
	@Override
	public String toString() {
		return "Empleado %s".formatted(this.nombre);
	}
}
