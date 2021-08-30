package modelo;

public class E8Gol {
	int minuto;
	E8Jugador goleador;
	
	public E8Gol(int minuto, E8Jugador goleador) {
		super();
		this.minuto = minuto;
		this.goleador = goleador;
	}

	public int getMinuto() {
		return minuto;
	}

	public E8Jugador getGoleador() {
		return goleador;
	}

	

}
