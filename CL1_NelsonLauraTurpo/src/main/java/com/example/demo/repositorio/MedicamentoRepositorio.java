package com.example.demo.repositorio;

import com.example.demo.modelo.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MedicamentoRepositorio extends JpaRepository  <Medicamento, Integer>{

}
