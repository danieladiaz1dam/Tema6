package ejercicio01;

/**
 * Hereda de Hora, incluyendo los segundos
 */
public class HoraExacta extends Hora {

	/**
	 * Segundos
	 */
	private int segundos;

	/**
	 * Constructor con parametros
	 * 
	 * @param hora     Hora
	 * @param minutos  Minutos
	 * @param segundos Segundos
	 */
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);

		if (segundos >= 0 && segundos <= 59)
			this.segundos = segundos;
	}

	/**
	 * Cambia los segundos
	 * 
	 * @param segundos Segundos nuevos
	 * @return true si se pudo cambiar los segundos, false en caso contrario
	 */
	public boolean setSegundo(int segundos) {
		boolean res = false;

		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
			res = true;
		}

		return res;
	}

	/**
	 * Incrementa los segundos en uno
	 */
	@Override
	public void inc() {
		segundos++;

		if (segundos >= 60) {
			super.inc();
			segundos = 0;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ":%02d".formatted(this.segundos);
	}
}
