package tiendavideojuegos;

public class TiendaVideojuegosMain {
	public static void main(String[] args) {
        // Creamos la tienda de videojuegos
        TiendaVideojuegos tienda = new TiendaVideojuegos("Mi Tienda de Videojuegos", "Calle Falsa 123");

        // Creamos algunos videojuegos
        VideoJuego v1 = new VideoJuego("The Legend of Zelda: Breath of the Wild", "Nintendo", "Nintendo Switch", 1.5);
        VideoJuego v2 = new VideoJuego("Grand Theft Auto V", "Rockstar North", "PlayStation 4", 2.0);
        VideoJuego v3 = new VideoJuego("Minecraft", "Mojang Studios", "Xbox One", 1.0);

        // Agregamos los videojuegos a la tienda
        tienda.agregarVideojuego(v1);
        tienda.agregarVideojuego(v2);
        tienda.agregarVideojuego(v3);

        // Mostramos los videojuegos disponibles
        tienda.mostrarVideojuegosDisponibles();

        // Alquilamos un videojuego
        tienda.alquilarVideojuego(v2);

        // Mostramos los videojuegos disponibles de nuevo
        tienda.mostrarVideojuegosDisponibles();

        // Devolvemos el videojuego alquilado
        tienda.devolverVideojuego(v2);

        // Mostramos los videojuegos disponibles de nuevo
        tienda.mostrarVideojuegosDisponibles();
    }
}