package com.proyecfoto.fotomynor.service;

import com.proyecfoto.fotomynor.dao.Sesiondao;
import com.proyecfoto.fotomynor.entity.Sesion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sesionimpl implements Sesionservice {
    @Autowired
    private Sesiondao sesiondao;

    @Override
    public List<Sesion> findAll() {
        return (List<Sesion>)sesiondao.findAll();
    }

    @Override
    public Sesion findById(Long id) {
        return sesiondao.findById(id).orElse(null);
    }

    @Override
    public List<Sesion> findBynombre(String nombre) {
        return sesiondao.findByNombre(nombre);
    }

    @Override
    public void crearsesion(Sesion sesion) {
        sesiondao.save(sesion);
    }

    @Override
    public void modificarsesion(Long id, Sesion sesion) {
        if(sesiondao.existsById(id)){
        sesion.setId(id);
        sesiondao.save(sesion);
        }
    }

    @Override
    public void eliminarsesion(Long id) {
        if (sesiondao.existsById(id)){
            sesiondao.deleteById(id);
        }
    }
}
