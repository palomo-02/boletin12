package Ej21;

public class Club {

	private String nombre;
	private int fecha;

	public Club(String nombre, int fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", fecha=" + fecha + "]";
	}

}
