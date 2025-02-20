package booletin12;

import java.util.ArrayList;
import java.util.List;

public class EJ1 {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Robert");
		lista.add("Manu1");
		lista.add("Manu2");
		lista.add("Ana");
		lista.add("Teresa");
		lista.add("Jose carlos");

		for (String list : lista) {
			System.out.print(list + " ");

		}
	}

}
