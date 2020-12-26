package practica;

public abstract class Producto implements Comparable<Producto> {
	private String nombre;
	private int precio;
	
	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Integer getPrecio() {
		return this.precio;
	}

	@Override
	public int compareTo(Producto producto) {
		return this.getPrecio() - producto.getPrecio();
	}
	
	public abstract String toString();
	
}
