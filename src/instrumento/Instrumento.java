package instrumento;

public class Instrumento {
    private String tipo;
    private String marca;
    private double precioAlquiler;
    private boolean prestado;

    public Instrumento(String tipo, String marca, double precioAlquiler) {
        this.tipo = tipo;
        this.marca = marca;
        this.precioAlquiler = precioAlquiler;
        this.prestado = false;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return tipo + " " + marca + " - Precio de alquiler: " + precioAlquiler + " - Disponibilidad: " + (prestado ? "No disponible" : "Disponible");
    }
}

