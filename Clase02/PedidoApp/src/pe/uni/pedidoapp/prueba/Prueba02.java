package pe.uni.pedidoapp.prueba;

import pe.uni.pedidoapp.service.PedidoService;

public class Prueba02 {

	public static void main(String[] args) {
		// Variables
		double importe, impuesto, total;
		// Dato
		importe = 5678.34;
		// Proceso
		PedidoService service = new PedidoService();
		impuesto = service.calcularImpuesto(importe);
		total = service.calcularTotal(importe);
		// Reporte
		System.out.println("Importe: " + importe);
		System.out.println("Impuesto: " + impuesto);
		System.out.println("Total: " + total);
	}
	
}
