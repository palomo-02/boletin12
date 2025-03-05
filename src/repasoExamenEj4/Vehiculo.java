package repasoExamenEj4;

public class Vehiculo {

	String marca;
	String modelo;
	int año;
	
	 String  matrícula;

	public Vehiculo(String marca, String modelo, int año, String matrícula) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.matrícula = matrícula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the año
	 */
	public int getAño() {
		return año;
	}

	/**
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * @return the matrícula
	 */
	public String getMatrícula() {
		return matrícula;
	}

	/**
	 * @param matrícula the matrícula to set
	 */
	public void setMatrícula(String matrícula) {
		this.matrícula = matrícula;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", matrícula=" + matrícula + "]";
	}
	
	 
	 
	 
}
