package booletin12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> mapa = new HashMap<>();

		mapa.put("España", "Madrid");
		mapa.put("Portugal", "Lisboa");
		mapa.put("Francia", "Paris");
		int opcion = 0;

		do {

			MostrarMenu();
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1:
				System.out.println("escribe el nombre del pais y diré la capital");

				String pais = sc.nextLine();

				if (mapa.containsKey(pais)) {

					System.out.println("la capital de " + pais + " Es:" + mapa.get(pais));

				}
				break;
			case 2:

				System.out.println("Escriba el nombre del pais que quiere añadir ");

				String NuevoPais = sc.nextLine();

				System.out.println("escriba el nombre de la capital del pais");
				String NuevaCapital = sc.nextLine();

				if (mapa.containsKey(NuevoPais)) {

					System.out.println("el pais ya esxiste");
					sc.nextLine();

				} else {

					mapa.put(NuevoPais, NuevaCapital);

				}

				break;
			case 3:
				System.out.println("saliendo...");
				break;

			}

		} while (opcion != 3);
		sc.close();

	}

	private static void MostrarMenu() {
		System.out.println("Elija que hacer ");
		System.out.println("1. Elija el pais del que conocer la capital ");
		System.out.println("2. Añada un pais con su capital       ");
		System.out.println("3. Salir ");

	}

}
