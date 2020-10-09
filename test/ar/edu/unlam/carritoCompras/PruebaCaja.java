package ar.edu.unlam.carritoCompras;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaCaja {

	@Test
	public void testQueVerificaQueElCarritoNoEstaVacío() {
		Carrito carrito= new Carrito();
		String nombre= "leche";
		String seccion= "Lacteos";
		Double precio= 80.0;
		Producto p1= new Producto (nombre, seccion, precio);
		
		carrito.agregarProducto(p1);
		
		assertNotNull(carrito.getListaProductos());
	}

	@Test
	public void testQueVerificaTenerElCarritoConProducto() {
		Carrito carrito= new Carrito();
		String nombre= "leche";
		String seccion= "Lacteos";
		Double precio= 80.0;
		Producto p1= new Producto (nombre, seccion, precio);
		
		carrito.agregarProducto(p1);
		Integer ve= 1;
		Integer vo= carrito.getCantProductos();
		
		assertEquals(ve,vo);
	}
	
	@Test
	public void testQueVerificaTenerElCarritoConVariosProductos() {
		Carrito carrito= new Carrito();
		Producto p1= new Producto ("leche", "Lacteo", 80.0);
		Producto p2= new Producto ("crema", "Lacteo", 60.0);
		Producto p3= new Producto ("yogurt", "Lacteo", 40.0);
		
		carrito.agregarProducto(p1);
		carrito.agregarProducto(p2);
		carrito.agregarProducto(p3);
		
		Integer ve= 3;
		Integer vo= carrito.getCantProductos();
		
		assertEquals(ve,vo);
	}
	
	@Test
	public void testQueVerificaAplicarElDescuento() {
		Carrito carrito= new Carrito();
		Producto p1= new Producto ("leche", "Lacteo", 80.0);
		Producto p2= new Producto ("crema", "Lacteo", 60.0);
		Producto p3= new Producto ("yogurt", "Lacteo", 40.0);
		Producto p4= new Producto ("bondiola", "Carne", 200.0);
		
		carrito.agregarProducto(p4);
		carrito.agregarProducto(p3);
		carrito.agregarProducto(p2);
		carrito.agregarProducto(p1);
		carrito.aplicarDescuento();
		
		Double ve= 290.0;
		Double vo= carrito.getPrecioFinal();
		
		assertEquals(ve, vo);
		
	}
	
	@Test 
	public void testQueVerificaNoTenerDescuentos() {
		Carrito carrito= new Carrito();
		Producto p1= new Producto ("peceto", "Carnes", 560.0);
		Producto p2= new Producto ("lentejas", "Legumbres", 60.0);
		Producto p3= new Producto ("garbanzos", "Legumbres", 60.0);
		Producto p4= new Producto ("bondiola", "Carne", 450.0);
		
		carrito.agregarProducto(p4);
		carrito.agregarProducto(p3);
		carrito.agregarProducto(p2);
		carrito.agregarProducto(p1);
		carrito.aplicarDescuento();
		
		Double ve= 1130.0;
		Double vo= carrito.getPrecioFinal();
		
		assertEquals(ve, vo);
		
	}
	
}
