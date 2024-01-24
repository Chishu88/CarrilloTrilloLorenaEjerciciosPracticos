package com.example.ejercicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class RefranController {

    @GetMapping("/")
    public String refranAleatorio(){

        List<String> refranesAleatorios = new ArrayList<>();

      refranesAleatorios.add("No hay que por bien no venga");
      refranesAleatorios.add("Al que madruga Dios le ayuda");
      refranesAleatorios.add("Al mal tiempo, buena cara");
      refranesAleatorios.add("Más vale tarde que nunca");
      refranesAleatorios.add("Quien tiene boca se equivoca");

       return refranesAleatorios.get(new Random().nextInt(refranesAleatorios.size()));

    }

}
