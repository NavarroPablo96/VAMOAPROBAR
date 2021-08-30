package modelo;

import java.util.ArrayList;

public class E5Empresa {
	
	private static E5Empresa instance = null;
	private ArrayList<E5Colectivo> colectivos= new ArrayList<E5Colectivo>();
	private ArrayList<E5Categoria> categorias= new ArrayList<E5Categoria>();
	private ArrayList<E5Chofer> choferes = new ArrayList<E5Chofer>();
	
	private E5Empresa(){
	}
	
	public static E5Empresa getInstance() {
		if(E5Empresa.instance==null)
			E5Empresa.instance= new E5Empresa();
		return E5Empresa.instance;
	}
	
	
	public void addChofer(E5Chofer chofer) {
		this.choferes.add(chofer);
	}
	public void removeChofer(E5Chofer chofer) {
		this.choferes.remove(chofer);
	}
	public void addColectivo(E5Colectivo colectivo) {
		this.colectivos.add(colectivo);
	}
	public void removeColectivo(E5Colectivo colectivo) {
		this.colectivos.remove(colectivo);
	}
	public void addCategoria(E5Categoria categoria) {
		this.categorias.add(categoria);
	}
	public void removeColectivo(E5Categoria categoria) {
		this.categorias.remove(categoria);
	}
	
	public int cantidadChoferesSinColectivoAsignado() {
		int cont=0;
		for(int i = 0; i< this.choferes.size(); i++) {
			if(!(this.choferes.get(i).tieneColectivoAsignado()))
				cont++;
		}
		return cont;
	}
	
	public int cantidadColectivos() {
		return colectivos.size();
	}
	
	public void listaChoferesPertenecientesACategoria(E5Categoria categoria) {
		for(int i = 0; i< this.choferes.size(); i++) {
			if(this.choferes.get(i).getCategoria() ==  categoria)  {
				System.out.println(this.choferes.get(i));
			}		
		}
	}
	
	public void listaCategoriasSueldoMayorX(double X) {
		for(int i = 0; i< this.categorias.size(); i++) {
			if(this.categorias.get(i).getSueldo() >  X)  {
				System.out.println("\n"+this.categorias.get(i));
			}
		}
	}
	
	public ArrayList<E5Categoria> CategoriasSueldoMayorX(double X) {
		ArrayList<E5Categoria> aux = new ArrayList<E5Categoria>();;
		
		for(int i = 0; i< this.categorias.size(); i++) {
			if(this.categorias.get(i).getSueldo() >  X)  {
				aux.add(this.categorias.get(i));
			}
		}
		return aux;
	}
	
	
	
	public void ChoferesSueldoMayorX(double X) {
		ArrayList<E5Categoria> aux = E5Empresa.getInstance().CategoriasSueldoMayorX(X);
		
		for(int i=0; i<aux.size();i++) {
			E5Empresa.getInstance().listaChoferesPertenecientesACategoria(aux.get(i));
		}
	}
	
}
