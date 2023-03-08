package escuela;

import java.util.Map;

public class Alumno {
    private String nombre;
    private int edad;
    private String genero;
    private Map<String, Double> calificaciones;
    
    public Alumno(String nombre, int edad, String genero, Map<String, Double> calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.calificaciones = calificaciones;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public Map<String, Double> getCalificaciones() {
        return calificaciones;
    }
    
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", calificaciones=" + calificaciones +
                '}';
    }
}

