package Ej21;

import java.util.*;

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

				System.out.println("ingrese el DNI: ");
				int dni = sc.nextInt();
				sc.nextLine();

				if (mapa.containsKey(dni)) {

					System.out.println("EL dni ya esta en el mapa ");
					sc.nextLine();

				} else {

					System.out.println("ingrese su nombre: ");
					String nombre = sc.nextLine();

					System.out.println("ingrese fecha de entrada (año) ");
					int fecha = sc.nextInt();
					sc.nextLine();

					mapa.put(dni, new Club(nombre, fecha));

				}

				break;
			case 2:
				System.out.println("inserte el DNI que desea eliminar");

				int dniBorrar = sc.nextInt();
				sc.nextLine();

				if (!mapa.containsKey(dniBorrar)) {

					System.out.println("el dni no se encuentra ");

				} else {

					mapa.remove(dniBorrar);

				}

				break;
			case 3:

				System.out.println("Inserte el DNI cuyos valores quiere modificar ");

				int dniCambiar = sc.nextInt();
				sc.nextLine();

				if (!mapa.containsKey(dniCambiar)) {

					System.out.println("el dni no existe");
					return;
				} else {

					System.out.println("introduzca el nuevo nombre ");

					String NombreNuevo = sc.nextLine();

					System.out.println("introduzca la nueva fecha ");

					int FechaNueva = sc.nextInt();
					sc.nextLine();

					
					mapa.put(dniCambiar, new Club(NombreNuevo, FechaNueva));

					
					

				}

				break;
			case 4:
				listarPorDNI(mapa);

				break;
			case 5:

				break;

			case 6:
				System.out.println("saliendo... ");

			default:
				System.out.println("numero no valido ");
				break;

			}
		} while (opcion != 6);

		sc.close();
		
		
	}

	private static void MostrarMenu() {
		System.out.println("elija que hacer ");
		System.out.println("1.Alta ");
		System.out.println("2.Baja ");
		System.out.println("3.Modificacion ");
		System.out.println("4.Listado por DNI ");
		System.out.println("5.Listado por antiguedad ");
		System.out.println("6.Salir ");

	}

	private static void listarPorDNI(Map<Integer, Club> mapa) {
		if (mapa.isEmpty()) {
			System.out.println("No hay clubes registrados.");
			return;
		}

		List<Integer> dnis = new ArrayList<>(mapa.keySet()); // Obtener DNIs
		Collections.sort(dnis); // Ordenar DNIs

		System.out.println("\nListado de clubes por DNI:");
		for (int dni : dnis) {
			System.out.println("DNI: " + dni + " -> " + mapa.get(dni));
		}
	}

}
