package serie2;

public class Serie {
	
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this("", 3, false, "", "");
    }

    public Serie(String titulo, String creador) {
        this(titulo, 3, false, "", creador);
    }

    public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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

    public int compareTo(Serie otraSerie) {
        int resultado = 0;
        if (numeroTemporadas > otraSerie.getNumeroTemporadas()) {
            resultado = 1;
        } else if (numeroTemporadas < otraSerie.getNumeroTemporadas()) {
            resultado = -1;
        }
        return resultado;
    }

    public String toString() {
        return "Informacion de la Serie: \n" +
                "\tTitulo: " + titulo + "\n" +
                "\tNumero de temporadas: " + numeroTemporadas + "\n" +
                "\tGenero: " + genero + "\n" +
                "\tCreador: " + creador;
    }

    public boolean equals(Serie otraSerie) {
        return titulo.equalsIgnoreCase(otraSerie.getTitulo()) &&
                creador.equalsIgnoreCase(otraSerie.getCreador());
    }

}

