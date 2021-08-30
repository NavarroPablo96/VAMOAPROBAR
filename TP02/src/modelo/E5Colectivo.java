package modelo;

public class E5Colectivo {
	private String modelo;
	private int numeroInterno;
	private static int numeroActual=0;
	
	//numero interno debe generarse automáticamente en forma correlativa
	public E5Colectivo (String modelo){
		E5Colectivo.numeroActual ++;
		this.numeroInterno=E5Colectivo.numeroActual;
		this.modelo=modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroInterno() {
		return numeroInterno;
	}

	public static int getNumeroActual() {
		return numeroActual;
	}

	@Override
	public String toString() {
		return "[modelo=" + modelo + ", numeroInterno=" + numeroInterno + "]";
	}
	
}
