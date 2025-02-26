package ej1list;

import java.util.*;

public class AppEstancia {

	private static ArrayList<Reserva> reserva = new ArrayList<Reserva>();
	private static ArrayList<Alojamiento> alojamiento = new ArrayList<Alojamiento>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcion = 0;

		alojamiento.add(new CasaRural("Casa Rural Ejemplo", 101, "Calle Ejemplo 1", 4, 100, 2));
		alojamiento.add(new CasaRural("Casa Rural Ejemplo", 101, "Calle Ejemplo 1", 4, 100, 2));
		alojamiento.add(new HotelRural("Casa Rural Ejemplo", 101, "Calle Ejemplo 1", 4, 100, 5));
		alojamiento.add(new HotelRural("Casa Rural Ejemplo", 101, "Calle Ejemplo 1", 4, 100, 3));

		do {

			mostrarMenu();
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1:
				break;
			case 2:
				break;
			case 3:

				AñadirReserva(sc);

				break;
			case 4:

				break;
			case 5:
				System.out.println("Saliendo... ");
				break;
			default:
				System.out.println("Introduzca un numero entre el 1 y el 5, pruebe de nuevo ");
				return;

			}

		} while (opcion != 5);

		sc.close();
	}

	private static void AñadirReserva(Scanner sc) {

		System.out.println("añada el numero identificativo ");
		int ID = sc.nextInt();
		sc.nextLine();

		System.out.println("Ingrese el DNI:");
		int DNI = sc.nextInt();
		sc.nextLine();

		System.out.println("Ingrese el numero de referencia:");
		int referencia = sc.nextInt();
		sc.nextLine();

		System.out.println("Ingrese El numero de dias que se va a alojar:");
		int dias = sc.nextInt();
		sc.nextLine();

		Alojamiento alojamientoReservado = null;
		for (Alojamiento a : alojamiento) {
			if (a.getReferencia() == referencia) {
				alojamientoReservado = a;
				break;
			}
		}

		reserva.add(new Reserva(ID, DNI, alojamientoReservado, dias));

	}

	private static void mostrarMenu() {
		System.out.println("------------------------------");
		System.out.println("Bienvenido al menu de reserva ");
		System.out.println("Elija que hacer ");
		System.out.println("------------------------------");
		System.out.println("1. Listar alojamientos por precio");
		System.out.println("2. Listar alojamientos por capacidad");
		System.out.println("3. Reservar un alojamiento");
		System.out.println("4. Finalizar una reserva");
		System.out.println("5. Salir");

	}

}