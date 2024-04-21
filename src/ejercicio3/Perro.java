package ejercicio3;

public class Perro extends AnimalDomestico {

	public Perro(String nombre, String raza, float peso, String color, boolean vacunado) {
		super(nombre, raza, peso, color, vacunado);
	}

	@Override
	public boolean hacerCaso() {
		return Math.random() * 100 <= 90;
	}

	@Override
	public void hacerRuido() {
		System.out.println(super.nombre + " ladra");
	}

	public void sacarPeso() {
		System.out.println(super.nombre + " sale de paseo");
	}
	
}
