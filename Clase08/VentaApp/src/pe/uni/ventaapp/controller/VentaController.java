package pe.uni.ventaapp.controller;

import pe.uni.ventaapp.dto.ConceptoDto;
import pe.uni.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class VentaController {

	public String[] getTipos() {
		return CompFactory.getTipos();
	}

	public ConceptoDto[] procesar(String tipo, double total) {
		return CompFactory.getComp(tipo).procesar(total);
	}

}
