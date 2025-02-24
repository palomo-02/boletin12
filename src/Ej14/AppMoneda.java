package Ej14;

import java.util.ArrayList;
import java.util.List;

public class AppMoneda {

	public static void main(String[] args) {

		ArrayList<Moneda> lista = new ArrayList<Moneda>();

		Moneda moneda1 = new Moneda();

		String UltimaPosicion = moneda1.getPosicion();
		String ultimaCantidad = moneda1.getCantidad();

		for (int i = 0; i < 5; i++) {

			do {
				moneda1 = new Moneda();

			}

			while (!(moneda1.getPosicion()).equals(UltimaPosicion)
					&& !((moneda1.getCantidad()).equals(ultimaCantidad)));

			lista.add(moneda1);
			UltimaPosicion = moneda1.getPosicion();
			ultimaCantidad = moneda1.getCantidad();

		}

		for (Moneda moneda : lista) {

			System.out.println(moneda);
		}

	}

}
