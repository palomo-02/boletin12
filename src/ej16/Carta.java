package ej16;


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
	public int compareTo(Carta c) {
		
		
		if(palo.equals(c.getPalo())) {
			
			
			return numCar.compareTo(c.getNumCar());
		}else {
			
			return palo.compareTo(c.getPalo());
			
			
		}
		
		
		
		
		
		
		
	}
}

