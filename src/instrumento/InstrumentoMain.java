package instrumento;

public class InstrumentoMain {
	public static void main(String[] args) {
	    TiendaMusica tienda = new TiendaMusica("Mi Tienda de Música", "Calle Principal 123");

	    // Agregamos algunos instrumentos a la tienda
	    Instrumento instrumento1 = new Instrumento("Guitarra", "Fender", 15.0);
	    Instrumento instrumento2 = new Instrumento("Teclado", "Roland", 20.0);
	    Instrumento instrumento3 = new Instrumento("Batería", "Pearl", 30.0);
	    tienda.agregarInstrumento(instrumento1);
	    tienda.agregarInstrumento(instrumento2);
	    tienda.agregarInstrumento(instrumento3);

	    // Mostramos la lista de instrumentos disponibles
	    System.out.println("Instrumentos disponibles:");
	    tienda.mostrarInstrumentosDisponibles();

	    // Prestamos un instrumento
	    tienda.prestarInstrumento(instrumento1);
	    tienda.prestarInstrumento(instrumento3);

	    // Mostramos la lista de instrumentos disponibles después de prestar algunos
	    System.out.println("Instrumentos disponibles después de prestar algunos:");
	    tienda.mostrarInstrumentosDisponibles();

	    // Devolvemos un instrumento
	    tienda.devolverInstrumento(instrumento1);

	    // Mostramos la lista de instrumentos disponibles después de devolver uno
	    System.out.println("Instrumentos disponibles después de devolver uno:");
	    tienda.mostrarInstrumentosDisponibles();
	}

}
