package libros;

import java.util.ArrayList;
import java.util.Scanner;




public class Menu {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Libro> libro = new ArrayList(); 
		System.out.println("---------------Gestor de Libros---------------");
		System.out.println("--------------Opciones del Menu-----------------");
		System.out.println("1. Insertar datos\\ 2. Mostrar Libros");
		int option = scan.nextInt();
		switch (option) {
		case 1:
			System.out.println("Su Opcion elejida fue:" + option);
			System.out.println("Ingrese Titulo del Libro");
			String titu = scan.nextLine();
			System.out.println("Ingrese Autor del libro");
			String aut = scan.nextLine();
			System.out.println("Ingrese Numeros de Pagina");
			int pag = scan.nextInt();
			System.out.println("Su calificacion para el libro");
			int cal = scan.nextInt();
			while (!(cal >= 0 && cal <= 10)) {
				System.out.println("Digite una valoracion valida entre 1 y 10: ");
				cal = scan.nextInt();
			}

			Libro l = new Libro(titu, aut, pag, cal);

			System.out.println("Datos A Guardados");
			System.out.println("Libro: " + l.getTitulo());
			System.out.println("Autor: " + l.getAutor());
			System.out.println("Paginas: " + l.getnPagina());
			System.out.println("Calificacion: " + l.getCalificacion());
			System.out.println("Confirme si desea guardar los datos 1. para confirmar 2. para modificar");
		
			
			break;
		case 2:
//			Libro.guardar g = new Libro.guardar();
//		g.mostrar();;
		}
		
			
		scan.close();
	}
}
