package practica;

public class Capilar extends Producto{
	private int contenido;
	
	public Capilar(String nombre, int precio, int contenido) {
		super(nombre,precio);
		this.contenido=contenido;
	}
	
	public int getContenido(){
		return this.contenido;
	}

	@Override
	public String toString() {
		String descripcion= "Nombre: " + this.getNombre() + " /// Contenido: " + this.getContenido() +"ml"+ 
				" /// Precio: $" + this.getPrecio();
		return descripcion;
	}
}
