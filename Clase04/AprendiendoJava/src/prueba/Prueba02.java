package prueba;

import java.util.Scanner;
import service.DemoService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		
		DemoService service = new DemoService();
		
		System.out.println("7 + 8 = " + service.sumar(7, 8));
		System.out.println("7 + 8 = " + service.sumar(7, 8.0));
		
	}
}
