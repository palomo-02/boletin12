package repasoExamenEj3;

import java.util.*;


public class Usuario {

	String nombre;
	int dni;
	String gmail;
	
	
	
	protected Set<LibroFisico> LibrosPrestados;

	public Usuario(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
		
		LibrosPrestados = new HashSet<LibroFisico>();

		
		
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
	
	
	
	
	
}
