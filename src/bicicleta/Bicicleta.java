package bicicleta;

public class Bicicleta {
    private String numeroSerie;
    private String tipo;
    private double precioAlquilerHora;
    private boolean alquilada;
    
    public Bicicleta(String numeroSerie, String tipo, double precioAlquilerHora, boolean alquilada) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
        this.precioAlquilerHora = precioAlquilerHora;
        this.alquilada = alquilada;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public double getPrecioAlquilerHora() {
        return precioAlquilerHora;
    }
    
    public boolean estaAlquilada() {
        return alquilada;
    }
    
    public void setAlquilada(boolean alquilada) {
        this.alquilada = alquilada;
    }
    
    @Override
    public String toString() {
        return "Bicicleta{" +
                "numeroSerie='" + numeroSerie + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precioAlquilerHora=" + precioAlquilerHora +
                ", alquilada=" + alquilada +
                '}';
    }
}