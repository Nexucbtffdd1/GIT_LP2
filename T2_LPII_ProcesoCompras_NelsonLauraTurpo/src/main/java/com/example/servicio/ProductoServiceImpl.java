package com.example.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.repositorio.IProductoRepository;
import com.example.modelo.Producto;

public class ProductoServiceImpl implements ProductoServicio{
	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public List<Producto> obtenerTodos() {		
		return productoRepository.findAll();
	}

	@Override
	public Producto obtenerPorId(Integer id) {
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	public void guardarProducto(Producto producto) {
		productoRepository.save(producto);
		
	}
}
