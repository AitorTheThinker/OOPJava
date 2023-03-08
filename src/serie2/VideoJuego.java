package serie2;

public class VideoJuego {
	
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = false;
    }

    public VideoJuego(String titulo, String compania) {
        this(titulo, 10, "", compania);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    public void entregar() {
        entregado = true;
    }

    public void devolver() {
        entregado = false;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public int compareTo(VideoJuego otroVideoJuego) {
        int resultado = 0;
        if (horasEstimadas > otroVideoJuego.getHorasEstimadas()) {
            resultado = 1;
        } else if (horasEstimadas < otroVideoJuego.getHorasEstimadas()) {
            resultado = -1;
        }
        return resultado;
    }

    public String toString() {
        return "Informacion del Videojuego: \n" +
                "\tTitulo: " + titulo + "\n" +
                "\tHoras estimadas: " + horasEstimadas + "\n" +
                "\tGenero: " + genero + "\n" +
                "\tCompania: " + compania;
    }

    public boolean equals(VideoJuego otroVideoJuego) {
        return titulo.equalsIgnoreCase(otroVideoJuego.getTitulo()) &&
                compania.equalsIgnoreCase(otroVideoJuego.getCompania());
    }
}
