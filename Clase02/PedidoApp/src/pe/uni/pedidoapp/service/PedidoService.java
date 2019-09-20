package pe.uni.pedidoapp.service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class PedidoService {
	
	public double calcularImpuesto( double importe ){
		// Variables
		double impuesto;
		// Proceso
		impuesto = importe * 0.18;
		// Reporte
		return impuesto;
	}

	public double calcularTotal( double importe ){
		// Variables
		double impuesto, total;
		// Proceso
		impuesto = calcularImpuesto(importe);
		total = importe + impuesto;
		// Reporte
		return total;
	}
	
}
