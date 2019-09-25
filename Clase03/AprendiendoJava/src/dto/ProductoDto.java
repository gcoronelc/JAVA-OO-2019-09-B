package dto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class ProductoDto {
	
	private int codigo;
	private String nombre;
	private double precio;
	private boolean activo;

	public ProductoDto() {
		this.codigo = 2000;
		this.nombre = "Agua San Mateo";
		this.precio = 2.50;
		this.activo = true;
		System.out.println("Objeto creado.");
	}

	@Override
	protected void finalize() throws Throwable {
		System.err.println("Chau objeto.");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	

}
