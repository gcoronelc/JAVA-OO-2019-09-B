package prueba;

import model.Producto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba03 {

	public static void main(String[] args) {
		
		Producto prod1 = new Producto();
		System.out.println("Nombre: " + prod1.getNombre());
		System.out.println("Precio: " + prod1.getPrecio());
		
		Producto prod2 = new Producto("Inka Kola", 5);
		System.out.println("Nombre: " + prod2.getNombre());
		System.out.println("Precio: " + prod2.getPrecio());
		
		
	}
	
}
