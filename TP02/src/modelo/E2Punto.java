package modelo;

public class E2Punto {
	private int x;
	private int y;
	public E2Punto(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void cambia (int x1, int y1) {
		setX(x1);
		setY(y1);
	}
	
	public String Cartel()
	{
		return "Punto [x="+x+",y="+y +"]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
