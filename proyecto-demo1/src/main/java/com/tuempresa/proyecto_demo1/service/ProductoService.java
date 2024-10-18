package com.tuempresa.proyecto_demo1.service;


import com.tuempresa.proyecto_demo1.Model.Producto;
import com.tuempresa.proyecto_demo1.Model.Producto;
import com.tuempresa.proyecto_demo1.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }
    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }
    public Optional<Producto> obtenerProductoPorId(Long id) {
        return productoRepository.findById(id);
    }
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}