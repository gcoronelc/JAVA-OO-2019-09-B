package prueba;

import dto.ProductoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		
		ProductoDto dto = new ProductoDto();
		
		System.out.println("Codigo: " + dto.getCodigo());
		System.out.println("Nombre: " + dto.getNombre());
		System.out.println("Precio: " + dto.getPrecio());
		System.out.println("Activo: " + dto.isActivo());
		
	}
	
}
