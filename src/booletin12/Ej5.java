package booletin12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej5 {

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

		Collections.sort(lista);

		System.out.println(lista);

		Collections.reverse(lista);
		System.out.println(lista);

		sc.close();

	}
}