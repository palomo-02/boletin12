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

		} while (opcion != 8);

		sc.close();

	}

	private static void MostrarMenu() {

		System.out.println("1. Alta evento");
		System.out.println("2. Alta participante");

		System.out.println("3. Baja eventon");	
		System.out.println("4. Alta participante");

		System.out.println("5. Modificación evento");
		System.out.println("6. Listado alfabético de los eventos");
		System.out.println("7. Listado por fecha de más reciente a más antiguo");
		System.out.println("8. salir");

	}
}
