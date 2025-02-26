package ej1list;

public class CasaRural extends Alojamiento{

	
	
	private int nHabitaciones;
	
	
	public CasaRural(String nombre, int referencia, String direccion, int npersonas, int precio, int nHabitaciones ) {
		super(nombre, referencia, direccion, npersonas, precio);
		this.nHabitaciones=nHabitaciones;
	}


	@Override
	public String toString() {
		return "CasaRural [nHabitaciones=" + nHabitaciones + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}
