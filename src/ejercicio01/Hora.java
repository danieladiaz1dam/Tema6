package ejercicio01;

/**
 * Representa un instante de tiempo compuesto por la hora y los minutos
 */
public class Hora {
	/**
	 * Hora
	 */
	protected int hora;
	/**
	 * Minutos
	 */
	protected int minuto;

	/**
	 * Cosntructor con parametros
	 * 
	 * @param hora   Hora
	 * @param minuto Minuto
	 */
	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora <= 23)
			this.hora = hora;

		if (minuto >= 0 && minuto <= 59)
			this.minuto = minuto;
	}

	/**
	 * Incrementa los minutos en uno
	 */
	public void inc() {
		minuto++;

		if (minuto >= 60) {
			minuto = 0;
			hora++;

			if (hora >= 24)
				hora = 0;
		}
	}

	/**
	 * Cambia la hora
	 * 
	 * @param hora Hora nueva
	 * @return true si se pudo cambiar la hora, false en caso contrario
	 */
	public boolean setHora(int hora) {
		boolean res = false;

		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
			res = true;
		}
		return res;

	}

	/**
	 * Cambia los minutos
	 * 
	 * @param minuto minutos nuevos
	 * @return true si se pudo cambiar la hora, false en caso contrario
	 */
	public boolean setMinuto(int minuto) {
		boolean res = false;

		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
			res = true;
		}
		return res;
	}

	@Override
	public String toString() {
		return "%02d:%02d".formatted(this.hora, this.minuto);
	}

}
