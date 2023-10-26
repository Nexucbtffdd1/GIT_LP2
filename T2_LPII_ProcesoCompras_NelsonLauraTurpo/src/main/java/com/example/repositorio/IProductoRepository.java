package com.example.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelo.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
