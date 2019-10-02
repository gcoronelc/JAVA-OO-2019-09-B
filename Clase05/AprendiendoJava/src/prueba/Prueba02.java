package prueba;

import model.Factura;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		
		Factura fact1 = new Factura(100,50,200);
		Factura fact2 = new Factura(345,76,236);
		Factura fact3 = new Factura(657,12,657);
		
		System.out.println(fact1);
		System.out.println(fact2);
		System.out.println(fact3);
		
		fact1.cambiarIGV(5678);
		
		System.out.println(fact1);
		System.out.println(fact2);
		System.out.println(fact3);
		
	}
	
}
