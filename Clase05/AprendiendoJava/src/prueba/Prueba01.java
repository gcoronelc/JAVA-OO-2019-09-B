package prueba;

import model.Factura;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		Factura fact1 = new Factura(100,50,200);
		Factura fact2 = new Factura(345,76,236);
		Factura fact3 = new Factura(657,12,657);
		
		Factura.igv = 0.18;
		System.out.println(fact1);
		System.out.println(fact2);
		System.out.println(fact3);
		
		fact1.igv = 0.22;
		System.out.println(fact1);
		System.out.println(fact2);
		System.out.println(fact3);
		
	}
	
}
