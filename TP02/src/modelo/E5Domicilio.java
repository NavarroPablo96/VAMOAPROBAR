package modelo;

public class E5Domicilio {
	private String calle;
	private int numero;
	
	public E5Domicilio(String calle, int numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "[calle=" + calle + ", numero=" + numero + "]";
	}
	
	
	
	 
}
