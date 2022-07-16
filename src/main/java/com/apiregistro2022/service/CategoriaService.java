package com.apiregistro2022.service;

import com.apiregistro2022.entity.Categoria;
import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    //Mostrar todo
    List<Categoria> findAll();
    //Mostrar todos los habilitados
    List<Categoria> findAllCustom();
    //buscar pòr nombre
    List<Categoria> findbyName();
    //buscar pòr codigo
    Optional<Categoria> findById(Long id);
    //agregar
    Categoria add(Categoria ca);
    //actualizar
    Categoria update(Categoria ca);
    //eliminar
    Categoria delete(Categoria ca);
}
