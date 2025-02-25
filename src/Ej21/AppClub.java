package Ej21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppClub {

	public static void main(String[] args) {

		Map<Integer, Club> mapa = new HashMap<>();
		var sc = new Scanner(System.in);

		int opcion = 0;

		do {

			MostrarMenu();
			opcion = sc.nextInt();
			sc.nextLine();
			
			
			switch (opcion) {

			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;

			case 6:
				System.out.println("saliendo... ");

			default:
				System.out.println("numero no valido ");

			}
		} while (opcion != 6);

		sc.close();
	}

	private static void MostrarMenu() {
		System.out.println("elija que hacer ");
		System.out.println("1.Alta ");
		System.out.println("2 Baja ");
		System.out.println("3 Modificacion ");
		System.out.println("4 Listado por DNI ");
		System.out.println("5 Listado por antiguedad ");
		System.out.println("6 Salir ");

	}

}
