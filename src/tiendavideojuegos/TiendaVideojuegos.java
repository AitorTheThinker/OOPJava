package tiendavideojuegos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TiendaVideojuegos {
    private String nombre;
    private String direccion;
    private List<VideoJuego> videojuegosDisponibles;

    public TiendaVideojuegos(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.videojuegosDisponibles = new ArrayList<>();
    }

    public void agregarVideojuego(VideoJuego videojuego) {
        videojuegosDisponibles.add(videojuego);
    }

    public void alquilarVideojuego(VideoJuego videojuego) {
        if (!videojuego.estaAlquilado()) {
            videojuego.setAlquilado(true);
            System.out.println("El videojuego " + videojuego.getTitulo() + " ha sido alquilado.");
        } else {
            System.out.println("El videojuego " + videojuego.getTitulo() + " no está disponible en este momento.");
        }
    }

    public void devolverVideojuego(VideoJuego videojuego) {
        if (videojuego.estaAlquilado()) {
            videojuego.setAlquilado(false);
            System.out.println("El videojuego " + videojuego.getTitulo() + " ha sido devuelto.");
        } else {
            System.out.println("El videojuego " + videojuego.getTitulo() + " no estaba alquilado.");
        }
    }

    public List<VideoJuego> mostrarVideojuegosDisponibles() {
        List<VideoJuego> videojuegosDisponibles = this.videojuegosDisponibles.stream()
                .filter(v -> !v.estaAlquilado())
                .collect(Collectors.toList());

        if (!videojuegosDisponibles.isEmpty()) {
            System.out.println("Videojuegos disponibles en " + nombre + ":");
            for (VideoJuego video: videojuegosDisponibles) {
                System.out.println(video);
            }
        } else {
            System.out.println("No hay videojuegos disponibles en " + nombre + " en este momento.");
        }
        return videojuegosDisponibles;
    }
}
