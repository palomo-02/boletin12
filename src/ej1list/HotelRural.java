package ej1list;

public class HotelRural extends Alojamiento {

	
	
	private int categoria;

	
	
	public HotelRural(String nombre, int referencia, String direccion, int npersonas, int precio, int categoria) {
		super(nombre, referencia, direccion, npersonas, precio);
this.categoria=  categoria;	}



	@Override
	public String toString() {
		return "HotelRural [categoria=" + categoria + "]";
	}
	
	
	
	
	

}
