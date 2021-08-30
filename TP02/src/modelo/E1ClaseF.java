package modelo;

public class E1ClaseF {
	private int x = 0;
	private int y = 0;
	public E1ClaseF() {}
	public void p() {
		int x=1;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("x=" + this.x);
		/*
		 * El resultado por pantalla es:
		 * x=1			// solo x se refiere al parametro o variable local
		 * y=0			// solo y, si no existe parametro o variable local con ese nombre
		 * 				// es entonces el atributo, si es que existe
		 * x=0			// si se quiere referiste al atributo con el mismo nombre
		 * 				// que un parametro o variable local, se usa la palabra "this"
		 * */
	}
}
