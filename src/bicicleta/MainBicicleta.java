package bicicleta;

public class MainBicicleta {
	public static void main(String[] args) {
	    EstacionBicicletas estacion = new EstacionBicicletas("Mi Estación de Bicicletas", "Calle Principal 123");
	    
	    // Creamos algunas bicicletas y las agregamos a la estación
	    Bicicleta bici1 = new Bicicleta("ABC123", "Montaña", 10.0, false);
	    Bicicleta bici2 = new Bicicleta("DEF456", "Urbana", 8.0, false);
	    Bicicleta bici3 = new Bicicleta("GHI789", "Ruta", 12.0, false);
	    estacion.agregarBicicleta(bici1);
	    estacion.agregarBicicleta(bici2);
	    estacion.agregarBicicleta(bici3);
	    
	    // Mostramos las bicicletas disponibles
	    estacion.mostrarBicicletasDisponibles();
	    
	    // Alquilamos una bicicleta
	    estacion.alquilarBicicleta(bici2);
	    
	    // Volvemos a mostrar las bicicletas disponibles
	    estacion.mostrarBicicletasDisponibles();
	    
	    // Devolvemos la bicicleta alquilada
	    estacion.devolverBicicleta(bici2);
	    
	    // Mostramos las bicicletas disponibles después de devolver la bicicleta
	    estacion.mostrarBicicletasDisponibles();
	}

}
