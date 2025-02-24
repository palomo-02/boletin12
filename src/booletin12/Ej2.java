package booletin12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();

		int numero = 0;
		do {

			System.out.println("añada numeros enteros no negativos");
			numero = sc.nextInt();
			if (numero >= 0) {

				lista.add(numero);
			} else if (numero < 0 && numero != -1) {

				System.out.println("ha introducido un numeor ivalido");
				System.out.println("prueba de nuevo");

				numero = sc.nextInt();

			}

		} while (numero != -1);

		System.out.println("ha añadido -1 slaiendo del programa...");

		System.out.println(lista);
		
		
		 System.out.println("\nValores pares en la colección:");
	        for (Integer num : lista) {
	            if (num % 2 == 0) {
	                System.out.println(num + " ");
	            }
	        }		
		
	        Iterator<Integer> iterator = lista.iterator();
	        while (iterator.hasNext()) {
	            if (iterator.next() % 3 == 0) {
	                iterator.remove();
	            }
	        }

		System.out.println("sin multiplos de 3");
		System.out.println(lista);
		sc.close();

	}

}
