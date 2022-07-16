package com.apiregistro2022.service;

import com.apiregistro2022.entity.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    //Mostrar todo
    List<Producto> findAll();
    //Mostrar todos los habilitados
    List<Producto> findAllCustom();
    //buscar pòr nombre
    List<Producto> findbyName();
    //buscar pòr codigo
    Optional<Producto> findById(Long id);
    //agregar
    Producto add(Producto pr);
    //actualizar
    Producto update(Producto pr);
    //eliminar
    Producto delete(Producto pr);
}
