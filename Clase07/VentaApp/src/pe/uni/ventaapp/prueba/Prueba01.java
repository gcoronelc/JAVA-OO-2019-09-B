package pe.uni.ventaapp.prueba;

import pe.uni.ventaapp.dto.ConceptoDto;
import pe.uni.ventaapp.service.BoletaService;
import pe.uni.ventaapp.service.CompAbstract;
import pe.uni.ventaapp.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		double total = 6789.12;
		// Proceso
		CompAbstract service = new BoletaService();
		ConceptoDto[] repo = service.procesar(total);
		// Reporte
		for (ConceptoDto dto : repo) {
			System.out.println(dto);
		}
	}
		
}
