package ej16;

import java.util.*;

public class AppCarta {
	public static void main(String[] args) {

        Set<Carta> lista = new TreeSet<>();
		Carta carta = new Carta();

		for (int i = 0; i < 11; i++) {

			carta = new Carta();
			lista.add(carta);

		}

		

		ArrayList<Carta>ListaOrdenada=new ArrayList<Carta>(lista);
		
Collections.sort(ListaOrdenada);		
		
		for (Carta C:ListaOrdenada) {
			
			System.out.println(C);
			
			
			
		}
		
		
	}
}
