package hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {
    private String nombre;
    private String direccion;
    private List<Paciente> pacientesRegistrados;
    
    public Hospital(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pacientesRegistrados = new ArrayList<>();
    }
    
    public void agregarPaciente(Paciente paciente) {
        pacientesRegistrados.add(paciente);
    }
    
    public void darDeAltaPaciente(Paciente paciente) {
        pacientesRegistrados.remove(paciente);
        System.out.println("El paciente " + paciente.getNombre() + " ha sido dado de alta.");
    }
    
    public List<Paciente> buscarPacientesPorDiagnostico(String diagnostico) {
        return pacientesRegistrados.stream()
                .filter(paciente -> paciente.getDiagnostico().equals(diagnostico))
                .collect(Collectors.toList());
    }
    
    public List<Paciente> buscarPacientesPorEstadoSalud(String estadoSalud) {
        return pacientesRegistrados.stream()
                .filter(paciente -> paciente.getEstadoSalud().equals(estadoSalud))
                .collect(Collectors.toList());
    }
    
    public void mostrarPacientesRegistrados() {
        if (!pacientesRegistrados.isEmpty()) {
            System.out.println("Pacientes registrados en " + nombre + ":");
            for (Paciente paciente : pacientesRegistrados) {
                System.out.println(paciente);
            }
        } else {
            System.out.println("No hay pacientes registrados en " + nombre + " en este momento.");
        }
    }
}