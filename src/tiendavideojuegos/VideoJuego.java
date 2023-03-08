package tiendavideojuegos;

public class VideoJuego {
    private String titulo;
    private String desarrollador;
    private String plataforma;
    private double precioAlquilerPorDia;
    private boolean alquilado;

    public VideoJuego(String titulo, String desarrollador, String plataforma, double precioAlquilerPorDia) {
        this.titulo = titulo;
        this.desarrollador = desarrollador;
        this.plataforma = plataforma;
        this.precioAlquilerPorDia = precioAlquilerPorDia;
        this.alquilado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public double getPrecioAlquilerPorDia() {
        return precioAlquilerPorDia;
    }

    public boolean estaAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", precioAlquilerPorDia=" + precioAlquilerPorDia +
                ", alquilado=" + alquilado +
                '}';
    }
}

