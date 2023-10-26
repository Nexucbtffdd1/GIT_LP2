package com.example.servicio;

import java.util.List;

import com.example.modelo.Producto;

public interface ProductoServicio {
	
		 List<Producto> obtenerTodos();
		 Producto obtenerPorId(Integer id);
		 void guardarProducto(Producto producto);
}
