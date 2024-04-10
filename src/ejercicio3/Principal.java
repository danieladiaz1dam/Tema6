package ejercicio3;

public class Principal {
	public static void main(String[] args) {
		Perecedero p = new Perecedero("nombre", 5, 10);
		System.out.println(p.calcular(10));
		p.setDiasCaducar(3);
		System.out.println(p.calcular(10));
		p.setDiasCaducar(2);
		System.out.println(p.calcular(10));
		p.setDiasCaducar(1);
		System.out.println(p.calcular(10));
		
		
	}
}
