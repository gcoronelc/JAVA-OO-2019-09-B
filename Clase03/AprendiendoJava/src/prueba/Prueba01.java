package prueba;

import dto.ProductoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		ProductoDto dto = new ProductoDto();
		
		dto.setCodigo(1000);
		dto.setNombre("Coca Cola");
		dto.setPrecio(5.0);
		dto.setActivo(false);
		
		System.out.println("Codigo: " + dto.getCodigo());
		System.out.println("Nombre: " + dto.getNombre());
		System.out.println("Precio: " + dto.getPrecio());
		System.out.println("Activo: " + dto.isActivo());
		
		
	}
	
}
