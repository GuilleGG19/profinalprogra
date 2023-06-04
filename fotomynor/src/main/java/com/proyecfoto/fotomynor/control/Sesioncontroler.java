package com.proyecfoto.fotomynor.control;

import com.proyecfoto.fotomynor.entity.Sesion;
import com.proyecfoto.fotomynor.service.Sesionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/sesion")

public class Sesioncontroler {
    @Autowired
    Sesionservice sesionservice;
    @GetMapping
    public List<Sesion> mostrarSesion(){
        return sesionservice.findAll();
    }
    @GetMapping(value = "/{id}")
    public Sesion buscarid(@RequestParam Long id){
        return sesionservice.findById(id);
    }
    @GetMapping(value = "/{nombre}")
    public List<Sesion> buscarnombre(@RequestParam String nombre){
        return sesionservice.findBynombre(nombre);
    }
    @PostMapping()
    public void crearsesion(@RequestBody Sesion sesion){
        sesionservice.crearsesion(sesion);
    }
    @PutMapping(value = "/{id}")
    public void modificarsesion(@PathVariable Long id, @RequestBody Sesion sesion){
        sesionservice.modificarsesion(id, sesion);
    }
    @DeleteMapping(value = "/{id}")
    public void borrarsesion(@PathVariable Long id){
        sesionservice.eliminarsesion(id);
    }
}
