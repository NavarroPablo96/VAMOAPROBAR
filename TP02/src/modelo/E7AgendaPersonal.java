package modelo;

import java.util.GregorianCalendar;

public class E7AgendaPersonal {
	//telefonos de contactos.
	
	//Contacto:
			//nombre, telefono fijo, varios telefonos celulares.
	
	//Hashmap hm;
	
	//Altas Bajas y modificaciones de Contactos...
	//Búsqueda de contacto por nombre;
	//Evitar contctos con el mismo nombre
	//Mostrar Todos los contactos
	

	public static String ampm(GregorianCalendar f) {
		if(f.get(9)==0)
			return "am";
		else
			return "pm";
	}
	
	public static void main(String[] args) {
		GregorianCalendar fecha=new GregorianCalendar();

		System.out.println("fecha="+fecha.get(5)+"/"+fecha.get(2)+"/"+fecha.get(1));
		
		System.out.println("hora="+fecha.get(11)+":"+fecha.get(12)+":"+fecha.get(13)+" "+ampm(fecha));
		
	}

}
