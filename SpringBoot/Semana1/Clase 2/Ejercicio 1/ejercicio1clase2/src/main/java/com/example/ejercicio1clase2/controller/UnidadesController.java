package com.example.ejercicio1clase2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnidadesController {

    @GetMapping("/unidades")
    public String convertirCm(@RequestParam("cm") double cm){

        double metros = cm/100;

        return "La cantidad en cm convertida a metros es: " + metros;

    }


}
