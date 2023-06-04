package com.proyecfoto.fotomynor.service;


import com.proyecfoto.fotomynor.entity.Sesion;
import com.proyecfoto.fotomynor.dao.Sesiondao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

public interface Sesionservice {
    public List<Sesion> findAll();
    public  Sesion findById(Long id);
    public List<Sesion> findBynombre(String nombre);
    public void crearsesion(Sesion sesion);
    public void modificarsesion(Long id, Sesion sesion);
    public void eliminarsesion(Long id);

}
