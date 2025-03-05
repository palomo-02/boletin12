package repasoExamenEj3;

import java.util.*;


public class Usuario {

	String nombre;
	String dni;
	String gmail;
	
	
	
	protected Set<LibroFisico> LibrosPrestados;

	public Usuario(String nombre, String dni) {
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
	public String getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
	
	
	
	
	
}
