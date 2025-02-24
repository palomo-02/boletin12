package booletin12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, String> mapa = new HashMap<>();

		int opcion = 0;
		int intento = 0;

		do {
			mostrarMenu();
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("Ingrese el nombre del usuario a ingresar");
				String nombre = sc.nextLine();

				System.out.println("Ingrese una contraseña nueva");
				String contraseña = sc.nextLine();

				mapa.put(nombre, contraseña);
				break;

			case 2:
				if (mapa.isEmpty()) {
					System.out.println("No hay ningún usuario en el sistema");
				} else {
					do {
						System.out.println("Introduzca el nombre de usuario");
						String usuarioIngresado = sc.nextLine();

						if (mapa.containsKey(usuarioIngresado)) {
							System.out.println("Introduzca la contraseña");
							String contraseñaIngresada = sc.nextLine();

							if (mapa.get(usuarioIngresado).equals(contraseñaIngresada)) {
								System.out.println("Acceso concedido. ¡Bienvenido " + usuarioIngresado + "!");
								break;
							} else {
								System.out.println("Contraseña incorrecta.");
							}
						} else {
							System.out.println("El usuario no existe.");
						}

						intento++;
					} while (intento < 3);
				}
				break;

			case 3:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 3);

		sc.close();
	}

	private static void mostrarMenu() {
		System.out.println("Elija lo que desea hacer");
		System.out.println("1. Añadir usuario");
		System.out.println("2. Ingresar al programa");
		System.out.println("3. Salir del programa");
	}
}
