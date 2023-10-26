package com.example.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.modelo.Compra;

public interface ICategoriaRepository extends JpaRepository <Compra, Integer>{

}
