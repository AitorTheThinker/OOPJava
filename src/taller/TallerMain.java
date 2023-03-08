package taller;

public class TallerMain {
	public static void main(String[] args) {
		 TallerMecanico miTaller = new TallerMecanico("Mi Taller", "Calle Principal 123");
	        
	        // Creamos algunas herramientas y las agregamos al taller
	        Herramienta herramienta1 = new Herramienta("Llave inglesa", "Llave", 10.0, true);
	        Herramienta herramienta2 = new Herramienta("Martillo", "Martillo", 8.0, true);
	        Herramienta herramienta3 = new Herramienta("Destornillador", "Destornillador", 5.0, false);
	        miTaller.agregarHerramienta(herramienta1);
	        miTaller.agregarHerramienta(herramienta2);
	        miTaller.agregarHerramienta(herramienta3);
	        
	        // Mostramos las herramientas disponibles
	        miTaller.mostrarHerramientasDisponibles();
	        
	        // Prestamos una herramienta
	        miTaller.prestarHerramienta(herramienta1);
	        
	        // Mostramos las herramientas disponibles
	        miTaller.mostrarHerramientasDisponibles();
	        
	        // Devolvemos la herramienta
	        miTaller.devolverHerramienta(herramienta1);
	        
	        // Mostramos las herramientas disponibles
	        miTaller.mostrarHerramientasDisponibles();
	    }
	}