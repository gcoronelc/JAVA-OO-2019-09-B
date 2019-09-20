package pe.uni.pedidoapp.prueba;

import pe.uni.pedidoapp.service.PedidoService;

public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		double importe, impuesto;
		// Dato
		importe = 5678.34;
		// Proceso
		PedidoService service = new PedidoService();
		impuesto = service.calcularImpuesto(importe);
		// Reporte
		System.out.println("Importe: " + importe);
		System.out.println("Impuesto: " + impuesto);
	}
	
}
