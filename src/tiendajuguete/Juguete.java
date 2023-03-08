package tiendajuguete;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Juguete {
    private String nombre;
    private int edadRecomendada;
    private double precioAlquiler;
    private boolean alquilado;

    public Juguete(String nombre, int edadRecomendada, double precioAlquiler) {
        this.nombre = nombre;
        this.edadRecomendada = edadRecomendada;
        this.precioAlquiler = precioAlquiler;
        this.alquilado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public boolean estaAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "nombre='" + nombre + '\'' +
                ", edadRecomendada=" + edadRecomendada +
                ", precioAlquiler=" + precioAlquiler +
                ", alquilado=" + alquilado +
                '}';
    }
}

