package booletin12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej4 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		int tamaño = (int) (Math.random() * 11) + 10;

		for (int i = 1; i < tamaño; i++) {

			lista.add((int) (Math.random() * 101));
		}

		System.out.println(lista);

		int suma = 0;
		for (Integer num : lista) {

			suma += num;

		}
		System.out.println("la suma de los elementos es: " + suma);

		System.out.println("la media es " + suma / tamaño);

		System.out.println("el numero maximo es ");
		System.out.println(Collections.max(lista));

		System.out.println("el numero minimo es ");
		System.out.println(Collections.min(lista));
	}

}
