package modelo;

import java.util.ArrayList;
import java.util.Date;

public class E4Pedido {
	private E4Proveedor proveedor;
	private Date fecha;
	private ArrayList<E4LineaDePedido> lineas= new ArrayList<E4LineaDePedido>();
	
	public E4Pedido(E4Proveedor proveedor, Date fecha) {
		this.proveedor = proveedor;
		this.fecha = fecha;
	}
	
	public double costoTotal() {
		double aux=0;
		E4LineaDePedido lineaAux;
		for(int i=0;i <this.lineas.size();i++) {
			lineaAux=lineas.get(i); // supongo que los productos de las lineas de productos no son nulos...
			aux+=lineaAux.getProducto().getPrecioUnitario() * lineaAux.getCantidad();
		}
		return aux;
	}

	//-----------------------------------------------------
	public void addLinea(E4LineaDePedido linea) {
		lineas.add(linea);
	}
	public void addLinea(E4Producto producto, int cantidad) {
		lineas.add(new E4LineaDePedido(producto,cantidad));
	}
	
	public void elimLinea(E4LineaDePedido linea) {
		lineas.remove(linea);
	}
	//-----------------------------------------------------
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public E4Proveedor getProveedor() {
		return proveedor;
	}

	public ArrayList<E4LineaDePedido> getLineas() {
		return lineas;
	}
	
}
