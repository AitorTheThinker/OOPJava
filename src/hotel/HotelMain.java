package hotel;

import java.util.List;

public class HotelMain {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Paradise", "123 Main St.");

        Habitacion habitacion1 = new Habitacion(101, "Individual", 50.0);
        hotel.agregarHabitacion(habitacion1);

        Habitacion habitacion2 = new Habitacion(102, "Doble", 75.0);
        hotel.agregarHabitacion(habitacion2);

        Habitacion habitacion3 = new Habitacion(103, "Suite", 100.0);
        hotel.agregarHabitacion(habitacion3);

        Habitacion reservada = hotel.reservarHabitacion(102);
        if (reservada != null) {
            System.out.println("Se ha reservado la habitación " + reservada.getNumeroHabitacion());
        } else {
            System.out.println("No se pudo reservar una habitación disponible.");
        }

        System.out.println("Habitaciones disponibles:");
        List<Habitacion> habitacionesDisponibles = hotel.getHabitacionesDisponibles();
        for (Habitacion habitacion : habitacionesDisponibles) {
            System.out.println(habitacion.getNumeroHabitacion() + " - " + habitacion.getTipoHabitacion() + " - $" + habitacion.getPrecioNoche() + "/noche");
        }

        reservada = hotel.reservarHabitacion(103);
        if (reservada != null) {
            System.out.println("Se ha reservado la habitación " + reservada.getNumeroHabitacion());
        } else {
            System.out.println("No se pudo reservar una habitación disponible.");
        }

        System.out.println("Habitaciones disponibles:");
        habitacionesDisponibles = hotel.getHabitacionesDisponibles();
        for (Habitacion habitacion : habitacionesDisponibles) {
            System.out.println(habitacion.getNumeroHabitacion() + " - " + habitacion.getTipoHabitacion() + " - $" + habitacion.getPrecioNoche() + "/noche");
        }

        hotel.cancelarReserva(habitacion2);

        System.out.println("Habitaciones disponibles:");
        habitacionesDisponibles = hotel.getHabitacionesDisponibles();
        for (Habitacion habitacion : habitacionesDisponibles) {
            System.out.println(habitacion.getNumeroHabitacion() + " - " + habitacion.getTipoHabitacion() + " - $" + habitacion.getPrecioNoche() + "/noche");
        }
    }
}
