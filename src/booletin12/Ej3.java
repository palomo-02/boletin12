package booletin12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ej3 {

	public static void main(String[] args) {

	
	List<Integer> lista = new ArrayList<>();

	
	for (int i=0;i<20;i++) {
		
		lista.add((int)(Math.random() * 11));
		
	}
	
	System.out.println(lista);
	
    Set<Integer> listaSinRepetidos = new HashSet<>(lista);

	System.out.println(listaSinRepetidos);
 
	
	}
	
	
	
	
}
