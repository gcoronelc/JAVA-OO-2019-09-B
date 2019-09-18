/**
 * EJERCICIO 01
 * Desarrollar un programa para encontrar 
 * importe de una venta.
 */
package aprendiendojava.secuenciales;

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
		double precio, importe, impuesto, total;
		int cantidad;
		// Datos
		Scanner scanner = new Scanner(System.in);
		System.out.print("Precio: ");
		precio = scanner.nextDouble();
		System.out.print("Cantidad: ");
		cantidad = scanner.nextInt();
		// Proceso
		total = precio * cantidad;
		importe = total / 1.18;
		impuesto = total - importe;
		// Reporte
		System.out.println("Importe: " + importe);
		System.out.println("Impuesto: " + impuesto);
		System.out.println("Total: " + total);
	}
	
	
}
