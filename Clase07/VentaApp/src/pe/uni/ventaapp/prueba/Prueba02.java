package pe.uni.ventaapp.prueba;

import pe.uni.ventaapp.dto.ConceptoDto;
import pe.uni.ventaapp.service.CompAbstract;
import pe.uni.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		// Variables
		double total = 6789.12;
		// Proceso
		ConceptoDto[] repo;
		CompAbstract service = CompFactory.getComp(CompFactory.COMP_FACTURA);
		repo = service.procesar(total);
		// Reporte
		for (ConceptoDto dto : repo) {
			System.out.println(dto);
		}
	}
		
}
