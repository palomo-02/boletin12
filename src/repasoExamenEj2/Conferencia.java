package repasoExamenEj2;

public class Conferencia extends Evento {
	String tema;

	public Conferencia(String nombre, String fecha, int aforo, String tema) {
		super(nombre, fecha, aforo);
		this.tema = tema;
	}

}
