package Ej22;

import java.util.*;


/**
 * @author Palomo
 * @since 
 * 
 */
public class AppTienda {
	private static ArrayList<Tienda> lista = new ArrayList<Tienda>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcion = 0;

		do {

			mostrarMenu();

			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				AltaProducto(sc);

				break;
			case 2:

				BajaProducto(sc);

				break;
			case 3:
				ActualizarStock(sc);
				break;
			case 4:

				MostrarLista();

				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Inserte un numero entre el 1 y el 5 ");
				break;

			}

		} while (opcion != 5);

		sc.close();

	}

	private static void ActualizarStock(Scanner sc) {

		System.out.println("introduzca el codigo del producto cuyos datos quiere modificar");

		int codModificar = sc.nextInt();
		sc.nextLine();

		System.out.println("introduca el nuevo nombre del producto ");
		String nombreNuevo = sc.nextLine();
		System.out.println("introduzca el nuevo stock");
		int nuevoStock = sc.nextInt();

		for (int i = 0; i < lista.size(); i++) {

			if (codModificar == lista.get(i).getCodigo()) {

				lista.get(i).setNombre(nombreNuevo);
				lista.get(i).setStock(nuevoStock);

			}
		}
	}

	private static void BajaProducto(Scanner sc) {

		System.out.println("Introduzca el codigo del numero que desa eliminar ");
		int codElim = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < lista.size(); i++) {

			if (codElim == lista.get(i).getCodigo()) {

				lista.remove(i);
				System.out.println("Eliminado con exito ");
			}

		}

	}

	private static void MostrarLista() {

		if (lista.isEmpty()) {

			System.out.println("la lista esta vacia");
		} else {

			for (Tienda tienda : lista) {
				System.out.println("--------------------------------------------------");
				System.out.println("La informacion del producto con codigo " + tienda.getCodigo() + " es: ");

				System.out.println("el nombre del producto es: " + tienda.getNombre());
				System.out.println("el Stock del producto es: " + tienda.getStock());

				System.out.println("----------------------------------------");

			}

		}

	}

	private static void AltaProducto(Scanner sc) {

		System.out.println("introduzca el codigo alfanumerico de un producto a registrar");

		int cod = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduzca el nombre del producto ");
		String nombre = sc.nextLine();

		System.out.println("introduzca el stock");
		int stock = sc.nextInt();
		sc.nextLine();

		lista.add(new Tienda(cod, nombre, stock));

	}

	private static void mostrarMenu() {

		System.out.println("Elija que hacer");
		System.out.println("1. Alta producto");
		System.out.println("2. Baja producto");
		System.out.println("3. Actualizar Stock");
		System.out.println("4. Lista de existencias ");
		System.out.println("5. Salir ");

	}

}
