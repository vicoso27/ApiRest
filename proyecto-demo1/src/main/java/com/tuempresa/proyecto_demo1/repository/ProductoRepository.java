package com.tuempresa.proyecto_demo1.repository;
import com.tuempresa.proyecto_demo1.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}