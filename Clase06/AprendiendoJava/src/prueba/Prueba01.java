package prueba;

import service.Clase3;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		//Clase1 obj = new Clase3();
		//Clase2 obj = new Clase3();
		Clase3 obj = new Clase3();
		
		System.out.println("Impuesto: " + obj.calcImpuesto(1000));
		System.out.println("Total: " + obj.calcTotal(1000));
		System.out.println("Saludo: " + obj.saludo("Gustavo"));
		
	}
	
}
