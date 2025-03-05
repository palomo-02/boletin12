package repasoExamenEj4;

public class Coche extends Vehiculo {

	int nPuertas;

	public Coche(String marca, String modelo, int año, String matrícula, int nPuertas) {
		super(marca, modelo, año, matrícula);
		this.nPuertas = nPuertas;
	}

	/**
	 * @return the nPuertas
	 */
	public int getnPuertas() {
		return nPuertas;
	}

	/**
	 * @param nPuertas the nPuertas to set
	 */
	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	@Override
	public String toString() {
		return "Coche [nPuertas=" + nPuertas + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año
				+ ", matrícula=" + matrícula + "]";
	}

}
