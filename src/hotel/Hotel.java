package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitacionesDisponibles;

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitacionesDisponibles = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitacionesDisponibles.add(habitacion);
    }

    public Habitacion reservarHabitacion(int numeroHabitacion) {
        for (Habitacion habitacion : habitacionesDisponibles) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion && habitacion.estaDisponible()) {
                habitacion.reservar();
                return habitacion;
            }
        }
        return null; // no se encontró una habitación disponible con ese número
    }

    public void cancelarReserva(Habitacion habitacion) {
        habitacion.cancelarReserva();
    }

    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : habitacionesDisponibles) {
            if (habitacion.estaDisponible()) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }
}
