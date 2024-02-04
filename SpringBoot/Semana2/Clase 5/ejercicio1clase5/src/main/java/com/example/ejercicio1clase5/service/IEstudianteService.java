package com.example.ejercicio1clase5.service;

import com.example.ejercicio1clase5.model.Calificacion;
import com.example.ejercicio1clase5.model.Estudiante;

import java.util.List;

public interface IEstudianteService {

    String agregarEstudiante(Estudiante estudiante);
    String asignarCalificaciones(String num_matricula, Calificacion calificacion);
    List<Estudiante> obtenerEstudiantes();
    Calificacion obtenerCalificacionesPorMatricula(String num_matricula);
    List<Calificacion> obtenerCalificacionesOrdenadas();

}
