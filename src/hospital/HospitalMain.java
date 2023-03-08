package hospital;

import java.time.LocalDate;
import java.util.List;

public class HospitalMain {

	public static void main(String[] args) {
		   Hospital miHospital = new Hospital("Mi Hospital", "Calle Principal 123");
	        
	        // Creamos algunos pacientes y los agregamos al hospital
	        Paciente paciente1 = new Paciente("Juan Pérez", 35, "Masculino", LocalDate.of(2022, 2, 10), "COVID-19", "Grave");
	        Paciente paciente2 = new Paciente("María Gómez", 45, "Femenino", LocalDate.of(2022, 2, 15), "Gripe", "Leve");
	        Paciente paciente3 = new Paciente("Pedro López", 55, "Masculino", LocalDate.of(2022, 2, 20), "Cáncer", "Terminal");
	        miHospital.agregarPaciente(paciente1);
	        miHospital.agregarPaciente(paciente2);
	        miHospital.agregarPaciente(paciente3);
	        
	        // Mostramos la lista de pacientes registrados
	        System.out.println("Lista de pacientes registrados:");
	        miHospital.mostrarPacientesRegistrados();
	        
	        // Buscamos pacientes por diagnóstico
	        System.out.println("Buscando pacientes por diagnóstico:");
	        List<Paciente> pacientesConDiagnostico = miHospital.buscarPacientesPorDiagnostico("COVID-19");
	        if (!pacientesConDiagnostico.isEmpty()) {
	            System.out.println("Pacientes encontrados:");
	            for (Paciente paciente : pacientesConDiagnostico) {
	                System.out.println(paciente);
	            }
	        } else {
	            System.out.println("No se encontraron pacientes con ese diagnóstico.");
	        }
	        
	        // Buscamos pacientes por estado de salud
	        System.out.println("Buscando pacientes por estado de salud:");
	        List<Paciente> pacientesConEstadoSalud = miHospital.buscarPacientesPorEstadoSalud("Leve");
	        if (!pacientesConEstadoSalud.isEmpty()) {
	            System.out.println("Pacientes encontrados:");
	            for (Paciente paciente : pacientesConEstadoSalud) {
	                System.out.println(paciente);
	            }
	        } else {
	            System.out.println("No se encontraron pacientes con ese estado de salud.");
	        }
	        
	        // Damos de alta a un paciente y mostramos la lista de pacientes registrados
	        miHospital.darDeAltaPaciente(paciente2);
	        miHospital.mostrarPacientesRegistrados();
	    }

	}