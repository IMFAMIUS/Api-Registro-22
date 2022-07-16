package com.apiregistro2022.service;

import com.apiregistro2022.entity.Empleado;
import java.util.List;
import java.util.Optional;

public interface EmpleadoService {
    //Mostrar todo
    List<Empleado> findAll();
    //Mostrar todos los habilitados
    List<Empleado> findAllCustom();
    //buscar pòr nombre
    List<Empleado> findbyName();
    //buscar pòr codigo
    Optional<Empleado> findById(Long id);
    //agregar
    Empleado add(Empleado e);
    //actualizar
    Empleado update(Empleado e);
    //eliminar
    Empleado delete(Empleado e);
}
