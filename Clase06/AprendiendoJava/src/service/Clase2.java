package service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Clase2 extends Clase1{

	public Clase2() {
		super("Laura");
		System.out.println("Hola desde Clase2");
		System.out.println("Impuesto: " + super.calcImpuesto(5000) );
	}
		

	@Override
	public double calcImpuesto(double importe) {
		double impuesto;
		impuesto = importe * 0.20;
		return impuesto;
	}

	
	public double calcTotal(double importe){
		double total;
		total = importe + calcImpuesto(importe);
		return total;
	}
	
	
}
