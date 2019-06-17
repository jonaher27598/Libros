package libros;

import java.util.ArrayList;
import java.util.Iterator;


public class Libro {
	public Libro(String titu, String aut, int pag, int cali) {
		this.titulo = titu;
		this.autor = aut;
		this.nPagina = pag;
		this.calificacion = cali;
		
	}
	//Primer array
 public class guardar {
	 private ArrayList<Libro> listalib = new ArrayList<>();
	 public void Agregar(Libro libro) {
		 listalib.add(libro);
	 }
	 public void mostrar () {
		 Iterator<Libro> it = listalib.iterator();
		 while(it.hasNext()) {
			 Libro item = (Libro)it.next();
			 titulo = item.getTitulo();
			 autor = item.getAutor();
			 nPagina = item.getnPagina();
			 calificacion = item.getCalificacion();
			 System.out.println("Nombre"+ titulo);
			 System.out.println("Nombre"+ autor);
			 System.out.println("Nombre"+ nPagina);
			 System.out.println("Nombre"+ calificacion);
		 }
	 }
 }
	private String titulo;
	private String autor;
	private int nPagina;
	private int calificacion;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getnPagina() {
		return nPagina;
	}

	public void setnPagina(int nPagina) {
		this.nPagina = nPagina;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
}
