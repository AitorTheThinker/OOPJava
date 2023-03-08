package serie2;

public class EntregableMain {
	public static void main(String[] args) {
	    Serie[] series = new Serie[5];
	    VideoJuego[] videojuegos = new VideoJuego[5];

	    series[0] = new Serie("Juego de Tronos", 8, true, "Fantasía", "HBO");
	    series[1] = new Serie("Breaking Bad", 5, true, "Drama", "AMC");
	    series[2] = new Serie("Friends", 10, false, "Comedia", "NBC");
	    series[3] = new Serie("Stranger Things", 3, true, "Ciencia Ficción", "Netflix");
	    series[4] = new Serie("The Crown", 4, false, "Drama", "Netflix");

	    videojuegos[0] = new VideoJuego("The Legend of Zelda: Breath of the Wild", 50, "Aventura", "Nintendo");
	    videojuegos[1] = new VideoJuego("Super Mario Odyssey", "Nintendo");
	    videojuegos[2] = new VideoJuego("Red Dead Redemption 2", 80, "Acción", "Rockstar Games");
	    videojuegos[3] = new VideoJuego("The Witcher 3: Wild Hunt", 100, "RPG", "CD Projekt Red");
	    videojuegos[4] = new VideoJuego("Fortnite", 20, "Battle Royale", "Epic Games");

	    series[0].entregar();
	    series[3].entregar();
	    videojuegos[2].entregar();
	    videojuegos[3].entregar();

	    int numSeriesEntregadas = contarEntregados(series);
	    int numVideojuegosEntregados = contarEntregados(videojuegos);

	    System.out.println("Hay " + numSeriesEntregadas + " series entregadas.");
	    System.out.println("Hay " + numVideojuegosEntregados + " videojuegos entregados.");

	    VideoJuego videojuegoMasHoras = videojuegos[0];
	    for (int i = 1; i < videojuegos.length; i++) {
	        if (videojuegos[i].getHorasEstimadas() > videojuegoMasHoras.getHorasEstimadas()) {
	            videojuegoMasHoras = videojuegos[i];
	        }
	    }

	    Serie serieMasTemporadas = series[0];
	    for (int i = 1; i < series.length; i++) {
	        if (series[i].getNumeroTemporadas() > serieMasTemporadas.getNumeroTemporadas()) {
	            serieMasTemporadas = series[i];
	        }
	    }

	    System.out.println("El videojuego con más horas es: " + videojuegoMasHoras.toString());
	    System.out.println("La serie con más temporadas es: " + serieMasTemporadas.toString());
	}

	public static int contarEntregados(Object[] arr) {
	    int count = 0;
	    for (Object obj : arr) {
	        if (obj instanceof Serie) {
	            Serie serie = (Serie) obj;
	            if (serie.isEntregado()) {
	                count++;
	                serie.devolver();
	            }
	        } else if (obj instanceof VideoJuego) {
	            VideoJuego videojuego = (VideoJuego) obj;
	            if (videojuego.isEntregado()) {
	                count++;
	                videojuego.devolver();
	            }
	        }
	    }
	    return count;
	}

}
