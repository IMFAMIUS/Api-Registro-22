package com.apiregistro2022.service.impl;

import com.apiregistro2022.entity.Producto;
import com.apiregistro2022.repository.ProductoRepository;
import com.apiregistro2022.service.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{
    
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public List<Producto> findAllCustom() {
        return productoRepository.findAllCustom();
    }

    @Override
    public List<Producto> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto add(Producto pr) {
        return productoRepository.save(pr);
    }

    @Override
    public Producto update(Producto pr) {
        Producto objproducto=productoRepository.getById(pr.getCodigo());
        BeanUtils.copyProperties(pr, objproducto);
        return productoRepository.save(objproducto);
    }

    @Override
    public Producto delete(Producto pr){
        Producto objproducto=productoRepository.getById(pr.getCodigo());
        objproducto.setEstado(false);
        return productoRepository.save(objproducto);
    }
}
