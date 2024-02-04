package com.example.ejercicio1clase5.controller;

import com.example.ejercicio1clase5.model.Calificacion;
import com.example.ejercicio1clase5.model.Estudiante;
import com.example.ejercicio1clase5.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/estudiante")
    public String agregarEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.agregarEstudiante(estudiante);
    }

    @PostMapping("/estudiante/{num_matricula}/calificacion")
    public String asignarCalificacion(@PathVariable String num_matricula, @RequestBody Calificacion calificacion) {
        return estudianteService.asignarCalificaciones(num_matricula, calificacion);
    }

    @GetMapping("/estudiantes")
    public List<Estudiante> obtenerEstudiantes() {
        return estudianteService.obtenerEstudiantes();
    }

    @GetMapping("/calificaciones/{num_matricula}")
    public Calificacion obtenerCalificacion(@PathVariable String num_matricula) {
        return estudianteService.obtenerCalificacionesPorMatricula(num_matricula);
    }

    @GetMapping("/calificaciones/ordenadas")
    public List<Calificacion> obtenerCalificacionOrdenada() {
        return estudianteService.obtenerCalificacionesOrdenadas();
    }
}