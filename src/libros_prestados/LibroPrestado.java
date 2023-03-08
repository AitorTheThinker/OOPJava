package libros_prestados;

public class LibroPrestado {
	
    private String titulo;
    private String autor;
    private String isbn;
    private int numPaginas;
    private int cantCopiasDisponibles;
    
public LibroPrestado() {
	
}
    public LibroPrestado(String titulo, String autor, String isbn, int numPaginas, int cantCopiasDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.cantCopiasDisponibles = cantCopiasDisponibles;
    }

	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getCantCopiasDisponibles() {
        return cantCopiasDisponibles;
    }

    public void setCantCopiasDisponibles(int cantCopiasDisponibles) {
        this.cantCopiasDisponibles = cantCopiasDisponibles;
    }

    public void prestar() {
        if (cantCopiasDisponibles > 0) {
            cantCopiasDisponibles--;
        } else {
            System.out.println("No hay copias disponibles para prestar el libro");
        }
    }
    
   

    public void devolver() {
        cantCopiasDisponibles++;
    }
    
    @Override
	public String toString() {
		return "LibroPrestado [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", numPaginas=" + numPaginas
				+ ", cantCopiasDisponibles=" + cantCopiasDisponibles + "]";
	}
}
