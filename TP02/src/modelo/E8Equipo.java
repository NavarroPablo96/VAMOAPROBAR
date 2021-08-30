package modelo;

import java.util.ArrayList;

public class E8Equipo {
	private String nombre;
	private ArrayList<E8Jugador> jugadores= new ArrayList<E8Jugador>();
	private int cantidadPartidosGanados=0,cantidadPartidosEmpatados=0,cantidadPartidosPerdidos=0;
	private int cantidadGolesFavor=0,cantidadGolesContra=0;
	
	
	public E8Equipo(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void addJugador(E8Jugador j) {
		this.jugadores.add(j);
	}

	public void removeJugador(E8Jugador j) {
		this.jugadores.remove(j);
	}
	
	public E8Equipo equipoConMásPuntaje(E8Equipo otro){
		int puntosThis=this.puntosObtenidos();
		int puntosOtro=otro.puntosObtenidos();
		if(puntosThis>puntosOtro)
			return this;
		else if(puntosOtro>puntosThis)
			return otro;
		else if(this.cantidadGolesFavor>otro.cantidadGolesFavor)
			return this;
		else if(this.cantidadGolesFavor<otro.cantidadGolesFavor)
			return otro;
		else if(this.cantidadGolesContra<otro.cantidadGolesContra)
			return this;
		else
			return otro;
	}
	
	public E8Jugador jugadorConMásGoles() {
		int cantGoles=0;
		E8Jugador goleador=null,actual;
		for(int i=0;i<this.jugadores.size();i++) {
			actual=	this.jugadores.get(i);
			if(actual.getCantidadGolesCampeonato()>cantGoles) {
				cantGoles=actual.getCantidadGolesCampeonato();
				goleador=actual;
			}
		}
		return goleador;
	}
	
	public E8Jugador jugadorConMásGoles(E8Equipo otro) {
		E8Jugador goleadorThis=this.jugadorConMásGoles();
		E8Jugador goleadorOtro=otro.jugadorConMásGoles();
		
		if(goleadorThis.getCantidadGolesCampeonato()>goleadorOtro.getCantidadGolesCampeonato())
			return goleadorThis;
		else
			return goleadorOtro;
	}
	
	public int puntosObtenidos() {
		return (this.cantidadPartidosEmpatados)+(this.cantidadPartidosGanados*3);
	}
	
	public int partidosJugados() {
		return this.cantidadPartidosEmpatados+this.cantidadPartidosGanados+this.cantidadPartidosPerdidos;
	}
	
	public int getCantidadPartidosGanados() {
		return cantidadPartidosGanados;
	}
	public void setCantidadPartidosGanados(int cantidadPartidosGanados) {
		this.cantidadPartidosGanados = cantidadPartidosGanados;
	}
	public void addPartidosGanados() {
		this.cantidadPartidosGanados ++;
	}
	public int getCantidadPartidosEmpatados() {
		return cantidadPartidosEmpatados;
	}
	public void setCantidadPartidosEmpatados(int cantidadPartidosEmpatados) {
		this.cantidadPartidosEmpatados = cantidadPartidosEmpatados;
	}
	public void addPartidosEmpatados() {
		this.cantidadPartidosEmpatados ++;
	}
	
	public int getCantidadPartidosPerdidos() {
		return cantidadPartidosPerdidos;
	}
	public void setCantidadPartidosPerdidos(int cantidadPartidosPerdidos) {
		this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
	}
	public void addPartidosPerdidos() {
		this.cantidadPartidosPerdidos ++;
	}
	public int getCantidadGolesFavor() {
		return cantidadGolesFavor;
	}
	public void setCantidadGolesFavor(int cantidadGolesFavor) {
		this.cantidadGolesFavor = cantidadGolesFavor;
	}
	public int getCantidadGolesContra() {
		return cantidadGolesContra;
	}
	public void setCantidadGolesContra(int cantidadGolesContra) {
		this.cantidadGolesContra = cantidadGolesContra;
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<E8Jugador> getJugadores() {
		return jugadores;
	}
	
}
