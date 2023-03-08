package instrumento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TiendaMusica {
    private String nombre;
    private String direccion;
    private List<Instrumento> instrumentosDisponibles;

    public TiendaMusica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.instrumentosDisponibles = new ArrayList<>();
    }

    public void agregarInstrumento(Instrumento instrumento) {
        instrumentosDisponibles.add(instrumento);
    }

    public void prestarInstrumento(Instrumento instrumento) {
        if (!instrumento.isPrestado()) {
            instrumento.setPrestado(true);
            System.out.println("El instrumento " + instrumento.getMarca() + " ha sido prestado.");
        } else {
            System.out.println("El instrumento " + instrumento.getMarca() + " no está disponible en este momento.");
        }
    }

    public void devolverInstrumento(Instrumento instrumento) {
        if (instrumento.isPrestado()) {
            instrumento.setPrestado(false);
            System.out.println("El instrumento " + instrumento.getMarca() + " ha sido devuelto.");
        } else {
            System.out.println("El instrumento " + instrumento.getMarca() + " no estaba prestado.");
        }
    }

    public List<Instrumento> mostrarInstrumentosDisponibles() {
        List<Instrumento> instrumentosDisponibles = this.instrumentosDisponibles.stream()
                .filter(i -> !i.isPrestado())
                .collect(Collectors.toList());

        if (!instrumentosDisponibles.isEmpty()) {
            System.out.println("Instrumentos disponibles en " + nombre + ":");
            for (Instrumento instrumento : instrumentosDisponibles) {
                System.out.println(instrumento);
            }
        } else {
            System.out.println("No hay instrumentos disponibles en " + nombre + " en este momento.");
        }
        return instrumentosDisponibles;
    }
}

