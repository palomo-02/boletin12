package repasoExamenEj2;

import java.util.*;

public class Evento implements Comparable <Evento> {
	String nombre;
	String fecha;
	int aforo;

	protected ArrayList<Participantes> ListaParticipantes;
	
	
	
	public Evento(String nombre, String fecha, int aforo) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.aforo = aforo;
		ListaParticipantes = new ArrayList<Participantes>();
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public int getAforo() {
		return aforo;
	}



	public void setAforo(int aforo) {
		this.aforo = aforo;
	}



	public ArrayList<Participantes> getListaParticipantes() {
		return ListaParticipantes;
	}



	public void setListaParticipantes(ArrayList<Participantes> listaParticipantes) {
		ListaParticipantes = listaParticipantes;
	}



	@Override
	public String toString() {
		return "Evento [nombre=" + nombre + ", fecha=" + fecha + ", aforo=" + aforo + ", ListaParticipantes="
				+ ListaParticipantes + "]";
	}




		
		
	 public int compareTo(Evento otro) {
	        return this.nombre.compareToIgnoreCase(otro.nombre);
	    }
		
		
	}


