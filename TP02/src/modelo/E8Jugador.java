package modelo;

public class E8Jugador {
	private String nombre;
	private int añoNacimiento;
	private int numeroCamiseta;
	private int posiciónDeJuego;
	private int cantidadPartidosJugados;
	private int cantidadGolesCampeonato;

	//constructor con nombre(? 
	
	public E8Jugador QuienHizoMásGoles(E8Jugador otro) {
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
	
	public int getAñoNacimiento() {
		return añoNacimiento;
	}
	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}
	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}
	public int getPosiciónDeJuego() {
		return posiciónDeJuego;
	}
	public void setPosiciónDeJuego(int posiciónDeJuego) {
		this.posiciónDeJuego = posiciónDeJuego;
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
