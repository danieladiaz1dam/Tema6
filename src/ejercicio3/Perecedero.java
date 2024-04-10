package ejercicio3;

public class Perecedero extends Producto {

	/**
	 * Dias hasta que caduque el producto
	 */
	private int diasCaducar;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre      Nombre del producto
	 * @param precio      Precio del producto
	 * @param diasCaducar Dias hasta que el producto caduque
	 */
	public Perecedero(String nombre, float precio, int diasCaducar) {
		super(nombre, precio);

		if (diasCaducar > 0)
			this.diasCaducar = diasCaducar;
	}

	/**
	 * Devuelve los dias que falta para que el producto caduque
	 * 
	 * @return Dias que faltan para caducar
	 */
	public int getDiasCaducar() {
		return diasCaducar;
	}

	/**
	 * Establece los dias que faltan para que caduque
	 * 
	 * @param newDiasCaducar Nueva cantidad de dias
	 */
	public void setDiasCaducar(int newDiasCaducar) {
		this.diasCaducar = newDiasCaducar;
	}

	/**
	 * Devuelve el precio de venta de una cantidad de productos Tiene una
	 * penalización a partir de cuantos dias le quede para caducar
	 * 1 -> 25%
	 * 2 -> 33%
	 * 3 -> 50%
	 * 
	 * @param cantidad CAantidad a vneder
	 * @return precio total del lote
	 */
	@Override
	public double calcular(int cantidad) {
		double res = super.calcular(cantidad);

		res = switch (this.diasCaducar) {
		case 1:
			yield res / 4;
		case 2:
			yield res / 3;
		case 3:
			yield res / 2;
		default:
			yield res;
		};

		return res;
	}

	@Override
	public String toString() {
		return "[Perecedero] " + super.toString();
	}

}
