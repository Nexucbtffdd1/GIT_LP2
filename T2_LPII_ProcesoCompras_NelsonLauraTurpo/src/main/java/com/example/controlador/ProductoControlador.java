package com.example.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.servicio.ProductoServicio;

public class ProductoControlador {

	@Controller
	public class ProductoController {
		
		@Autowired
		private ProductoServicio productoservicio;
		
		@GetMapping("/CatalogoProducto")
	    public String mostrarCatalogo(Model model) {
	        model.addAttribute("productos", productoservicio.obtenerTodos());
	        return "CatalogoProducto";
	    }
		
		

	}
}
