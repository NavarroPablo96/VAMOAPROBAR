package modelo;

import java.util.ArrayList;

/*
 * En le diagrama de clases, el negocio es la clase principal, tiene
 * la lista de proveedores, pedidos y también productos.
 * Está compuesto por ellos.
 * 
 * Si se elimina el negocio, se pierden los proveedores, pedidos y productos.
 * 
 * El pedido tiene una relación de agregación con el proveedor.
 * Muchos pedidos pueden tener el mismo proveedor.
 * Si se elimina el pedido el proveedor puede seguir existiendo
 * en otro pedidos o en la clase negocio.
 * 
 * El pedido tiene una relación de composición con LineaDePedido
 * cuando se elimina el pedido la linea de pedido no tiene sentido de existir
 * No pueden dos pedidos diferentes tener la misma LineaDePedido
 * Puede haber tener los mismos valores de casualidad pero no será la misma.
 * 
 * 
 * Cada LineaDePedido tiene una relación de agregación con el Producto
 * La LineaDePedido tiene un producto y la cantidad de ellos.
 * Al eliminarse la LineaDePedido el producto sigue existiendo, porque
 * puede estar siendo referenciado por otras LineaDePedido. O por la clase
 * Negocio.
 * */

public class E4Negocio {
	private static E4Negocio instance=null;
	private ArrayList<E4Pedido> pedidos= new ArrayList<E4Pedido>();
	private ArrayList<E4Proveedor> proveedores= new ArrayList<E4Proveedor>();
	
	
	private E4Negocio(){
		
	}

	public static E4Negocio getInstance() {
		if(E4Negocio.instance==null)
			E4Negocio.instance=new E4Negocio();
		return instance;
	}
	
	public void addPedido(E4Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public void elimPedido(E4Pedido pedido) {
		this.pedidos.remove(pedido);
	}
	
	public void addProvedor(E4Proveedor proveedor) {
		this.proveedores.add(proveedor);
	}
	
	public void elimProvedor(E4Proveedor proveedor) {
		this.proveedores.remove(proveedor);
	}
	
	public ArrayList<E4Pedido> getPedidos() {
		return pedidos;
	}

	public ArrayList<E4Proveedor> getProveedores() {
		return proveedores;
	}
}
