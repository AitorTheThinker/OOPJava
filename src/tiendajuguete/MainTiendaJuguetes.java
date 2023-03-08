package tiendajuguete;

public class MainTiendaJuguetes {
	public static void main(String[] args) {
        TiendaJuguetes tienda = new TiendaJuguetes("Juguetes R Us", "Calle Falsa 123");

		// Agregamos algunos juguetes a la tienda
		Juguete juguete1 = new Juguete("Pelota", 3, 5.0);
		Juguete juguete2 = new Juguete("Muñeca", 6, 8.0);
		Juguete juguete3 = new Juguete("Rompecabezas", 10, 12.0);
		tienda.agregarJuguete(juguete1);
		tienda.agregarJuguete(juguete2);
		tienda.agregarJuguete(juguete3);

		// Mostramos la lista de juguetes disponibles
		System.out.println("Juguetes disponibles:");
		tienda.mostrarJuguetesDisponibles();

		// Alquilamos un juguete
		tienda.alquilarJuguete(juguete1);
		tienda.alquilarJuguete(juguete3);

		// Mostramos la lista de juguetes disponibles después de alquilar algunos
		System.out.println("Juguetes disponibles después de alquilar algunos:");
		tienda.mostrarJuguetesDisponibles();

		// Devolvemos un juguete
		tienda.devolverJuguete(juguete1);

		// Mostramos la lista de juguetes disponibles después de devolver uno
		System.out.println("Juguetes disponibles después de devolver uno:");
		tienda.mostrarJuguetesDisponibles();

	}
}
