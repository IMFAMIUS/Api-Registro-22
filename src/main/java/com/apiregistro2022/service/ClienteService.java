package com.apiregistro2022.service;

import com.apiregistro2022.entity.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    //Mostrar todo
    List<Cliente> findAll();
    //Mostrar todos los habilitados
    List<Cliente> findAllCustom();
    //buscar pòr nombre
    List<Cliente> findbyName();
    //buscar pòr codigo
    Optional<Cliente> findById(Long id);
    //agregar
    Cliente add(Cliente cl);
    //actualizar
    Cliente update(Cliente cl);
    //eliminar
    Cliente delete(Cliente cl);
}
