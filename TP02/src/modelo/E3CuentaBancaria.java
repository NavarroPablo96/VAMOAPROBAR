package modelo;

public class E3CuentaBancaria {
	private double saldo=0;
	private String titular;
	
	public E3CuentaBancaria(String titular){
		this.titular=titular;
	}
	
	public void depositar (double monto) {
		if(monto>=0)
			this.saldo+=monto;
		//else
		// error;excepción
	
	} 
	
	public boolean extraer(double monto) {
		if(monto >=0)
			return (monto<=this.saldo);
		else
			return false;// error;excepción
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
	
	/*En este caso particular el uso de private en los atributos permite
	 *verificar que los montos que se depositan sean validos.
	 *tambien que el titular solo se pueda asignar al momento de crear la instancia
	 * */
	
}
