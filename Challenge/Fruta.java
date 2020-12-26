package practica;

public class Fruta extends Producto{
	private String unidadVenta;

	public Fruta(String nombre, int precio, String unidadVenta) {
		super(nombre, precio);
		this.unidadVenta=unidadVenta;
	}
	
	public String getUnidadVenta() {
		return this.unidadVenta;
	}
	
	public String toString() {
		String descripcion="Nombre: "+ this.getNombre() + " /// Precio: $" + this.getPrecio() + 
				" /// Unidad de venta: " + this.getUnidadVenta();
		return descripcion;
	}
}
