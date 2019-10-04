package service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Clase1 {

	
	public Clase1() {
		System.out.println("Hola desde Clase1.");
	}
	
	public Clase1(String nombre) {
		System.out.println("Hola " + nombre + " desde Clase1.");
	}
	
	public double calcImpuesto( double importe){
		double impuesto;
		impuesto = importe * 0.18;
		return impuesto;
	}
	
	
}
