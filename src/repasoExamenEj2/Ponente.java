package repasoExamenEj2;

public class Ponente extends Participantes {

	
	String charla;
	public Ponente(String dni, String nombre, int edad,String charla) {
		super(dni, nombre, edad);
		
		this.charla=charla;
	}

}
