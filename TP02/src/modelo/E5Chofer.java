package modelo;

public class E5Chofer {
	private E5Categoria categoria;
	private E5Domicilio domicilio;
	private String nombre;
	private E5Colectivo colectivoAsignado;
	
	//el domicilio es único del chofer,				//composición
	// tiene una categoria que define su sueldo, 	//agregación
	
	
	public E5Chofer(E5Categoria categoria, E5Domicilio domicilio, String nombre) {
		super();
		this.categoria = categoria;
		this.domicilio = domicilio;
		this.nombre = nombre;
	}
	
	public void asignarColectivo(E5Colectivo colectivo) {
		this.colectivoAsignado=colectivo;
	}
	
	public void desvincularColectivo() {
		this.colectivoAsignado=null;
	}
	
	public boolean tieneColectivoAsignado() {
		return colectivoAsignado==null;
	}
	
	@Override
	public String toString() {
		//a que se refiere con sobreescribir los métodos toString
		String aux = "Chofer [categoria=" + categoria + ",\ndomicilio=" + domicilio + ",\nnombre=" + nombre + ",\ncolectivoAsignado="; 
		if(this.colectivoAsignado==null)
			aux+= " el chofer no tiene colectivo asignado";
		else
			aux+= colectivoAsignado;
		aux+="]";
		return aux;
	}

	public E5Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(E5Categoria categoria) {
		this.categoria = categoria;
	}

	public E5Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(E5Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public E5Colectivo getColectivoAsignado() {
		return colectivoAsignado;
	}
	
}
