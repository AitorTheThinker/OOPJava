package libros_prestados;

import java.util.ArrayList;

public class Biblioteca {
	
    private String nombre;
    private String direccion;
    private ArrayList<LibroPrestado> listaLibrosDisponibles;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<LibroPrestado> getListaLibrosDisponibles() {
        return listaLibrosDisponibles;
    }

    public void setListaLibrosDisponibles(ArrayList<LibroPrestado> listaLibrosDisponibles) {
        this.listaLibrosDisponibles = listaLibrosDisponibles;
    }

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaLibrosDisponibles = new ArrayList<>();
    }

    public void agregarLibro(LibroPrestado libro) {
        this.listaLibrosDisponibles.add(libro);
    }

    public void prestarLibro(String isbn) {
        for (LibroPrestado libro : listaLibrosDisponibles) {
            if (libro.getIsbn().equals(isbn)) {
                if (libro.getCantCopiasDisponibles() > 0) {
                    libro.prestar();
                    System.out.println("Libro prestado: " + libro.getTitulo());
                } else {
                    System.out.println("No hay copias disponibles para prestar el libro " + libro.getTitulo());
                }
                return;
            }
        }
        System.out.println("El libro con ISBN " + isbn + " no se encuentra en la biblioteca");
    }

    public void devolverLibro(String isbn) {
        for (LibroPrestado libro : listaLibrosDisponibles) {
            if (libro.getIsbn().equals(isbn)) {
                libro.devolver();
                System.out.println("Libro devuelto: " + libro.getTitulo());
                return;
            }
        }
        System.out.println("El libro con ISBN " + isbn + " no se encuentra en la biblioteca");
    }

}
