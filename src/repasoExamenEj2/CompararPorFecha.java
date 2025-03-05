package repasoExamenEj2;

import java.util.Comparator;

/** 
 * @author usuarioDAM
 * @since 03/25
 * @version 1.0
 */

public class CompararPorFecha implements Comparator<Evento> {
	
	public int compare(Evento e1, Evento e2) {
        return e1.getFecha().compareTo(e2.getFecha()); // Comparación correcta si las fechas son "YYYY-MM-DD"
    }
}
