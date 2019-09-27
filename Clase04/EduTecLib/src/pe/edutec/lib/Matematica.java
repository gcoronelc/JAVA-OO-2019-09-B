package pe.edutec.lib;

import java.util.Arrays;


public class Matematica {
	
	public int promediar(int n1, int n2){
		int pr;
		pr = (n1 + n2)/2;
		return pr;
	}
	
	public int promediar(int n1, int n2, int n3){
		int pr;
		pr = (n1 + n2 + n3)/3;
		return pr;
	}
	
	public int promediar(int n1, int n2, int n3, int n4){
		int pr;
		pr = (n1 + n2 + n3 + n4)/4;
		return pr;
	}
	
	public int promediar(int n1, int n2, int n3, int n4, int n5){
		int pr;
		pr = (n1 + n2 + n3 + n4 + n5)/5;
		return pr;
	}
	
	public int promediar(int ... datos){
		//int pr = (int) Math.round(Arrays.stream(datos).average().getAsDouble());
		int suma = 0;
		for (int dato : datos) {
			suma += dato;
		}
		return (suma/datos.length);
	}
	
}
