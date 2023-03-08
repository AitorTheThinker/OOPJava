package videoteca;

public class VideoTecaMain {
	public static void main(String[] args) {
	    VideoTeca miVideoteca = new VideoTeca("Mi Videoteca", "Calle Principal 123");
	    
	    // Creamos algunas películas y las agregamos a la videoteca
	    Pelicula pelicula1 = new Pelicula("El Padrino", "Francis Ford Coppola", 175, "Drama", 2000.0);
	    Pelicula pelicula2 = new Pelicula("El Señor de los Anillos: La Comunidad del Anillo", "Peter Jackson", 178, "Fantasía", 2500.0);
	    Pelicula pelicula3 = new Pelicula("Titanic", "James Cameron", 194, "Romance", 1800.0);
	    miVideoteca.agregarPelicula(pelicula1);
	    miVideoteca.agregarPelicula(pelicula2);
	    miVideoteca.agregarPelicula(pelicula3);
	    
	    // Mostramos las películas disponibles
	    miVideoteca.mostrarPeliculasDisponibles();
	    
	    // Prestamos una película y volvemos a mostrar las películas disponibles
	    miVideoteca.prestarPelicula(pelicula2);
	    miVideoteca.mostrarPeliculasDisponibles();
	    
	    // Devolvemos la película y volvemos a mostrar las películas disponibles
	    miVideoteca.devolverPelicula(pelicula2);
	    miVideoteca.mostrarPeliculasDisponibles();
	}

}
