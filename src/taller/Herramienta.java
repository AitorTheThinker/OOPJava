package taller;

public class Herramienta {
    private String nombre;
    private String tipo;
    private double precioAlquiler;
    private boolean disponible;
    
    public Herramienta(String nombre, String tipo, double precioAlquiler, boolean disponible) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioAlquiler = precioAlquiler;
        this.disponible = disponible;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public double getPrecioAlquiler() {
        return precioAlquiler;
    }
    
    public boolean estaDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    @Override
    public String toString() {
        return "Herramienta{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precioAlquiler=" + precioAlquiler +
                ", disponible=" + disponible +
                '}';
    }
}
