package escuela;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
	    private String nombre;
	    private String direccion;
	    private List<Alumno> alumnos;
	    
	    public Escuela(String nombre, String direccion) {
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.alumnos = new ArrayList<>();
	    }
	    
	    public void agregarAlumno(Alumno alumno) {
	        alumnos.add(alumno);
	    }
	    
	    public void eliminarAlumno(Alumno alumno) {
	        alumnos.remove(alumno);
	    }
	    
	    public void mostrarAlumnos() {
	        for (Alumno alumno : alumnos) {
	            System.out.println(alumno);
	        }
	    }
	    
	    public Alumno buscarAlumnoPorNombre(String nombre) {
	        for (Alumno alumno : alumnos) {
	            if (alumno.getNombre().equals(nombre)) {
	                return alumno;
	            }
	        }
	        return null; // no se encontró ningún alumno con ese nombre
	    }
	    
	    public List<Alumno> buscarAlumnosPorCalificacion(double calificacion) {
	        List<Alumno> alumnosConCalificacion = new ArrayList<>();
	        for (Alumno alumno : alumnos) {
	            for (Double nota : alumno.getCalificaciones().values()) {
	                if (nota == calificacion) {
	                    alumnosConCalificacion.add(alumno);
	                    break; // solo agrega el alumno una vez, aunque tenga varias materias con esa calificación
	                }
	            }
	        }
	        return alumnosConCalificacion;
	    }
}
