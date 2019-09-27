package pe.edutec.prueba;

import pe.edutec.lib.Matematica;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		
		Matematica mat = new Matematica();
		System.out.println("1: " + mat.promediar(6, 8));
		System.out.println("2: " + mat.promediar(6, 8, 15));
		System.out.println("3: " + mat.promediar(6, 8, 15, 11));
		System.out.println("4: " + mat.promediar(6, 8, 15, 11, 17));
		
	}
	
}
