package pe.edutec.edutecapp.controller;

import pe.edutec.lib.Matematica;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class MateController {

	public int promediar(int n1, int n2) {
		Matematica mate = new Matematica();
		return mate.promediar(n1, n2);
	}

}
