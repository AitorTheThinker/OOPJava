package libros_prestados;

public class LibroPrestadoMain {

	public static void main(String[] args) {

	    // Creamos dos objetos libro y los agregamos a la lista de libros disponibles de la biblioteca
	    LibroPrestado libro1 = new LibroPrestado("Cien años de soledad", "Gabriel García Márquez", "978-0307474728", 464, 2);
	    LibroPrestado libro2 = new LibroPrestado("El Quijote", "Miguel de Cervantes", "978-8420658454", 1072, 1);

	    Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Calle 123, Ciudad");

	    biblioteca.agregarLibro(libro1);
	    biblioteca.agregarLibro(libro2);

	    // Mostramos la información de la biblioteca y los libros disponibles
	    System.out.println("Biblioteca: " + biblioteca.getNombre() + ", " + biblioteca.getDireccion());
	    System.out.println("Libros disponibles:");
	    for (LibroPrestado libro : biblioteca.getListaLibrosDisponibles()) {
	        System.out.println(libro.toString());
	    }
	    System.out.println();


	    // Prestamos el mismo libro dos veces
	    biblioteca.prestarLibro(libro1.getIsbn());
	    biblioteca.prestarLibro(libro1.getIsbn());

	    // Mostramos la información de la biblioteca y los libros disponibles
	    System.out.println("Biblioteca: " + biblioteca.getNombre() + ", " + biblioteca.getDireccion());
	    System.out.println("Libros disponibles:");
	    for (LibroPrestado libro : biblioteca.getListaLibrosDisponibles()) {
	        System.out.println(libro.toString());
	    }
	    System.out.println();

	    
	    
	    // Prestamos el otro libro una vez
	    biblioteca.prestarLibro(libro2.getIsbn());

	    // Mostramos la información de la biblioteca y los libros disponibles
	    System.out.println("Biblioteca: " + biblioteca.getNombre() + ", " + biblioteca.getDireccion());
	    System.out.println("Libros disponibles:");
	    for (LibroPrestado libro : biblioteca.getListaLibrosDisponibles()) {
	        System.out.println(libro.toString());
	    }
	    System.out.println();

	    // Devolvemos el último libro que se ha prestado
	    biblioteca.devolverLibro(libro2.getIsbn());

	    // Mostramos la información de la biblioteca y los libros disponibles
	    System.out.println("Biblioteca: " + biblioteca.getNombre() + ", " + biblioteca.getDireccion());
	    System.out.println("Libros disponibles:");
	    for (LibroPrestado libro : biblioteca.getListaLibrosDisponibles()) {
	        System.out.println(libro.toString());
	    }
	    System.out.println();
	}

}
