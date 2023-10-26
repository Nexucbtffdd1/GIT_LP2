package com.example.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modelo.Compra;
import com.example.repositorio.ICategoriaRepository;

@Service
public class CategoriaServicioImpl implements CategoriaServicio {
	
	@Autowired
	private ICategoriaRepository compraRepository;


	@Override
	public List<Compra> obtenerTodas() {
		return compraRepository.findAll();
	}

	@Override
	public Compra obtenerPorId(Integer id) {
		return compraRepository.findById(id).orElse(null);
	}

	@Override
	public void guardarCompra(Compra compra) {
		 compraRepository.save(compra);
		 
	} 
	@Override	 
    public void eliminarCompra() {
		compraRepository.deleteAll();
		 
	}

}
