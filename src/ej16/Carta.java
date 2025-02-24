package ej16;

import java.util.Objects;

public class Carta implements Comparable<Carta> {

	private static String palos[] = { "espadas", "oros", "bastos", "copas" };
	private static String numero[] = { "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey" };

	private String palo;
	private String numCar;

	public Carta() {

		this.palo = palos[(int) (Math.random() * 4)];
		this.numCar = numero[(int) (Math.random() * 9)];

	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getNumCar() {
		return numCar;
	}

	public void setNumCar(String numCar) {
		this.numCar = numCar;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numCar=" + numCar + "]";
	}
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Carta carta = (Carta) obj;
	        return Objects.equals(palo, carta.palo) && Objects.equals(numCar, carta.numCar);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(palo, numCar);
	    }

	    @Override
	    public int compareTo(Carta otra) {
	        return this.numCar.compareTo(otra.numCar);
	}
}

