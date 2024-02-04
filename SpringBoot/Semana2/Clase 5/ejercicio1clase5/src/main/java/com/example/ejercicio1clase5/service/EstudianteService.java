package com.example.ejercicio1clase5.service;

import com.example.ejercicio1clase5.model.Calificacion;
import com.example.ejercicio1clase5.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EstudianteService implements IEstudianteService {

    private final List<Estudiante> estudiantes = new ArrayList<>();
    private final Map<String, Calificacion> calificacionesPorMatricula = new HashMap<>();

    @Override
    public String agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        return "Estudiante agregado exitosamente: " + estudiante.getNombre() + " " + estudiante.getApellido();
    }

    @Override
    public String asignarCalificaciones(String num_matricula, Calificacion calificacion) {
        // Busca el estudiante por su matrícula
        Estudiante estudiante = estudiantes.stream()
                .filter(e -> e.getNum_matricula().equals(num_matricula))
                .findFirst()
                .orElse(null);

        // Verifica si el estudiante existe
        if (estudiante != null) {
            // Asigna las calificaciones al estudiante
            calificacionesPorMatricula.put(num_matricula, calificacion);
            return "Calificaciones asignadas correctamente.";
        } else {
            // El estudiante con la matrícula proporcionada no existe
            return "El estudiante con la matrícula proporcionada no existe.";
        }
    }


    @Override
    public List<Estudiante> obtenerEstudiantes() {
        return estudiantes;
    }

    @Override
    public Calificacion obtenerCalificacionesPorMatricula(String num_matricula) {
        return calificacionesPorMatricula.get(num_matricula);
    }

    @Override
    public List<Calificacion> obtenerCalificacionesOrdenadas() {
        return calificacionesPorMatricula.values()
                .stream()
                .sorted((c1, c2) -> Double.compare(c2.getPromedio(), c1.getPromedio()))
                .collect(Collectors.toList());
    }
}