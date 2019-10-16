package pe.uni.ventaapp.service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class CompFactory {

	private CompFactory() {
	}

	
	public static final String COMP_FACTURA = "FACTURA";
	public static final String COMP_BOLETA = "BOLETA";
	
	public static String[]  getTipos(){
		String[] tipos = {COMP_FACTURA, COMP_BOLETA};
		return tipos;
	}
	
	public static CompAbstract getComp( String tipo ){
		// Variable
		CompAbstract bean = null;
		// Proceso
		switch(tipo){
			case COMP_FACTURA:
				bean = new FacturaService();
				break;
			case COMP_BOLETA:
				bean = new BoletaService();
				break;				
		}
		// Reporte
		return bean;
	}
}
