/**
 * Ejercicio 02
 * Desarrollar un programa para calcular el 
 * promedio de un estudiante.
 * Son 4 notas y se elimina la menor.
 * Tambien debe determinar su estado, si el 
 * promedio es mayor o igual que 14, aprueba 
 * el curso.
 */
package aprendiendojava.condicionales;

import java.util.Scanner;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		// Variables
		int nota1, nota2, nota3, nota4, menor, promedio;
		String estado;
		// Datos
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nota 1: ");
		nota1 = scanner.nextInt();
		System.out.print("Nota 2: ");
		nota2 = scanner.nextInt();
		System.out.print("Nota 3: ");
		nota3 = scanner.nextInt();
		System.out.print("Nota 4: ");
		nota4 = scanner.nextInt();
		// Proceso
		// Paso 1: nota menor
		menor = nota1; // Punto de partida
		if( nota2 < menor ){
			menor = nota2;
		}
		if( nota3 < menor ){
			menor = nota3;
		}
		if( nota4 < menor ){
			menor = nota4;
		}
		// Paso 2: Calculo de promedio
		promedio = (nota1 + nota2 + nota3 + nota4 - menor) / 3;
		if( promedio >= 14 ){
			estado = "Aprobado";
		} else {
			estado = "Desaprobado";
		}
		// Reporte
		System.out.println("Menor nota: " + menor);
		System.out.println("Promedio: " + promedio);
		System.out.println("Estado: " + estado);
	}
	
}
