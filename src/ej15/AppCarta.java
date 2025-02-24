package ej15;

import java.util.ArrayList;

public class AppCarta {
	public static void main(String[] args) {

		ArrayList<Carta> lista = new ArrayList<Carta>();
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
