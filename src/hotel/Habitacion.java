package hotel;

public class Habitacion {
    private int numeroHabitacion;
    private String tipoHabitacion;
    private double precioNoche;
    private boolean disponible;

    public Habitacion(int numeroHabitacion, String tipoHabitacion, double precioNoche) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioNoche = precioNoche;
        this.disponible = true;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void reservar() {
        this.disponible = false;
    }

    public void cancelarReserva() {
        this.disponible = true;
    }
}
