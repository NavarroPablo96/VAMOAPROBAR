package modelo;

public class E4Producto {
	private int numeroCodigo;
	private double precioUnitario;
	private String Descripci�n;
	
	public E4Producto(int numeroCodigo, double precioUnitario, String descripci�n) {
		super();
		this.numeroCodigo = numeroCodigo;
		this.precioUnitario = precioUnitario;
		Descripci�n = descripci�n;
	}

	public int getNumeroCodigo() {
		return numeroCodigo;
	}

	public void setNumeroCodigo(int numeroCodigo) {
		this.numeroCodigo = numeroCodigo;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getDescripci�n() {
		return Descripci�n;
	}

	public void setDescripci�n(String descripci�n) {
		Descripci�n = descripci�n;
	}
	
	
	
}
