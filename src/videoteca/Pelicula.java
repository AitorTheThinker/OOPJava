package videoteca;

public class Pelicula {
    private String titulo;
    private String director;
    private int duracion; // en minutos
    private String genero;
    private double precioAlquiler; // en pesos colombianos
    private boolean disponible; // true si está disponible, false si está prestada
    
    public Pelicula(String titulo, String director, int duracion, String genero, double precioAlquiler) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.precioAlquiler = precioAlquiler;
        this.disponible = true;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getDirector() {
        return director;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public double getPrecioAlquiler() {
        return precioAlquiler;
    }
    
    public boolean estaDisponible() {
        return disponible;
    }
    
    public void prestar() {
        disponible = false;
    }
    
    public void devolver() {
        disponible = true;
    }
    
    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", precioAlquiler=" + precioAlquiler +
                ", disponible=" + disponible +
                '}';
    }
}
