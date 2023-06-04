package com.proyecfoto.fotomynor.dao;


import com.proyecfoto.fotomynor.entity.Sesion;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface Sesiondao extends CrudRepository<Sesion, Long> {
    List<Sesion> findByNombre (String nombre);

}
