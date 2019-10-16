package prueba01;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		int[] vector;
		vector = new int[5];
		pintarVector(vector);
		
		vector[2] = 56;
		pintarVector(vector);
		
		
	}

	private static void pintarVector(int[] vector) {
		System.out.println("--------------------------");
		for (int i = 0; i < vector.length; i++) {
			int j = vector[i];
			System.out.println("vector[" + i + "] = " + j);
		}
	}
	
}
