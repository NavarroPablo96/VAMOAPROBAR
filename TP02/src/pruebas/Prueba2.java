package pruebas;

import modelo.E2Punto;

public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E2Punto p1 = new E2Punto(2,3);
		E2Punto p2;
		//E2Punto p3 = new E2Punto(); // �sta l�nea genera un error
		//porque el constructor sin par�metros fue reemplazado por uno con par�metros
		//y el sin par�metro ya no existe.
		//E2Punto p3 = new E2Punto(0,0);
		System.out.println("P1="+p1.Cartel());
		//p3=p2;		// error p2 no fue inicializada estar�a asignando null
		p2=p1;
		p1.cambia(8, 5);
		System.out.println("P2="+p2.Cartel());
	}

}
