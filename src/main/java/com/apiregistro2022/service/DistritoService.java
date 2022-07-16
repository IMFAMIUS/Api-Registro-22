package com.apiregistro2022.service;

import com.apiregistro2022.entity.Distrito;
import java.util.List;
import java.util.Optional;

public interface DistritoService {
    //Mostrar todo
    List<Distrito> findAll();
    //Mostrar todos los habilitados
    List<Distrito> findAllCustom();
    //buscar pòr nombre
    List<Distrito> findbyName();
    //buscar pòr codigo
    Optional<Distrito> findById(Long id);
    //agregar
    Distrito add(Distrito d);
    //actualizar
    Distrito update(Distrito d);
    //eliminar
    Distrito delete(Distrito d);
}
