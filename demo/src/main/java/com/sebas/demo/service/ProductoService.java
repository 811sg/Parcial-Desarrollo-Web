package com.sebas.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sebas.demo.model.Producto;
import com.sebas.demo.repository.ProductoRepository;

@Service 
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository usuaRepository){
        this.productoRepository = usuaRepository;
    }

    public List<Producto> listarTodos(){
        return productoRepository.findAll();
    }

    public Producto obtenerPorId(Long id) {
        return productoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + id));
    }

}
