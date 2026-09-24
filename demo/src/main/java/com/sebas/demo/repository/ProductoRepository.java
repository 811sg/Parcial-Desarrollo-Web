package com.sebas.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebas.demo.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long> {

}
