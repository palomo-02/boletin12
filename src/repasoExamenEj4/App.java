
	package repasoExamenEj4;

	import java.util.*;


	public class App {
		private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
		private static ArrayList<Conductores> conductores = new ArrayList<>();

		public static void main(String[] args) {
			var sc = new Scanner(System.in);

			int opcion = 0;

			do {

				MostrarMenu();

				opcion = sc.nextInt();
				sc.nextLine();
				switch (opcion) {

				case 1:
					Registrarvehículo(sc);

					break;

				case 2:
					Borrarvehículo(sc);
					break;
				case 3:
					BuscarPorMatrícula(sc);
					break;
				case 4:

					ListadoPorOrdenAlfabetico();

					break;
				case 5:
					ListadoPorOrdenFecha();
					break;
				case 6:

					AsignarVehiculo(sc);

					break;

				case 7:
					System.out.println("SALIENDO...");
					break;
				default:
					System.out.println("numero introducido incorrecto, pruebe de nuevo ");
				}

			} while (opcion != 7);

			sc.close();

		}

		private static void AsignarVehiculo(Scanner sc) {

			if (vehiculos.isEmpty()) {

				System.out.println("no hay vegiculos registrados");
			} else {

				System.out.println("elija si quiere añadir un usuario o rentar un coche con un ususario ya existente");
				System.out.println("1. Crear usuario 2.Usar uno ya existente");

				int opcionUsuario = sc.nextInt();

				switch (opcionUsuario) {

				case 1:

					System.out.println("añada un dni ");
					String dni = sc.nextLine();

					System.out.println("añada un nombre ");
					String nombre = sc.nextLine();

					conductores.add(new Conductores(nombre, dni));

					break;
				case 2:

					System.out.println("escriba Su dni ");

					String dniBuscar = sc.nextLine();

					for (int j = 0; j < conductores.size(); j++) {

						if (conductores.get(j).getDni().equalsIgnoreCase(dniBuscar)) {

							System.out.println("seleccione la matricula del vehiculo ");
							String MatreiculaSacar = sc.nextLine();

							for (int i = 0; i < vehiculos.size(); i++) {
								if (vehiculos.get(i).getMatrícula().equals(MatreiculaSacar)) {

									conductores.get(j).getVehiculos().add(vehiculos.get(i));

								}
							}

						} else {

							System.out.println("DNI no encontrado");

							return;
						}

					}

					break;
				default:
					System.out.println("introduzca un numero correcto ");

				}

			}

		}

		private static void ListadoPorOrdenFecha() {

			if (vehiculos.isEmpty()) {

				System.out.println("no hay ningun vehiculo registrado ");
			} else {

				vehiculos.sort(new ListaPorFecha());
				for (Vehiculo vehiculo : vehiculos) {
					System.out.println(vehiculo);
				}

			}
		}

		private static void ListadoPorOrdenAlfabetico() {

			if (vehiculos.isEmpty()) {

				System.out.println("no hay ningun vehiculo registrado ");
			} else {

				Collections.sort(vehiculos);

				for (Vehiculo vehiculo : vehiculos) {
					System.out.println(vehiculo);
				}

			}

		}

		private static void BuscarPorMatrícula(Scanner sc) {

			if (vehiculos.isEmpty()) {

				System.out.println("no hay ningun vehiculo registrado ");
			} else {

				System.out.println("Inserte la matricula que desea buscar ");

				String MatriculaBuscar = sc.nextLine();

				for (int i = 0; i < vehiculos.size(); i++) {
					if (vehiculos.get(i).getMatrícula().equals(MatriculaBuscar)) {

						System.out.println(
								"Los Datos del Vehiculo con Matricula: " + vehiculos.get(i).getMatrícula() + " son:");

						System.out.println(vehiculos.get(i));

					}
				}

			}

		}

		private static void Borrarvehículo(Scanner sc) {

			if (vehiculos.isEmpty()) {

				System.out.println("no hay ningun vehiculo registrado ");
			} else {

				System.out.println("seleccione la matricula del vehiculo que desa eliminar");

				String MatriculaEliminar = sc.nextLine();

				for (int i = 0; i < vehiculos.size(); i++) {

					if (vehiculos.get(i).getMatrícula().equalsIgnoreCase(MatriculaEliminar)) {

						System.out.println("Va a eliminar el vehiculo matriculado: " + vehiculos.get(i).getMatrícula()
								+ "¿Está seguro? ");
						System.out.println("1.Si 2.No");
						int deciosionFinal = sc.nextInt();

						if (deciosionFinal == 1) {

							vehiculos.remove(i);

							System.out.println("eliminacion realizada ");

						} else {

							System.out.println("eliminacion cancelada ");
							return;

						}

					}

				}

			}

		}

		private static void Registrarvehículo(Scanner sc) {

			System.out.println("Inserte la Matricula del vehiculo ");
			String matricula = sc.nextLine();

			System.out.println("Inserte la marca del vehiculo ");
			String marca = sc.nextLine();

			System.out.println("Inserte el modelo del vehiculo ");
			String modelo = sc.nextLine();

			System.out.println("Inserte el año del vehiculo ");
			int año = sc.nextInt();

			System.out.println("EL vehiculo a registrar es 1.Coche  2. Moto");
			int eleccionVehiculo = sc.nextInt();

			switch (eleccionVehiculo) {

			case 1:

				System.out.println("seleccione el numero de plazas que tiene el coche ");
				int nPlazas = sc.nextInt();

				vehiculos.add(new Coche(marca, modelo, año, matricula, nPlazas));

				break;

			case 2:
				System.out.println("Seleccione la cilindrada de la moto");

				int cilindrada = sc.nextInt();

				vehiculos.add(new Moto(marca, modelo, año, matricula, cilindrada));

			}

		}

		private static void MostrarMenu() {
			System.out.println("1. registrar vehiculos");
			System.out.println("2. borrar vehiculos");
			System.out.println("3. Buscar por matricula");
			System.out.println("4. Listar alfabeticamente    ");
			System.out.println("5. Listar Por fecha de forma descendente");
			System.out.println("6. Asignar un vehiculo  ");
			System.out.println("7. Salir  ");

		}
	}


