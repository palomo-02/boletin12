package repasoExamenEj4;

import java.util.*;

public class Conductores {

	String dni;
	String nombre;
	protected List<Vehiculo> vehiculos;

	public Conductores(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;

		this.vehiculos = new ArrayList<>();
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

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "Conductores [dni=" + dni + ", nombre=" + nombre + ", vehiculos=" + vehiculos + "]";
	}

}
