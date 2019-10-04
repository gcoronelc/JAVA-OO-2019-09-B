package pe.uni.ventaapp.service;

import pe.uni.ventaapp.dto.ConceptoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class BoletaService extends CompAbstract{

	@Override
	public ConceptoDto[] procesar(double total) {
		// Variables
		double  servicio, totalGeneral;
		// Proceso
		servicio = total * 0.10;
		totalGeneral = total + servicio;
		// Reporte
		ConceptoDto[] repo = {
			 new ConceptoDto("Total", total),
			 new ConceptoDto("Servicio", servicio),
			 new ConceptoDto("Total General", totalGeneral),
		};
		return repo;
	}

	
	
}
