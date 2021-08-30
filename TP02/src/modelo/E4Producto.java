package modelo;

public class E4Producto {
	private int numeroCodigo;
	private double precioUnitario;
	private String Descripción;
	
	public E4Producto(int numeroCodigo, double precioUnitario, String descripción) {
		super();
		this.numeroCodigo = numeroCodigo;
		this.precioUnitario = precioUnitario;
		Descripción = descripción;
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

	public String getDescripción() {
		return Descripción;
	}

	public void setDescripción(String descripción) {
		Descripción = descripción;
	}
	
	
	
}
