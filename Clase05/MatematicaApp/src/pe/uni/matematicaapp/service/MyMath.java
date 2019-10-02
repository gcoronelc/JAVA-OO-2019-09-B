package pe.uni.matematicaapp.service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class MyMath {

	private MyMath() {
	}
		
	public static long factorial(int num){
		
		return 0;
	}
	
	public static int mcd(int num1, int num2){
		
		return 0;
	}
	
	public static int mcm(int num1, int num2){
		
		return 0;
	}
	
	public static String fibonacci(int num){
		// Variables
		String repo = "";
		int a = 0, b = 1, c = 0;
		// Validacion
		if( num <= 0 ){
			return repo;
		}
		// Proceso
		switch(num){
			case 1:
				repo = "0";
				break;
			case 2:
				repo = "0, 1";
				break;
			default:
				repo = "0, 1";
				for (int i = 3; i <= num; i++) {
					c = a + b;
					repo += ", " + c;
					a = b;
					b = c;
				}
		}
		// Reporte	
		return repo;
	}
	
	public static boolean esPrimo(int num){
		
		return false;
	}
	

}
