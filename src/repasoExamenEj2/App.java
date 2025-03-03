package repasoExamenEj2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int opcion = 0;
		do {

			MostrarMenu();
			opcion = sc.nextInt();
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
				break;
			default:
				System.out.println("numero incorrecto, pruebe de nuevo");
			}

		} while (opcion != 6);

		sc.close();

	}

	private static void MostrarMenu() {

		System.out.println("1. Alta evento");
		System.out.println("2. Baja eventon");
		System.out.println("3. Modificación evento");
		System.out.println("4. Listado alfabético de los eventos");
		System.out.println("5. Listado por fecha de más reciente a más antiguo");
		System.out.println("6. salir");

	}
}
