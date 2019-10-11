package prueba;

import service.impl.CrudClientes;
import service.spec.CrudProductos;
import service.spec.CrudSpec;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		CrudSpec crud = new CrudProductos();
		crud.insertar();
	}
	
}
