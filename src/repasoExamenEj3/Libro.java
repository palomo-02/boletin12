package repasoExamenEj3;

public class Libro implements Comparable<Libro> {

	String titulo;
	String autor;
	String fechaPublicacion;
	
	
	public Libro(String titulo, String autor, String fechaPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
	}


	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}


	/**
	 * @return the fechaPublicacion
	 */
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}


	/**
	 * @param fechaPublicacion the fechaPublicacion to set
	 */
	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}


	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion + "]";
	}


	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
        return this.titulo.compareToIgnoreCase(o.titulo);
	}
	
	
	
	
	
}
