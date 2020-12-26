package practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Producto> listaProductos= new ArrayList<Producto>();
		Producto gaseosa= new Gaseosa("Coca-Cola Zero", 20, 1.5);
		Producto gaseosa2= new Gaseosa("Coca-Cola",18,1.5);
		Producto shampoo=new Capilar("Shampoo Sedal",19,500);
		Producto fruta=new Fruta("Frutillas",64,"kilo");
		listaProductos.add(gaseosa);
		listaProductos.add(gaseosa2);
		listaProductos.add(shampoo);
		listaProductos.add(fruta);
		
		Collections.sort(listaProductos);
		
		System.out.println(gaseosa.toString());
		System.out.println(gaseosa2.toString());
		System.out.println(shampoo.toString());
		System.out.println(fruta.toString());
		System.out.println("=============================");
		System.out.println("Producto mas caro: " + listaProductos.get(listaProductos.size() - 1).getNombre());
		System.out.println("Producto mas barato: " + listaProductos.get(0).getNombre());
		
	}

}
