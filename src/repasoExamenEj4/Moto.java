package repasoExamenEj4;

public class Moto extends Vehiculo {

	int cilindradas;

	public Moto(String marca, String modelo, int año, String matrícula, int cilindradas ) {
		super(marca, modelo, año, matrícula);
		this.cilindradas = cilindradas;
	}

	/**
	 * @return the cilindradas
	 */
	public int getCilindradas() {
		return cilindradas;
	}

	/**
	 * @param cilindradas the cilindradas to set
	 */
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Moto [cilindradas=" + cilindradas + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año
				+ ", matrícula=" + matrícula + "]";
	}
	
	
	
	
	
	
	
	

}
