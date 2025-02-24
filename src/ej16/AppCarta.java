package ej16;

import java.util.Set;
import java.util.TreeSet;

public class AppCarta {
	public static void main(String[] args) {

        Set<Carta> lista = new TreeSet<>();
		Carta carta = new Carta();

		for (int i = 0; i < 11; i++) {

			carta = new Carta();
			lista.add(carta);

		}

		for (Carta C : lista) {
			System.out.println(C);
		}
		
		
	
		

	}
}
