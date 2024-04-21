package ejercicio2;

import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		Futbolista[] fs = new Futbolista[5];

		fs[0] = new Futbolista(0, "nombre1", 0, 0);
		fs[1] = new Futbolista(0, "nombre", 0, 0);
		fs[2] = new Futbolista(20, "nombre3", 0, 0);
		fs[3] = new Futbolista(20, "nombre", 0, 0);
		fs[4] = new Futbolista(-1, null, 0, 0);
		
		Arrays.sort(fs);
		
		for (Futbolista f :fs)
			System.out.println(f);
	}
}
