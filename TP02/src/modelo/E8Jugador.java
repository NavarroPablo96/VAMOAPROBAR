package modelo;

public class E8Jugador {
	private String nombre;
	private int a�oNacimiento;
	private int numeroCamiseta;
	private int posici�nDeJuego;
	private int cantidadPartidosJugados;
	private int cantidadGolesCampeonato;

	//constructor con nombre(? 
	
	public E8Jugador QuienHizoM�sGoles(E8Jugador otro) {
		if(this.cantidadGolesCampeonato>otro.cantidadGolesCampeonato)
			return this;
		else
			return otro;
	}
	
	public double promedioGolesPorPartido() {
		if(this.cantidadPartidosJugados==0)
			return 0;
		else
			return this.cantidadGolesCampeonato/this.cantidadPartidosJugados;
	}
	
	public int getA�oNacimiento() {
		return a�oNacimiento;
	}
	public void setA�oNacimiento(int a�oNacimiento) {
		this.a�oNacimiento = a�oNacimiento;
	}
	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}
	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}
	public int getPosici�nDeJuego() {
		return posici�nDeJuego;
	}
	public void setPosici�nDeJuego(int posici�nDeJuego) {
		this.posici�nDeJuego = posici�nDeJuego;
	}
	public int getCantidadPartidosJugados() {
		return cantidadPartidosJugados;
	}
	public void setCantidadPartidosJugados(int cantidadPartidosJugados) {
		this.cantidadPartidosJugados = cantidadPartidosJugados;
	}
	public int getCantidadGolesCampeonato() {
		return cantidadGolesCampeonato;
	}
	public void setCantidadGolesCampeonato(int cantidadGolesCampeonato) {
		this.cantidadGolesCampeonato = cantidadGolesCampeonato;
	}
	public String getNombre() {
		return nombre;
	}
}
