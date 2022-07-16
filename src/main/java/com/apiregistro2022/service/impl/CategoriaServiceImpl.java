package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Categoria;
import com.apiregistro2022.repository.CategoriaRepository;
import com.apiregistro2022.service.CategoriaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Se agrega la anotacion que indica que es un servicio de Spring
@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired 
    private CategoriaRepository categoriaRepository;
    
    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public List<Categoria> findAllCustom() {
        return categoriaRepository.findAllCustom();
    }

    @Override
    public List<Categoria> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria add(Categoria ca) {
        return categoriaRepository.save(ca);
    }

    @Override
    public Categoria update(Categoria ca) {
        Categoria objcaCategoria=categoriaRepository.getById(ca.getCodigo());
        BeanUtils.copyProperties(ca, objcaCategoria);
        return categoriaRepository.save(objcaCategoria);
    }

    @Override
    public Categoria delete(Categoria ca) {
        Categoria objcaCategoria=categoriaRepository.getById(ca.getCodigo());
        objcaCategoria.setEstado(false);
        return categoriaRepository.save(objcaCategoria);
    }
    
}
