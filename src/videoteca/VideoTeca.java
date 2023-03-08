package videoteca;

import java.util.ArrayList;
import java.util.List;

public class VideoTeca {
    private String nombre;
    private String direccion;
    private List<Pelicula> peliculasDisponibles;
    
    public VideoTeca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.peliculasDisponibles = new ArrayList<>();
    }
    
    public void agregarPelicula(Pelicula pelicula) {
        peliculasDisponibles.add(pelicula);
    }
    
    public void prestarPelicula(Pelicula pelicula) {
        if (pelicula.estaDisponible()) {
            pelicula.prestar();
            System.out.println("La película " + pelicula.getTitulo() + " ha sido prestada.");
        } else {
            System.out.println("La película " + pelicula.getTitulo() + " no está disponible en este momento.");
        }
    }
    
    public void devolverPelicula(Pelicula pelicula) {
        if (!pelicula.estaDisponible()) {
            pelicula.devolver();
            System.out.println("La película " + pelicula.getTitulo() + " ha sido devuelta.");
        } else {
            System.out.println("La película " + pelicula.getTitulo() + " ya estaba disponible.");
        }
    }
    
    public void mostrarPeliculasDisponibles() {
        if (!peliculasDisponibles.isEmpty()) {
            System.out.println("Películas disponibles en " + nombre + ":");
            for (Pelicula pelicula : peliculasDisponibles) {
                System.out.println(pelicula.getTitulo());
            }
        } else {
            System.out.println("No hay películas disponibles en " + nombre + " en este momento.");
        }
    }
}
