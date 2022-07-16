package com.apiregistro2022.service;

import com.apiregistro2022.entity.Perfil;
import java.util.List;
import java.util.Optional;

public interface PerfilService {
    //Mostrar todo
    List<Perfil> findAll();
    //Mostrar todos los habilitados
    List<Perfil> findAllCustom();
    //buscar pòr nombre
    List<Perfil> findbyName();
    //buscar pòr codigo
    Optional<Perfil> findById(Long id);
    //agregar
    Perfil add(Perfil pe);
    //actualizar
    Perfil update(Perfil pe);
    //eliminar
    Perfil delete(Perfil pe);
}
