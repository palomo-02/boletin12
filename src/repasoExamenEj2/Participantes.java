package repasoExamenEj2;

public class Participantes {

	String dni;
	String nombre;
	int edad;

	public Participantes(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Participantes [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

}
