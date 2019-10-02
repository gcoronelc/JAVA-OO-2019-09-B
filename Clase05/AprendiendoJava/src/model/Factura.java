package model;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Factura {

	public static double igv;
	public double importe;
	public double impuesto;
	public double total;

	static{
		igv = 0.18;
	}

	public Factura() {
	}

	public Factura(double importe, double impuesto, double total) {
		this.importe = importe;
		this.impuesto = impuesto;
		this.total = total;
	}

	@Override
	public String toString() {
		String repo = "---------------------\n";
		repo += "IGV: " + igv + "\n";
		repo += "Importe: " + importe + "\n";
		repo += "Impuesto: " + impuesto + "\n";
		repo += "Total: " + total + "\n";
		return repo;
	}
	
	
	public void cambiarIGV(double valor){
		igv = valor;
	}
	
}
