package booletin12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EJ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		List<Integer> lista = new ArrayList<>();
		do {
			System.out.println("añada una serie de numeros ");

			int numero = sc.nextInt();

			lista.add(numero);
			cont++;
		} while (cont != 10);

		Set<Integer> listaSinRepetidos = new HashSet<>(lista);
		List<Integer> listaOrdenada = new ArrayList<>(listaSinRepetidos);

		Collections.sort(listaOrdenada);

		System.out.println(listaOrdenada);

		Collections.reverse(listaOrdenada);
		System.out.println(listaOrdenada);

		sc.close();

	}
}