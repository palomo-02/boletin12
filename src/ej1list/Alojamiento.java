package ej1list;

public class Alojamiento {

	
	
	private String nombre;
	private int referencia;
	private String direccion;
	private int Npersonas;
	private int precio;
	
	
	
	public Alojamiento(String nombre, int referencia, String direccion, int npersonas, int precio) {
		this.nombre = nombre;
		this.referencia = referencia;
		this.direccion = direccion;
		Npersonas = npersonas;
		this.precio = precio;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getReferencia() {
		return referencia;
	}



	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public int getNpersonas() {
		return Npersonas;
	}



	public void setNpersonas(int npersonas) {
		Npersonas = npersonas;
	}



	public int getPrecio() {
		return precio;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Alojamiento [nombre=" + nombre + ", referencia=" + referencia + ", direccion=" + direccion
				+ ", Npersonas=" + Npersonas + ", precio=" + precio + "]";
	}
	
	
	

	
	
	
	
	
	
	
	
	
}
