package repasoExamenEj2;

import java.util.*;

/**
 * @author usuarioDAM
 * @since 03/25
 * @version 1.0
 */

public class App {

	private static ArrayList<Evento> evento = new ArrayList<>();

	/**
	 * @param args
	 * 
	 * Metodo main por el que se llaman a los metodos 
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
				AltaEvento(sc);
				break;
			case 2:
				BajaEvento(sc);
				break;
			case 3:
				ModificarEvento(sc);
				break;
			case 4:
				AltaParticipante(sc);
				break;
			case 5:
				ListadoAlfabetico();
				break;
			case 6:
				ListadoPorfecha();
				break;
			case 7:
				AñadircharlaPonente(sc);
				break;
			case 8:
				System.out.println("saliendo... ");
				break;
			default:
				System.out.println("numero incorrecto, pruebe de nuevo");
			}

		} while (opcion != 8);

		sc.close();

	}

	private static void AñadircharlaPonente(Scanner sc) {

		System.out.println("no sehacejeej");
		return;
	}

	/**
	 * Lista por la fecha del evento
	 */

	private static void ListadoPorfecha() {

		if (evento.isEmpty()) {

			System.out.println("no hay eventos programados");
			return;

		}
		evento.sort(new CompararPorFecha());
for (Evento evento2 : evento) {
	System.out.println(evento2);

}
	}

	/**
	 * Lista por orden alfabetico del evento
	 */

	private static void ListadoAlfabetico() {
		if (evento.isEmpty()) {
			System.out.println("No hay eventos programados.");
			return;
		}
		Collections.sort(evento);
for (Evento evento2 : evento) {
	System.out.println(evento2);
}	}

	/**
	 * Dar de alta a un participante en el evento a elegir
	 */
	private static void AltaParticipante(Scanner sc) {

		if (evento.isEmpty()) {

			System.out.println("no hay ningun evento programado");

		} else {
			System.out.println("Diga el nombre del evento al que quiere añadir el participante ");
			String EventoAñadir = sc.nextLine();

			for (int i = 0; i < evento.size(); i++) {

				if (evento.get(i).getNombre().equalsIgnoreCase(EventoAñadir)) {

					System.out.println("DATOS DEL PARTICIPANTE: ");
					System.out.println("Inserte el dni del participante");

					String dni = sc.nextLine();

					System.out.println("Inserte el nombre del participante");

					String nombre = sc.nextLine();
					System.out.println("Inserte la edad del participante");

					int edad = sc.nextInt();

					System.out.println("elija si es de tipo 1.ponente 2.Asistente general");
					int decisionParticipante = sc.nextInt();
					sc.nextLine();

					switch (decisionParticipante) {

					case 1:

						System.out.println("Ha elegido que el perticipante sea un ponente");

						System.out.println("Inserte la charla que va a realizar: ");

						String charla = sc.nextLine();
						evento.get(i).getListaParticipantes().add(new Ponente(dni, nombre, edad, charla));

						break;
					case 2:

						System.out.println("Ha elegido que el perticipante sea un perfil general");
						evento.get(i).getListaParticipantes().add(new AsistenteGeneral(dni, nombre, edad));

						break;
					default:

					}

				}

			}

		}

	}
	/**
	 * Modificar los elementos de un evento
	 */
	private static void ModificarEvento(Scanner sc) {

		if (evento.isEmpty()) {

			System.out.println("No hay ingun evento programado");

		} else {

			System.out.println("Diga el nombre del evento que quiere modificar ");
			String nombreModificar = sc.nextLine();

			for (int i = 0; i < evento.size(); i++) {

				if (evento.get(i).getNombre().equalsIgnoreCase(nombreModificar)) {

					System.out.println("elija que quiere modificar 1.nombre , 2.fecha, 3.aforo");

					int eleccionModificar = sc.nextInt();

					switch (eleccionModificar) {

					case 1:

						System.out.println("escriba el nuevo nombre: ");
						String NuevoNombre = sc.nextLine();

						evento.get(i).setNombre(NuevoNombre);
						;

						System.out.println("nombre cambiado con exito");

						break;
					case 2:

						System.out.println("escriba la nueva fecha ");
						String NuevaFecha = sc.nextLine();

						evento.get(i).setFecha(NuevaFecha);
						;
						System.out.println("fecha cambiado con exito");

						break;
					case 3:

						System.out.println("escriba el nuevo aforo ");
						int NuevoAforo = sc.nextInt();
						evento.get(i).setAforo(NuevoAforo);
						;
						System.out.println("aforo cambiado con exito");

						break;
					default:
						System.out.println("inserte un numero correcto");

					}

				}

			}
		}
	}
	/**
	 * Eliminar un evento de la lista
	 */
	private static void BajaEvento(Scanner sc) {

		if (evento.isEmpty()) {

			System.out.println("No hay ningun evento programado");

		} else {

			System.out.println("Diga el nombre del evento que quiere eliminar ");
			String nombreBorrar = sc.nextLine();

			for (int i = 0; i < evento.size(); i++) {

				if (evento.get(i).getNombre().equalsIgnoreCase(nombreBorrar)) {

					evento.remove(i);

				}

				System.out.println("evento eliminado con exito");
			}
		}
	}
	/**
	 * Crear un evento, con sus caracteristicas
	 */
	private static void AltaEvento(Scanner sc) {
		System.out.println("Que nombre tiene el evento? ");
		String nombreEvento = sc.nextLine();

		System.out.println("En que fecha se realiza? ");
		String fechaEvento = sc.nextLine();

		System.out.println("Cual es su aforo? ");
		int aforo = sc.nextInt();

		System.out.println("elija si es de tipo 1.conferencia ó 2.taller");
		int decision = sc.nextInt();
		sc.nextLine();
		switch (decision) {

		case 1:

			System.out.println("ha elegido dar de alta una conferencia, elija un tema");
			String tema = sc.nextLine();

			evento.add((new Conferencia(nombreEvento, fechaEvento, aforo, tema)));

			break;

		case 2:
			System.out.println("ha elejido dar de alta una Taller, elija el nombre del instructor");
			String instructor = sc.nextLine();

			evento.add((new Taller(nombreEvento, fechaEvento, aforo, instructor)));

			break;
		}

	}
	/**
	 * Muestra el menu 
	 */
	private static void MostrarMenu() {

		System.out.println("1. Alta evento");
		System.out.println("2. Baja eventon");
		System.out.println("3. Modificación evento");
		System.out.println("4. Alta participante");
		System.out.println("5. Listado alfabético de los eventos");
		System.out.println("6. Listado por fecha de los eventos");
		System.out.println("7. Añadir charla ponente");
		System.out.println("8. salir");

	}
}
