package repasoExamenEj3;

import java.util.Comparator;

public class Listarporfecha implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {

        return o1.getFechaPublicacion().compareTo(o2.getFechaPublicacion()); // Comparación correcta si las fechas son "YYYY-MM-DD"

	
	
	
	
	}

}
