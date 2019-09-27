package prueba;

import java.util.Scanner;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dato: ");
		String dato = scanner.nextLine();
		
		System.out.println(dato);
		System.out.println(dato.substring(3));
		System.out.println(dato.substring(3,7));
		System.out.println(dato.substring(3,12));
		//System.out.println(dato.substring(3,100));
		
		
	}
}
