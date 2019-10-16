package pe.uni.ventaapp.exceptions;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class ValorVentaException extends Exception{

	public ValorVentaException() {
		super("Valor de la venta debe ser positivo.");
	}

	public ValorVentaException(String mensaje) {
		super( mensaje );
	}

}
