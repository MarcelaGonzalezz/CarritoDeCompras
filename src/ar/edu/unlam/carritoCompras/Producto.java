package ar.edu.unlam.carritoCompras;

public class Producto {

	private String nombre;
	private String seccion;
	private Double precio;

	public Producto(String nombre, String seccion, Double precio) {
		this.nombre= nombre;
		this.seccion= seccion;
		this.setPrecio(precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public Boolean tieneDescuento() {
		if (this.seccion == "Lacteo" || this.seccion == "Bazar" ) {
			return true;
		}
		else 
			return false;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
