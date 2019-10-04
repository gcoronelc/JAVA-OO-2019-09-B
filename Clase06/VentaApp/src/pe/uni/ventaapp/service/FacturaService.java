package pe.uni.ventaapp.service;

import pe.uni.ventaapp.dto.ConceptoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class FacturaService extends CompAbstract{

	@Override
	public ConceptoDto[] procesar(double total) {
		// Variables
		double importe, impuesto, servicio, totalGeneral;
		// Proceso
		importe = total / 1.18;
		impuesto = total - importe;
		servicio = total * 0.10;
		totalGeneral = total + servicio;
		// Reporte
		ConceptoDto[] repo = {
			 new ConceptoDto("Importe", importe),
			 new ConceptoDto("Impuesto", impuesto),
			 new ConceptoDto("Total", total),
			 new ConceptoDto("Servicio", servicio),
			 new ConceptoDto("Total General", totalGeneral),
		};
		return repo;
	}

	
	
}
