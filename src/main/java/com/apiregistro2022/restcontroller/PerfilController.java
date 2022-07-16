package com.apiregistro2022.restcontroller;

import com.apiregistro2022.entity.Perfil;
import com.apiregistro2022.service.PerfilService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfil")
public class PerfilController {
    
    @Autowired
    private PerfilService perfilService;
    
    @GetMapping
    public List<Perfil> findAll(){
        return perfilService.findAll();
    }
    @GetMapping("/custom")
    public List<Perfil> findAllCustom(){
        return perfilService.findAllCustom();
    }  
    @GetMapping("/{id}")
    public Optional<Perfil> finById(@PathVariable Long id){
        return perfilService.findById(id);
    }
    @PostMapping
    public Perfil add(@RequestBody Perfil pe){
        return perfilService.add(pe);
    }  
    @PutMapping("/{id}")
    public Perfil update(@PathVariable Long id,@RequestBody Perfil pe){
        pe.setCodigo(id);
        return perfilService.update(pe);
    }
    @DeleteMapping("/{id}")
    public Perfil delete(@PathVariable Long id){
        Perfil objperfil= new Perfil();
        objperfil.setCodigo(id);
        return perfilService.delete(objperfil);
    }  
}
