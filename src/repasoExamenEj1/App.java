package repasoExamenEj1;

import java.util.*;

public class App {

	private static ArrayList<Vehiculo> lista = new ArrayList<>();

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int opcion = 0;
		do {

			MostrarMenu();

			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1:

				AñadirVehiculo(sc);

				break;
			case 2:

				MostrarEstado();

				break;
			case 3:
				System.out.println("desea arrancar o parar un vehiculo? 1.arrancar 2.parar ");

				int eleccion = sc.nextInt();

				if (eleccion == 1) {
					ArrancarMotor(sc);
				} else if (eleccion == 1) {

					PararMotor(sc);
				}

				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("ponga un numero entre el 1 y el 4 ");

			}

		} while (opcion != 4);

		sc.close();

	}

	private static void PararMotor(Scanner sc) {
		System.out.println("elija el nombre de la marca del vehiculo que desea parar ");

		String MarcaParar= sc.nextLine();

		for (Vehiculo vehiculo : lista) {
			if (VehiculoConMotor.getMarca().equalsIgnoreCase(MarcaParar)) {
				vehiculo.parar(); // ✅ No usamos instanceof
				return;
			}
		}
	}

	private static void ArrancarMotor(Scanner sc) {

		System.out.println("elija el nombre de la marca del vehiculo que desea arrancar ");

		String MarcaArranque= sc.nextLine();

		for (Vehiculo vehiculo : lista) {
			if (VehiculoConMotor.getMarca().equalsIgnoreCase(MarcaArranque)) {
				vehiculo.arrancar(); // ✅ No usamos instanceof
				return;
			}
		}

	}

	private static void MostrarEstado() {

		if (lista.isEmpty()) {

			System.out.println("la lista esta vacia");
		} else {
			for (Vehiculo vehiculo : lista) {

				System.out.println(vehiculo.Mostrar());

			}

		}

	}

	private static void AñadirVehiculo(Scanner sc) {

		System.out.println("elija si es 1.Moto o 2.coche");
		int vehiculo = sc.nextInt();
		sc.nextLine();

		if (vehiculo == 1) {

			System.out.println("inserte el peso del vehiculo");

			int pesoMoto = sc.nextInt();

			System.out.println("inserte la marca de la motarda ");
			String marcaMoto = sc.nextLine();

			System.out.println("inserte tipo de moto");
			String tipoMoto = sc.nextLine();

			lista.add(new Moto(marcaMoto, pesoMoto, tipoMoto));
			System.out.println("vehiculo añadido con exito ");

		} else if (vehiculo == 2) {

			System.out.println("inserte el peso del vehiculo");

			int pesoCoche = sc.nextInt();
			sc.nextLine();

			System.out.println("inserte la marca del cochardo ");
			String marcaCoche = sc.nextLine();

			System.out.println("inserte nPuertas");
			int tipoCoche = sc.nextInt();

			lista.add(new Coche(marcaCoche, pesoCoche, tipoCoche));
			System.out.println("vehiculo añadido con exito ");

		} else {

			System.out.println("el numero introducido es incorrecto ");
			return;
		}
	}

	private static void MostrarMenu() {

		System.out.println("---------------------------------------------------");
		System.out.println("1. Registrar un nuevo vehículo (Coche o Moto).");
		System.out.println("2. Mostrar el estado de todos los vehículos registrados.");
		System.out.println("3. Arrancar o parar un vehículo por su índice.");
		System.out.println("4. Salir del programa.");
		System.out.println("---------------------------------------------------");

	}

}
