package bicicleta;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstacionBicicletas {
    private String nombre;
    private String direccion;
    private List<Bicicleta> bicicletasDisponibles;

    public EstacionBicicletas(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.bicicletasDisponibles = new ArrayList<>();
    }

    public void agregarBicicleta(Bicicleta bicicleta) {
        bicicletasDisponibles.add(bicicleta);
    }

    public void alquilarBicicleta(Bicicleta bicicleta) {
        if (!bicicleta.estaAlquilada()) {
            bicicleta.setAlquilada(true);
            System.out.println("La bicicleta " + bicicleta.getNumeroSerie() + " ha sido alquilada.");
        } else {
            System.out.println("La bicicleta " + bicicleta.getNumeroSerie() + " no está disponible en este momento.");
        }
    }

    public void devolverBicicleta(Bicicleta bicicleta) {
        if (bicicleta.estaAlquilada()) {
            bicicleta.setAlquilada(false);
            System.out.println("La bicicleta " + bicicleta.getNumeroSerie() + " ha sido devuelta.");
        } else {
            System.out.println("La bicicleta " + bicicleta.getNumeroSerie() + " no estaba alquilada.");
        }
    }

    public List<Bicicleta> mostrarBicicletasDisponibles() {
        List<Bicicleta> bicicletasDisponibles = this.bicicletasDisponibles.stream()
                .filter(b -> !b.estaAlquilada())
                .collect(Collectors.toList());

        if (!bicicletasDisponibles.isEmpty()) {
            System.out.println("Bicicletas disponibles en " + nombre + ":");
            for (Bicicleta bicicleta : bicicletasDisponibles) {
                System.out.println(bicicleta);
            }
        } else {
            System.out.println("No hay bicicletas disponibles en " + nombre + " en este momento.");
        }
        return bicicletasDisponibles;
    }
}
