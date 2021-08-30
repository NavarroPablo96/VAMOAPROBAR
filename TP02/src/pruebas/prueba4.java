package pruebas;

import java.util.Date;

import modelo.E4Negocio;
import modelo.E4Pedido;
import modelo.E4Producto;
import modelo.E4Proveedor;

public class prueba4 {
	public static void main(String[] args) {
		/*
		 * Responsabilidad de crear proveedores y pedidos
		 * 
		 * Sería responsabilidad de la Clase Negocio
		 * 
		 * */
		E4Proveedor proveedor= new E4Proveedor("Distrubuidora 1","distribuidora@Amail.com",123123123);
		E4Proveedor proveedor2= new E4Proveedor("Distrubuidora 2","distribuidora2@Amail.com",231231231);
		E4Proveedor proveedor3= new E4Proveedor("Distrubuidora 3","distribuidora3@Amail.com",312312312);
		
		E4Producto producto = new E4Producto(15,15000,"Esto no es falopa");
		E4Producto producto2 = new E4Producto(15,15000,"Esto tampoco es falopa");
		E4Producto producto3 = new E4Producto(15,15000,"falopa");
		
		
		
		
		
		Date fechaHoy= new Date();
		E4Pedido pedido = new E4Pedido(proveedor2,fechaHoy);
		pedido.addLinea(producto, 1000);	//estas son lineas de productos
		pedido.addLinea(producto2, 1500);	//estas son lineas de productos
		pedido.addLinea(producto3, 2000);	//estas son lineas de productos
		
		
		
		E4Negocio.getInstance().addProvedor(proveedor);
		E4Negocio.getInstance().addProvedor(proveedor2);
		E4Negocio.getInstance().addProvedor(proveedor3);
		E4Negocio.getInstance().addPedido(pedido);
		
		
		
	}
}
