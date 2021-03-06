package com.apiregistro2022.repository;

import com.apiregistro2022.entity.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    @Query("select pr from Producto pr where pr.estado='1'")
    List<Producto> findAllCustom();
}
