package com.example.ejercicio1clase5.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

    private String num_matricula;

    private String nombre;

    private String apellido;

    private String fecha_nacimiento;

}
