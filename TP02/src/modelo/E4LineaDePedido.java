package modelo;

public class E4LineaDePedido {
	private E4Producto producto;
	private int cantidad;
	
	public E4LineaDePedido(E4Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public E4Producto getProducto() {
		return producto;
	}

	public void setProducto(E4Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
