package tiendajuguete;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TiendaJuguetes {
    private String nombre;
    private String direccion;
    private List<Juguete> juguetesDisponibles;

    public TiendaJuguetes(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.juguetesDisponibles = new ArrayList<>();
    }

    public void agregarJuguete(Juguete juguete) {
        juguetesDisponibles.add(juguete);
    }

    public void alquilarJuguete(Juguete juguete) {
        if (!juguete.estaAlquilado()) {
            juguete.setAlquilado(true);
            System.out.println("El juguete " + juguete.getNombre() + " ha sido alquilado.");
        } else {
            System.out.println("El juguete " + juguete.getNombre() + " no está disponible en este momento.");
        }
    }

    public void devolverJuguete(Juguete juguete) {
        if (juguete.estaAlquilado()) {
            juguete.setAlquilado(false);
            System.out.println("El juguete " + juguete.getNombre() + " ha sido devuelto.");
        } else {
            System.out.println("El juguete " + juguete.getNombre() + " no estaba alquilado.");
        }
    }

    public List<Juguete> mostrarJuguetesDisponibles() {
        List<Juguete> juguetesDisponibles = this.juguetesDisponibles.stream()
                .filter(j -> !j.estaAlquilado())
                .collect(Collectors.toList());

        if (!juguetesDisponibles.isEmpty()) {
            System.out.println("Juguetes disponibles en " + nombre + ":");
            for (Juguete juguete : juguetesDisponibles) {
                System.out.println(juguete);
            }
        } else {
            System.out.println("No hay juguetes disponibles en " + nombre + " en este momento.");
        }
        return juguetesDisponibles;
        }
        }


