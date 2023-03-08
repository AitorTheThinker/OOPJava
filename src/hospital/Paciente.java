package hospital;

import java.time.LocalDate;

public class Paciente {
    private String nombre;
    private int edad;
    private String genero;
    private LocalDate fechaIngreso;
    private String diagnostico;
    private String estadoSalud;
    
    public Paciente(String nombre, int edad, String genero, LocalDate fechaIngreso, String diagnostico, String estadoSalud) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.fechaIngreso = fechaIngreso;
        this.diagnostico = diagnostico;
        this.estadoSalud = estadoSalud;
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
    
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    
    public String getDiagnostico() {
        return diagnostico;
    }
    
    public String getEstadoSalud() {
        return estadoSalud;
    }
    
    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }
    
    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", diagnostico='" + diagnostico + '\'' +
                ", estadoSalud='" + estadoSalud + '\'' +
                '}';
    }
}
