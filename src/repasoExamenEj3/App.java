package repasoExamenEj3;

import java.util.*;

public class App {

	private static ArrayList<Libro> Libros = new ArrayList<>();
	private static Set<Usuario> usuarios = new HashSet<>();

	/**
	 * @param args
	 * 
	 *Metodo main por el que se llaman a los metodos
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
		System.out.println("Inserte el DNI del usuario:");
		String dniUsuario = sc.nextLine();

		// Check if the user exists
		Usuario usuarioEncontrado = null;
		for (Usuario usuario : usuarios) {
			if (usuario.getDni().equalsIgnoreCase(dniUsuario)) {
				usuarioEncontrado = usuario;
				break;
			}
		}

		if (usuarioEncontrado == null) {
			// User does not exist
			System.out.println("El usuario que ha introducido no existe. ¿Quiere añadir uno nuevo? (1. Sí / 2. No)");
			int opcionUsuario = sc.nextInt();
			sc.nextLine(); // Consume the newline character

			if (opcionUsuario == 1) {
				// Add a new user
				System.out.println("Inserte el nombre del nuevo usuario:");
				String nombreUsuario = sc.nextLine();
				System.out.println("Inserte el DNI del nuevo usuario:");
				String nuevoDniUsuario = sc.nextLine();

				Usuario nuevoUsuario = new Usuario(nombreUsuario, nuevoDniUsuario);
				usuarios.add(nuevoUsuario);
				System.out.println("Usuario añadido correctamente.");
				usuarioEncontrado = nuevoUsuario; // Set the new user as the found user
			} else {
				System.out.println("Operación cancelada.");
				return;
			}
		}

		// At this point, usuarioEncontrado is either an existing user or a newly added
		// user
		// Proceed with lending the book
		System.out.println("Inserte el título del libro que desea prestar:");
		String tituloLibro = sc.nextLine();

		// Find the book in the library
		Libro libroEncontrado = null;
		for (Libro libro : Libros) {
			if (libro.getTitulo().equalsIgnoreCase(tituloLibro)) {
				libroEncontrado = libro;
				break;
			}
		}

		if (libroEncontrado == null) {
			System.out.println("El libro no existe en la biblioteca.");
			return;
		}

		// Check if the book is a physical book (only physical books can be lent)
		if (libroEncontrado instanceof LibroFisico) {
			LibroFisico libroFisico = (LibroFisico) libroEncontrado;
			if (libroFisico.Ejemplares > 0) {
				// Lend the book
				usuarioEncontrado.LibrosPrestados.add(libroFisico);
				libroFisico.Ejemplares--; // Decrease the number of available copies
				System.out.println("Libro prestado correctamente a " + usuarioEncontrado.getNombre());
			} else {
				System.out.println("No hay ejemplares disponibles de este libro.");
			}
		} else {
			System.out.println("Solo se pueden prestar libros físicos.");
		}
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
