package ejercicio3;

public class Gato extends AnimalDomestico {

	public Gato(String nombre, String raza, float peso, String color, boolean vacunado) {
		super(nombre, raza, peso, color, vacunado);
	}

	@Override
	public void hacerRuido() {
		System.out.println(super.nombre + " maulla");
	}

	@Override
	public boolean hacerCaso() {
		return Math.random() * 100 <= 5;
	}

	public void toserBolaPelo() {
		System.out.println(super.nombre + " tose una bola de pelo");
	}
	
}
