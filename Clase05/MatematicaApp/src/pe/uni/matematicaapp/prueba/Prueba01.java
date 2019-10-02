package pe.uni.matematicaapp.prueba;

import pe.uni.matematicaapp.service.MyMath;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		int n;
		String serie;
		// Datos
		n = 8;
		// Proceso
		serie = MyMath.fibonacci(n);
		// Reporte
		System.out.println("N = " + n);
		System.out.println("Serie = " + serie);
	}
	
}
