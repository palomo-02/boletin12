package repasoExamenEj4;

import java.util.Comparator;

public class ListaPorFecha implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getAño(), o1.getAño());
	}

}
