package ejercicio5;

import java.util.Scanner;

public class Principal {
	final static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int opt = 0;
		System.out.println("1. Introducir triangulo");
		System.out.println("2. Introducir rectangulo");
		System.out.println("3. Mostrar poligonos");
		System.out.println("0. Salir");
		opt = sc.nextInt();

		return opt;
	}

	public static void main(String[] args) {
		int opt;
		int lado;

		Triangulo triangulo;
		Rectangulo rectangulo;
		
		Poligono[] lista = new Poligono[10];
		int lastPos = 0;

		do {
			opt = menu();

			switch (opt) {
			case 1: 
				triangulo = new Triangulo();

				System.out.println("Lado 1 del triangulo");
				lado = sc.nextInt();
				triangulo.setLado1(lado);

				System.out.println("Lado 2 del triangulo");
				lado = sc.nextInt();
				triangulo.setLado2(lado);

				System.out.println("Lado 3 del triangulo");
				lado = sc.nextInt();
				triangulo.setLado3(lado);
				
				lista[lastPos++] = triangulo;
				break;
			case 2:
				rectangulo = new Rectangulo();

				System.out.println("Lado 1 del rectangulo");
				lado = sc.nextInt();
				rectangulo.setLado1(lado);

				System.out.println("Lado 2 del rectangulo");
				lado = sc.nextInt();
				rectangulo.setLado2(lado);
				
				lista[lastPos++] = rectangulo;
				break;
			
			case 3:
				for (Poligono p : lista)
					if (p != null)
						System.out.printf("%s area: %.2f\n", p, p.area());
			}
		} while (opt != 0 && lastPos < lista.length);
	}
}
