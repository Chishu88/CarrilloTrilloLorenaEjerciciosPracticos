package com.example.ejercicio1clase5.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Calificacion {

    private int calificacionId;

    private double calificacion1;

    private double calificacion2;

    private double calificacion3;

    private double promedio;



    public Calificacion(int calificacionId, double calificacion1, double calificacion2, double calificacion3, double promedio) {
        this.calificacionId = calificacionId;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        this.promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }
}
