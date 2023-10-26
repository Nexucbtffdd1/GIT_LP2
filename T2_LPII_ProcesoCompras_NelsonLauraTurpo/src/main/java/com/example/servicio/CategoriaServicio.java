package com.example.servicio;

import java.util.List;

import com.example.modelo.Compra;

public interface CategoriaServicio {

	List<Compra> obtenerTodas();
	Compra obtenerPorId(Integer id);
	void guardarCompra(Compra compra);
	void eliminarCompra();
}
