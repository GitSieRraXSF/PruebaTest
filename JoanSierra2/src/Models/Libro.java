package Models;

public class Libro {
	
	private String Titulo, Autor;
	private int Fecha;
	private long ISBN;
	private boolean Disponible;
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getFecha() {
		return Fecha;
	}
	public void setFecha(int fecha) {
		Fecha = fecha;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public boolean isDisponible() {
		return Disponible;
	}
	public void setDisponible(boolean disponible) {
		Disponible = disponible;
	}
	
	public Libro(String titulo, String autor, int fecha, long iSBN, boolean disponible) {
		Titulo = titulo;
		Autor = autor;
		Fecha = fecha;
		ISBN = iSBN;
		Disponible = disponible;
	}
	@Override
	public String toString() {
		return "Libro [Titulo=" + Titulo + ", Autor=" + Autor + ", Fecha=" + Fecha + ", ISBN=" + ISBN + ", Disponible="
				+ Disponible + "]";
	}
	
	public void MostrarLibro() {
		System.out.println(toString());
	}
}