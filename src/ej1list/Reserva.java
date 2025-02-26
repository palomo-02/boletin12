package ej1list;

public class Reserva {

	private int IdUnico;
	private int DNI;
	private Alojamiento alojamiento;
	private int dias;

	public Reserva(int idUnico, int dNI, Alojamiento alojamiento, int dias) {
		IdUnico = idUnico;
		DNI = dNI;
		this.alojamiento = alojamiento;
		this.dias = dias;
	}

	public int getIdUnico() {
		return IdUnico;
	}

	public void setIdUnico(int idUnico) {
		IdUnico = idUnico;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public Alojamiento getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(Alojamiento alojamiento) {
		this.alojamiento = alojamiento;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	@Override
	public String toString() {
		return "Reserva [IdUnico=" + IdUnico + ", DNI=" + DNI + ", alojamiento=" + alojamiento + ", dias=" + dias + "]";
	}

}
