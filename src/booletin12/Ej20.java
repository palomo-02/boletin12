package booletin12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej20 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		Map<String, String> habitat = new HashMap<>();
		Map<String, String> alimentacion = new HashMap<>();

		habitat.put("rana", "lago");
		habitat.put("salamandra", "ubeda");
		habitat.put("ajolote", "cenote");
		alimentacion.put("rana", "mosca");
		alimentacion.put("salamandra", "canelloni");
		alimentacion.put("ajolote", "lechuga");

		int opcion = 0;

		do {

			MostrarMenu();
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1:
				System.out.println("de que anfibio se quiere informar: 'rana','salamandra','ajolote'");

				String anfibio = sc.nextLine();

				if (!habitat.containsKey(anfibio) && (!alimentacion.containsKey(anfibio))) {

					System.out.println("el anfibio no existe");

				} else {

					System.out.println("la infomacion del anfibio es: ");
					System.out.println("El anfibio :" + anfibio + " vive en: " + habitat.get(anfibio));
					System.out.println("El anfibio : " + anfibio + " come: " + alimentacion.get(anfibio));

				}
				break;
			case 2:
				System.out.println("saliendo....");

				break;
			default:
				System.out.println("numero no valido ");

			}
		} while (opcion != 2);

		sc.close();
	}

	private static void MostrarMenu() {
		System.out.println("elija que hacer ");
		System.out.println("1 Informarse sobre un anfibio ");
		System.out.println("2 salir ");

	}
}
