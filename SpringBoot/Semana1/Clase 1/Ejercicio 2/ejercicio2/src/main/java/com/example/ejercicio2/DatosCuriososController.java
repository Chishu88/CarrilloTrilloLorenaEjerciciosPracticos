package com.example.ejercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class DatosCuriososController {

    @GetMapping("/")
    public String datosCursiosos(){

        List<String> datosCuriosos = new ArrayList<>();

        datosCuriosos.add("Los delfines tienen la capacidad de reconocer y recordar estos silbidos especificos incluso después de mucho tiempo");
        datosCuriosos.add("Las hormigas son capaces de llevar objetos que son hasta 50 veces su propio peso");
        datosCuriosos.add("Algunas especies de bambú pueden crecer extremadamente rápido, hasta unos 30 cm o más por día");
        datosCuriosos.add("Los muerciélagos son los únicos mamíferos capaces de volar");
        datosCuriosos.add("Existen 3 especies de comadrejas que cambian sus cálidos colores marrones de verano por blancos en invierno");

        return datosCuriosos.get(new Random().nextInt(datosCuriosos.size()));

    }
}
