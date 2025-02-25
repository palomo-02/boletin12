package Ej22;

public class Tienda {

	
	private int Codigo;
private String nombre;
private int Stock;

	public Tienda(int codigo, String nombre, int stock) {
	Codigo = codigo;
	this.nombre = nombre;
	Stock = stock;
}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	@Override
	public String toString() {
		return "Tienda [Codigo=" + Codigo + "]";
	}
	
	
	
	
	
	
	
	
}
