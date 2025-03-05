package repasoExamenEj3;

public class LibroDigital extends Libro {

	String enlace;

	public LibroDigital(String titulo, String autor,String fechaPublicacion, String enlace) {
		super(titulo, autor, fechaPublicacion);
		this.enlace = enlace;
	}

}
