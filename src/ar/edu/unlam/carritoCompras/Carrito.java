package ar.edu.unlam.carritoCompras;

import java.util.ArrayList;

public class Carrito {

	private ArrayList<Producto> listaProductos;
	private Double descuento= 0.50;
	private Integer cantDescuento;
	private Double precioFinal;

	public Carrito() {
		this.precioFinal= 0.0;
		this.cantDescuento= 0;
		this.listaProductos= new ArrayList<Producto> ();
	}

	public Integer getCantProductos() {
		return listaProductos.size();
	}

	public boolean agregarProducto(Producto producto) {
		return listaProductos.add(producto);
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public void eliminarProducto (Producto productoAEliminar) {
		this.listaProductos.remove(productoAEliminar);
	}

	public void aplicarDescuento() {
		for (Producto producto : listaProductos) {
			
			Double p= producto.getPrecio();
			
			if(producto.tieneDescuento()) {
				p *= this.descuento;
				this.precioFinal+= p;
			}
			else {
				this.precioFinal+= producto.getPrecio();
			}
		}
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Integer getCantDescuento() {
		return cantDescuento;
	}

	public void setCantDescuento(Integer cantDescuento) {
		this.cantDescuento = cantDescuento;
	}

	public Double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(Double precioFinal) {
		this.precioFinal = precioFinal;
	}
}

