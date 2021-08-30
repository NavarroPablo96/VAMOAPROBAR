package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class E8Partido {
	private E8Equipo local,visitante;
	private ArrayList<E8Gol> golesEquipoLocal = new ArrayList<E8Gol>();
	private ArrayList<E8Gol> golesEquipoVisitante = new ArrayList<E8Gol>();
	
	GregorianCalendar fecha;
	
	
	// constructor.... vacio si quere
	
	//set equipos, no pueden ser el mismo equipo
	
	//public void addGolVisitante(Jugador,minuto)
	//public void addGolVisitante(Gol gol)
	
	//public void addGolLocal(Jugador,minuto)
	//public void addGolLocal(Gol gol)
	
	//public void anularGolVisitante(Gol gol)
	//public void anularGolLocal(Gol gol)
	
	public E8Equipo ganador() {
		if(golesEquipoLocal.size() > golesEquipoVisitante.size())
			return this.local;
		else 
			if(golesEquipoLocal.size() < golesEquipoVisitante.size())
				return this.visitante;
			else
				return null; // no hay ganador es empate
	}
	
	public  String Resultado() {
		String aux = null;
		E8Equipo ganador = this.ganador();
		if(ganador!=null)
			aux= "El equipo ganador es: "+ganador.getNombre();
		else //empate o un equipo es null(null pointer exception)
			aux= "El partido resulto en empate";
		return aux;
	}
	
	private void listaGoles(ArrayList<E8Gol> goles) {
		for(int i=0; i<goles.size(); i++) {
			System.out.println("Minuto:"+goles.get(i).getMinuto()+" gol del jugador " + goles.get(i).getGoleador().getNombre());
		}
	}
	
	public void Detalles() {
		System.out.println("Goles equipo local:"+this.local.getNombre());
		listaGoles(this.golesEquipoLocal);
		System.out.println("Equipo Visitante:"+this.local.getNombre());
		listaGoles(this.golesEquipoVisitante);
		System.out.println(this.Resultado());
	}
	
	
	
	public ArrayList<E8Gol> getGolesEquipoLocal() {
		return golesEquipoLocal;
	}
	public ArrayList<E8Gol> getGolesEquipoVisitante() {
		return golesEquipoVisitante;
	}
	
	
	public E8Equipo getLocal() {
		return local;
	}
	public void setLocal(E8Equipo local) {
		this.local = local;
	}
	public E8Equipo getVisitante() {
		return visitante;
	}
	public void setVisitante(E8Equipo visitante) {
		this.visitante = visitante;
	}
	public GregorianCalendar getFecha() {
		return fecha;
	}
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
