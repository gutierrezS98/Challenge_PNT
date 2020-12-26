package practica;

public class Gaseosa extends Producto {
	private double litros;

	public Gaseosa(String nombre, int precio,double litros) {
		super(nombre,precio);
		this.litros=litros;
	}
	
	public double getLitros() {
		return this.litros;
	}

	@Override
	public String toString() {
		String descripcion= "Nombre: " + this.getNombre() + " /// Litros: " + this.getLitros() +
				" /// Precio: $" + this.getPrecio();
		return descripcion;
	}
}
