package taller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TallerMecanico {
    private String nombre;
    private String direccion;
    private List<Herramienta> herramientasDisponibles;
    
    public TallerMecanico(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.herramientasDisponibles = new ArrayList<>();
    }
    
    public void agregarHerramienta(Herramienta herramienta) {
        herramientasDisponibles.add(herramienta);
    }
    
    public void prestarHerramienta(Herramienta herramienta) {
        if (herramienta.estaDisponible()) {
            herramienta.setDisponible(false);
            System.out.println("La herramienta " + herramienta.getNombre() + " ha sido prestada.");
        } else {
            System.out.println("La herramienta " + herramienta.getNombre() + " no está disponible en este momento.");
        }
    }
    
    public void devolverHerramienta(Herramienta herramienta) {
        if (!herramienta.estaDisponible()) {
            herramienta.setDisponible(true);
            System.out.println("La herramienta " + herramienta.getNombre() + " ha sido devuelta.");
        } else {
            System.out.println("La herramienta " + herramienta.getNombre() + " no estaba prestada.");
        }
    }
    
    public List<Herramienta> mostrarHerramientasDisponibles() {
        List<Herramienta> herramientasDisponibles = this.herramientasDisponibles.stream()
                .filter(Herramienta::estaDisponible)
                .collect(Collectors.toList());
        
        if (!herramientasDisponibles.isEmpty()) {
            System.out.println("Herramientas disponibles en " + nombre + ":");
            for (Herramienta herramienta : herramientasDisponibles) {
                System.out.println(herramienta);
            }
        } else {
            System.out.println("No hay herramientas disponibles en " + nombre + " en este momento.");
        }
        
        return herramientasDisponibles;
    }
}
