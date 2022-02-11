
public class Libro implements Comparable<Libro>{
	
private String isbn;
	private double precio;
	private String titulo;
	private int cantidad;
	
	public Libro(String titulo, String isbn, double precio, int cantidad) {  
	this.titulo = titulo;
	this.cantidad = cantidad;
	this.precio = precio;
	this.isbn = isbn; 
	
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Libro l = (Libro)obj;
		return this.isbn.equals(l.isbn);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.isbn + " - " + this.titulo + " - " + this.cantidad + " - " + this.precio;
	}


	@Override
	public int compareTo(Libro l) {
		return this.cantidad - l.getCantidad();
	}
}
