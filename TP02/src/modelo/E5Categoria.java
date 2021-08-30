package modelo;

public class E5Categoria {
	private String nombreCategoria;
	private double sueldo;
	
	
	public E5Categoria(String nombreCategoria, double sueldo) {
		super();
		this.nombreCategoria = nombreCategoria;
		this.sueldo = sueldo;
	}


	public String getNombreCategoria() {
		return nombreCategoria;
	}


	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	@Override
	public String toString() {
		return "[nombreCategoria=" + nombreCategoria + ", sueldo=" + sueldo + "]";
	}
	
	
	
	
}
