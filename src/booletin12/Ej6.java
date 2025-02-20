
package booletin12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		List<String> lista = new ArrayList<>();
		do {
			System.out.println("añada una serie de palabrasa ");

			String palabra = sc.nextLine();

			lista.add(palabra);
			cont++;
		} while (cont != 10);

		Collections.sort(lista);

		System.out.println(lista);

		Collections.reverse(lista);
		System.out.println(lista);

		sc.close();

	}
}