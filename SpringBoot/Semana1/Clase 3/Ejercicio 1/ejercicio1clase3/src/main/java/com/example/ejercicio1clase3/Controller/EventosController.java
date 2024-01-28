package com.example.ejercicio1clase3.Controller;

import com.example.ejercicio1clase3.model.Eventos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

@RestController
public class EventosController {

    List<Eventos> listaEventos = new ArrayList<>();
    private Long eventosId = 1L;

    @GetMapping("/eventos")
    public List<Eventos> mostrarEventos(){

     return listaEventos;

    }

    @GetMapping("/eventos/eventosProximos")
    public List<Eventos> eventosProximos(){
        LocalDate fechaActual = LocalDate.now();

        List<Eventos> eventosProximos = listaEventos.stream()
                .filter(evento -> {
                    LocalDate fechaEvento = LocalDate.parse(evento.getFecha());
                    return  fechaEvento.isAfter(fechaActual) || fechaEvento.isEqual(fechaActual);
                })
                .collect(Collectors.toList());

        return  eventosProximos;
    }

    @PostMapping("/eventos/agregar")
    public Eventos crearEvento(@RequestBody Eventos nuevoEvento){
       //nuevoEvento.setId((long) (listaEventos.size() + 1)); // Crear Id incremental sin JPA
        nuevoEvento.setId(eventosId++);
       listaEventos.add(nuevoEvento);
       return nuevoEvento;
    }

    @GetMapping("/eventos/{id}")
    public Eventos eventoId(@PathVariable Long id){
        return listaEventos.stream()
                .filter(eventos -> eventos.getId().equals(id))
                .findFirst()
                .orElse(new Eventos());
    }

}
