package repasoExamenEj3;

import java.util.*;

public class App {

	private static ArrayList<Libro> Libros = new ArrayList<>();
private static Set<Usuario> usuarios=new HashSet<>();
	/**
	 * @param args
	 * 
	 *             Metodo main por el que se llaman a los metodos
	 */
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		int opcion = 0;

		do {
			MostrarMenu();
			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {
			case 1:
				agregarLibro(sc);
				break;
			case 2:

				borrarLibro(sc);

				break;
				
				
			case 3:
				prestarLibro(sc);

				break;
			case 4:
				ListarAlfabeticamente(sc);
				break;
			case 5:
				ListarPorFecha(sc);
				break;
			case 6:
				System.out.println("saliendo....");

				break;

			default:
				System.out.println("ha introducido un numero incorrecto. ");
				break;
			}

		} while (opcion != 6);
		sc.close();
	}

	
		
		
	

	private static void prestarLibro(Scanner sc) {

		
		
		
		
		
		
		
		
		
		
		
		
	}






	private static void ListarPorFecha(Scanner sc) {

		if (Libros.isEmpty()) {
			System.out.println("No hay ningun libro registrado");
			return;

		} else {

			Libros.sort(new Listarporfecha());
			for (Libro libro : Libros) {

				System.out.println(libro);

			}

		}

	}

	private static void ListarAlfabeticamente(Scanner sc) {
		if (Libros.isEmpty()) {
			System.out.println("No hay ningun libro registrado");
			return;

		} else {

			Collections.sort(Libros);
			for (Libro libro : Libros) {

				System.out.println(libro);

			}

		}
	}

	private static void borrarLibro(Scanner sc) {

		if (Libros.isEmpty()) {

			System.out.println("No hay ningun libro registrado");
			return;

		} else {

			System.out.println("inserte el nombre del libro que quiere borrar");

			String libroBorrar = sc.nextLine();

			for (int i = 0; i < Libros.size(); i++) {

				if (Libros.get(i).getTitulo().equalsIgnoreCase(libroBorrar)) {

					Libros.remove(i);

				}

			}
		}

	}

	private static void agregarLibro(Scanner sc) {

		System.out.println("ha elegido añadir un libro a la biblioteca ");

		System.out.println("inserte el nombre del libro ");
		String nombreLibro = sc.nextLine();

		System.out.println("inserte el autor del libro ");
		String AutorLibro = sc.nextLine();

		System.out.println("inserte la fecha del libro ");
		String FechaLibro = sc.nextLine();

		System.out.println("elija si el libro a añadir es un 1.Libro fisico ó 2.Libro digital");

		int EleccionLibro = sc.nextInt();

		switch (EleccionLibro) {

		case 1:

			System.out.println("inserte el numero de ejemplares disponibles ");
			int ejemplaresDisponibles = sc.nextInt();

			Libros.add(new LibroFisico(nombreLibro, AutorLibro, FechaLibro, ejemplaresDisponibles));
			break;
		case 2:

			System.out.println("inserte el enlace al libroDigital ");
			int enlaceLibro = sc.nextInt();

			Libros.add(new LibroFisico(nombreLibro, AutorLibro, FechaLibro, enlaceLibro));

		default:
			System.out.println("ha introducido un numero incorrecto ");

		}

	}

	private static void MostrarMenu() {
		System.out.println("SISTEMA DE GESTION DE BIBLIOTECA");
		System.out.println("---------------------------------");
		System.out.println("1. Agregar libros");
		System.out.println("2. Eliminar libros");
		System.out.println("3. Prestar libro fisico");
		System.out.println("4. listar alfabeticamente por titulo");
		System.out.println("5. listar por año de forma descente ");
		System.out.println("6. Salir del programa ");
		System.out.println("---------------------------------");

	}

}
