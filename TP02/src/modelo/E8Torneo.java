package modelo;

import java.util.ArrayList;

public class E8Torneo {
	private static E8Torneo instance=null;
	private ArrayList<E8Equipo> equipos = new ArrayList<E8Equipo>();
	private ArrayList<E8Partido> partidos= new ArrayList<E8Partido>();
	
	
	
	//public void addEquipo (E8Equipo){}
	//public void removeEquipo (E8Equipo){}
	
	//public void addPartido (E8Partido){}
	//public void removePartido (E8Partido){}
	
	
	private E8Torneo(){
		
	}
	
	public ArrayList<E8Partido> getPartidos() {
		return partidos;
	}
	public ArrayList<E8Equipo> getEquipos() {
		return equipos;
	}

	public E8Torneo getInstance() {
		if(E8Torneo.instance==null)
			E8Torneo.instance= new E8Torneo();
		return E8Torneo.instance;
	}
	
	

}
