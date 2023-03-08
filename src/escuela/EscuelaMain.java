package escuela;

import java.util.List;
import java.util.Map;

public class EscuelaMain {
	public static void main(String[] args) {
	    Escuela miEscuela = new Escuela("Mi Escuela", "Calle Principal 123");
	    
	    // Creamos algunos alumnos y los agregamos a la escuela
	    Alumno alumno1 = new Alumno("Juan Pérez", 16, "Masculino", Map.of("Matemáticas", 8.5, "Historia", 9.2));
	    Alumno alumno2 = new Alumno("María Gómez", 17, "Femenino", Map.of("Matemáticas", 9.0, "Historia", 7.8));
	    Alumno alumno3 = new Alumno("Pedro López", 15, "Masculino", Map.of("Matemáticas", 7.0, "Historia", 6.5));
	    miEscuela.agregarAlumno(alumno1);
	    miEscuela.agregarAlumno(alumno2);
	    miEscuela.agregarAlumno(alumno3);
	    
	    // Mostramos la lista de alumnos
	    System.out.println("Lista de alumnos:");
	    miEscuela.mostrarAlumnos();
	    
	    // Buscamos un alumno por nombre
	    System.out.println("Buscando alumno por nombre:");
	    Alumno alumnoEncontrado = miEscuela.buscarAlumnoPorNombre("María Gómez");
	    if (alumnoEncontrado != null) {
	        System.out.println("Alumno encontrado: " + alumnoEncontrado);
	    } else {
	        System.out.println("No se encontró ningún alumno con ese nombre.");
	    }
	    
	    // Buscamos alumnos por calificación
	    System.out.println("Buscando alumnos por calificación:");
	    List<Alumno> alumnosConCalificacion = miEscuela.buscarAlumnosPorCalificacion(7.0);
	    if (!alumnosConCalificacion.isEmpty()) {
	        System.out.println("Alumnos encontrados:");
	        for (Alumno alumno : alumnosConCalificacion) {
	            System.out.println(alumno);
	        }
	    } else {
	        System.out.println("No se encontraron alumnos con esa calificación.");
	    }
	}

}
