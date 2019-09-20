/**
 * Desarrollar un programa para calcular
 * el factorial de un número.
 */

package pruebas;

import java.util.Scanner;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		// Variables
		int numero;
		long factorial;
		// Leer datos
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingreso número: ");
		numero = scanner.nextInt();
		// Proceso
		factorial = 1; // Punto de partida
		for (int i = 2; i <= numero; i++) {
			factorial *= i;	// factorial = factorial * i;		
		}
		// Reporte
		System.out.println("Número: " + numero);
		System.out.println("Factorial: " + factorial);
	}
}
